package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

public class ArmaArco implements Arma {
	
	public String getType() {
		return "Arco";
	}
	
	public int calcularDanio(String tipoArmadura) {
		if(tipoArmadura.equals("Armadura de Cuero")) {
			return 5;
		}
		if(tipoArmadura.equals("Armadura de Hierro")) {
			return 3;
		}
		return 2;
	}
}