package ar.edu.unlp.info.oo2.Ejercicio10_OO2;

public class RC4 implements Strategy{
	
	public RC4() {
		
	}
	
	public String encriptar(String msj) {
		return (msj + " encriptado con RC4.");
	}
}