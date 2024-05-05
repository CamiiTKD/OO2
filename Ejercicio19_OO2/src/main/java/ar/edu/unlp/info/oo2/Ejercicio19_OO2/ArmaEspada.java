package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

public class ArmaEspada implements Arma {
	
	public String getType() {
		return "Espada";
	}
	
	public int calcularDanio(String tipoArmadura) {
		if(tipoArmadura.equals("Armadura de Cuero")) {
			return 8;
		}
		if(tipoArmadura.equals("Armadura de Hierro")) {
			return 5;
		}
		return 3;
	}
}