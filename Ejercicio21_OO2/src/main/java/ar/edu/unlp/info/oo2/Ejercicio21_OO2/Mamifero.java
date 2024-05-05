package ar.edu.unlp.info.oo2.Ejercicio21_OO2;

import java.time.LocalDate;

public class Mamifero implements Obtenible{
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Obtenible padre;
	private Obtenible madre;
	
	public Mamifero(String identificador, String especie, LocalDate fechaNacimiento, Obtenible padre, Obtenible madre) {
		this.setIdentificador(identificador);
		this.setEspecie(especie);
		this.setFechaNacimiento(fechaNacimiento);
		this.setPadre(padre);
		this.setMadre(madre);
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Obtenible getPadre() {
		return padre;
	}

	public void setPadre(Obtenible padre) {
		this.padre = padre;
	}

	public Obtenible getMadre() {
		return madre;
	}

	public void setMadre(Obtenible madre) {
		this.madre = madre;
	}
	
	public Obtenible getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public Obtenible getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	
	public Obtenible getAbueloMaterno() {
		return this.madre.getPadre();
	}
	
	public Obtenible getAbuelaMaterna() {
		return this.madre.getMadre();
	}
	
	public boolean tieneComoAncestroA(Obtenible ancestro) {
		if(this.getPadre().equals(ancestro) || this.getMadre().equals(ancestro)) {
			return true;
		}
		return (this.getPadre().tieneComoAncestroA(ancestro) || this.getMadre().tieneComoAncestroA(ancestro));
	}
	
}