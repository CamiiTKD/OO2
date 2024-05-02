package ar.edu.unlp.info.oo2.Ejercicio15_OO2;

import java.time.LocalDate;

public abstract class FileOO2 {
	protected String nombre;
	protected String extension;
	protected double tamaño;
	protected LocalDate fechaCreacion;
	protected LocalDate fechaModificacion;
	protected String permisos;
	
	public abstract String prettyPrint();

	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public String getTamaño() {
		return Double.toString(tamaño);
	}
	
	public String getFechaCreacion() {
		return fechaCreacion.toString();
	}

	public String getFechaModificacion() {
		return fechaModificacion.toString();
	}

	public String getPermisos() {
		return permisos;
	}
}