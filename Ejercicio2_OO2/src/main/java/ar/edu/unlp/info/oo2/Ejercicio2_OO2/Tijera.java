package ar.edu.unlp.info.oo2.Ejercicio2_OO2;

public class Tijera {
	
	public Tijera() {
		
	}
	
	public String juegaContra(Jugada unaJugada) {
		return unaJugada.juegaContraTijera();
	}
	
	public String juegaContraPiedra() {
		return "Piedra";
	}
	
	public String juegaContraPapel() {
		return "Tijera";
	}

	public String juegaContraTijera() {
		return "Empate";
	}
	
	public String juegaContraLagarto() {
		return "Tijera";
	}
	
	public String juegaContraSpock() {
		return "Spock";
	}
}