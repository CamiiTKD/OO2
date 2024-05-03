package ar.edu.unlp.info.oo2.Ejercicio10_OO2;

public class Blowfish implements Strategy{
	
	public Blowfish() {
		
	}
	
	public String encriptar(String msj) {
		return (msj + " encriptado con Blowfish.");
	}
}