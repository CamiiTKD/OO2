package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

import java.util.ArrayList;
import java.util.List;

public class CreadorGuerrero implements PersonajeFactory {
	
	public Personaje crearPersonaje() {
		List<Habilidad> l = new ArrayList<>();
		l.add(new HabilidadCombateCuerpoACuerpo());
		return new Guerrero("Yone", new ArmaduraAcero(), new ArmaEspada(), l);
	}
}