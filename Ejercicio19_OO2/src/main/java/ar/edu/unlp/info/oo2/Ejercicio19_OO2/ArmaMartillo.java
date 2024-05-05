package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

public class ArmaMartillo implements Arma {
	
	public String getType() {
		return "Martillo";
	}
	
	public int calcularDanio(String tipoArmadura) {
		if(tipoArmadura.equals("Armadura de Cuero")) {
			return 6;
		}
		if(tipoArmadura.equals("Armadura de Hierro")) {
			return 4;
		}
		return 2;
	}
}