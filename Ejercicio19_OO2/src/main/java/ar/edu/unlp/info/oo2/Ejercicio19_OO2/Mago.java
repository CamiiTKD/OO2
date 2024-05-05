package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

import java.util.List;

public class Mago extends Personaje {
	
	public Mago(String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre, armadura, arma, habilidades);
	}
	
	public String getType() {
		return "Mago";
	}
}