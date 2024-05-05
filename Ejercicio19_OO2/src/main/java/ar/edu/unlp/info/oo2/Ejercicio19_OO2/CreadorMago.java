package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

import java.util.ArrayList;
import java.util.List;

public class CreadorMago implements PersonajeFactory {
	
	public Personaje crearPersonaje() {
		List<Habilidad> l = new ArrayList<>();
		l.add(new HabilidadCombateADistancia());
		l.add(new HabilidadMagia());
		return new Mago("Ahri", new ArmaduraCuero(), new ArmaBaston(), l);
	}
}