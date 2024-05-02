package ar.edu.unlp.info.oo2.Ejercicio10_OO2;

public class RSA implements Strategy{
	
	public RSA() {
		
	}
	
	public String encriptar(String msj) {
		return (msj + " encriptado con RSA.");
	}
}
