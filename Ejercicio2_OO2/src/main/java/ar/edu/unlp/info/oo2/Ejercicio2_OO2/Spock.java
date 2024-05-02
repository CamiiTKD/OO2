package ar.edu.unlp.info.oo2.Ejercicio2_OO2;

public class Spock {
	
	public Spock() {
		
	}
	
	public String juegaContra(Jugada unaJugada) {
		return unaJugada.juegaContraPiedra();
	}
	
	public String juegaContraPiedra() {
		return "Spock";
	}
	
	public String juegaContraPapel() {
		return "Papel";
	}

	public String juegaContraTijera() {
		return "Spock";
	}
	
	public String juegaContraLagarto() {
		return "Lagarto";
	}
	
	public String juegaContraSpock() {
		return "Empate";
	}
}