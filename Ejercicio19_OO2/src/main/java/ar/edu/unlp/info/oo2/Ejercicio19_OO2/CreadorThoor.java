package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

import java.util.ArrayList;
import java.util.List;

public class CreadorThoor implements PersonajeFactory {
	
	public Personaje crearPersonaje() {
		List<Habilidad> l = new ArrayList<>();
		l.add(new HabilidadCombateADistancia());
		l.add(new HabilidadLanzarRayos());
		return new Thoor("Thoor", new ArmaduraHierro(), new ArmaMartillo(), l);
	}
}