package ar.edu.unlp.info.oo2.Ejercicio9_OO2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;	
	private LocalDate fechaInicial;
	private LocalDate fechaFinal;
	private String pntEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private State estado;
	private List<Usuario> inscriptos;
	private List<Usuario> pendientes;
	
	public Excursion(String n, LocalDate i, LocalDate f, String pnt, double c, int min, int max) {
		this.nombre = n;
		this.fechaInicial = i;
		this.fechaFinal = f;
		this.pntEncuentro = pnt;
		this.costo = c;
		this.cupoMinimo = min;
		this.cupoMaximo = max;
		this.setState(new Provisoria());
		this.inscriptos = new ArrayList<>();
		this.pendientes = new ArrayList<>();
	}
	
	public void setState(State estado) {
		this.estado.setExcursion(this);
	}

	public State getState() {
		return this.estado;
	}
	
	public void inscribir(Usuario user) {
		if(this.inscriptos != null) {
			if(this.inscriptos.size() < this.cupoMaximo) {
				this.inscriptos.add(user);
				if(this.inscriptos.size() == this.cupoMinimo) {
					this.setState(new Definitiva());
				}
			}
			else {
				this.pendientes.add(user);
			}
		}
		else {
			this.inscriptos.add(user);
		}
	}
	
	public int faltantesMin() {
		int num = (this.cupoMinimo - this.inscriptos.size());
		if(num < 0) {
			return num;
		}
		return 0;
	}
	
	public int faltantesMax() {
		int num = (this.cupoMaximo - this.inscriptos.size());
		if(num < 0) {
			return num;
		}
		return 0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicial() {
		return fechaInicial;
	}

	public LocalDate getFechaFinal() {
		return fechaFinal;
	}

	public String getPntEncuentro() {
		return pntEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}
	
	public String infoEmails() {
		String st = null;
		for(Usuario u : this.inscriptos){
			st += "Email: " + u.getEmail() + ", ";
		}
		return st;
	}
}