package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

import java.util.List;

public class Guerrero extends Personaje {
	
	public Guerrero(String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		super(nombre, armadura, arma, habilidades);
	}
	
	public String getType() {
		return "Guerrero";
	}
}