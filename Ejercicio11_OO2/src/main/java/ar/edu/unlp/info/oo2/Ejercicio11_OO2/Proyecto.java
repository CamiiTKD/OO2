package ar.edu.unlp.info.oo2.Ejercicio11_OO2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private double margen;
	private int cantIntegrantes;
	private double monto;
	private State estado;
	
	public Proyecto(LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int cant, double monto) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.margen = 7;
		this.cantIntegrantes = cant;
		this.monto = monto;
		this.setState(new EnConstruccion());
	}
	
	public void setState(State estado) {
		this.estado = estado;
		this.estado.setProyecto(this);
	}
	
	public void aprobarEtapa() {
		this.estado.aprobarEtapa();
	}
	
	public double costoProyecto() {
		return this.estado.costoProyecto();
	}
	
	public double precioProyecto() {
		return this.estado.precioProyecto();
	}
	
	public void cancelarProyecto() {
		this.estado.cancelarProyecto();
	}
	
	public String msjCancelacion() {
		return this.objetivo + " (Cancelado)";
	}
	
	public void setObjetivo(String msj) {
		this.objetivo = msj;
	}
	
	public int calcularDias() {
		return (int)ChronoUnit.DAYS.between(fechaInicio, fechaFin);
	}

	public int getCantIntegrantes() {
		return cantIntegrantes;
	}

	public double getMonto() {
		return monto;
	}

	public double getMargen() {
		return margen;
	}
	
	public void setMargen(double margen) {
		this.margen = margen;
	}
}
