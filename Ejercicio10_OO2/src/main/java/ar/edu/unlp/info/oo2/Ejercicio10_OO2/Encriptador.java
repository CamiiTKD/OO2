package ar.edu.unlp.info.oo2.Ejercicio10_OO2;

public class Encriptador {
	private Strategy estrategia;
	
	public Encriptador(Strategy e) {
		this.estrategia = e;
	}
	
	public String encriptar(String msj) {
		return this.estrategia.encriptar(msj);
	}
}