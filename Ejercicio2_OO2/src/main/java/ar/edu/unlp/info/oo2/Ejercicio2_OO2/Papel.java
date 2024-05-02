package ar.edu.unlp.info.oo2.Ejercicio2_OO2;

public class Papel {
	
	public Papel() {
		
	}
	
	public String juegaContra(Jugada unaJugada) {
		return unaJugada.juegaContraPapel();
	}
	
	public String juegaContraPiedra() {
		return "Papel";
	}
	
	public String juegaContraPapel() {
		return "Empate";
	}

	public String juegaContraTijera() {
		return "Tijera";
	}
	
	public String juegaContraLagarto() {
		return "Lagarto";
	}
	
	public String juegaContraSpock() {
		return "Papel";
	}
}