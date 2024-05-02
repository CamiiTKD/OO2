package ar.edu.unlp.info.oo2.Ejercicio9_OO2;

public class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario(String n, String a, String e) {
		this.nombre = n;
		this.apellido = a;
		this.email = e;
	}

	public String getEmail() {
		return email;
	}
}