package ar.edu.unlp.info.oo2.Ejercicio10_OO2;

public class Conexion {
	private Encriptador encriptador;
	
	public Conexion(Encriptador e) {
		this.encriptador = e;
	}
	
	public void enviar(String msj) {
		System.out.println(msj);
	}

	public Encriptador getEncriptador() {
		return encriptador;
	}
}
