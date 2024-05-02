package ar.edu.unlp.info.oo2.Ejercicio10_OO2;

public class Mensajero {
	private Conexion conexion;
	
	public Mensajero(Conexion c) {
		this.conexion = c;
	}
	
	public void enviar(String msj) {
		this.conexion.enviar(msj);
	}
}
