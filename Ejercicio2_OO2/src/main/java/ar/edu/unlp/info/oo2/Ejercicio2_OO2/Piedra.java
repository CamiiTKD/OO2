package ar.edu.unlp.info.oo2.Ejercicio2_OO2;

public class Piedra {
	
	public Piedra() {
		
	}
	
	public String juegaContra(Jugada unaJugada) {
		return unaJugada.juegaContraPiedra();
	}
	
	public String juegaContraPiedra() {
		return "Empate";
	}
	
	public String juegaContraPapel() {
		return "Papel";
	}

	public String juegaContraTijera() {
		return "Piedra";
	}
	
	public String juegaContraLagarto() {
		return "Piedra";
	}
	
	public String juegaContraSpock() {
		return "Spock";
	}
}