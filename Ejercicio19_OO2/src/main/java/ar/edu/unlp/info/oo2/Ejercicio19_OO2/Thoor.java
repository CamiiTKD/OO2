package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

import java.util.List;

public class Thoor extends Personaje {
	
	public Thoor(String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre, armadura, arma, habilidades);
	}
	
	public String getType() {
		return "Thoor";
	}
}