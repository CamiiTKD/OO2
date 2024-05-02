package ar.edu.unlp.info.oo2.Ejercicio2_OO2;

public class Lagarto {
	
	public Lagarto() {
		
	}
	
	public String juegaContra(Jugada unaJugada) {
		return unaJugada.juegaContraPiedra();
	}
	
	public String juegaContraPiedra() {
		return "Piedra";
	}
	
	public String juegaContraPapel() {
		return "Lagarto";
	}

	public String juegaContraTijera() {
		return "Tijera";
	}
	
	public String juegaContraLagarto() {
		return "Empate";
	}
	
	public String juegaContraSpock() {
		return "Lagarto";
	}
}