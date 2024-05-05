package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

public class ArmaBaston implements Arma {
	
	public String getType() {
		return "Baston";
	}
	
	public int calcularDanio(String tipoArmadura) {
		if(tipoArmadura.equals("Armadura de Cuero")) {
			return 2;
		}
		if(tipoArmadura.equals("Armadura de Hierro")) {
			return 1;
		}
		return 1;
	}
}