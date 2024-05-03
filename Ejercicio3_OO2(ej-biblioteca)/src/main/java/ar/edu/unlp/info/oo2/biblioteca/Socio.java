package ar.edu.unlp.info.oo2.biblioteca;

public class Socio {
	private String nombre;
	private String email;
	private String nroLegajo;


	public Socio(String nombre, String email, String legajo) {
		this.nombre = nombre;
		this.email = email;
		this.nroLegajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLegajo() {
		return nroLegajo;
	}
	public void setLegajo(String legajo) {
		this.nroLegajo = legajo;
	}
}
