package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

import java.util.ArrayList;
import java.util.List;

public class CreadorArquero implements PersonajeFactory {
	
	public Personaje crearPersonaje() {
		List<Habilidad> l = new ArrayList<>();
		l.add(new HabilidadCombateADistancia());
		return new Arquero("Ashe", new ArmaduraCuero(), new ArmaArco(), l);
	}
}