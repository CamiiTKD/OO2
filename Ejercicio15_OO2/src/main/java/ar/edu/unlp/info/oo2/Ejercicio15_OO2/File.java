package ar.edu.unlp.info.oo2.Ejercicio15_OO2;

import java.time.LocalDate;

public class File extends FileOO2 {
	
	public File(String nombre, String extension, double tamaño, LocalDate fechaC, LocalDate fechaM, String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamaño = tamaño;
		this.fechaCreacion = fechaC;
		this.fechaModificacion = fechaM;
		this.permisos = permisos;
	}
	
	public String prettyPrint() {
		return "";
	}
}