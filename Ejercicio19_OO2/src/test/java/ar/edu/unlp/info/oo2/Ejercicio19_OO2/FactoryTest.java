package ar.edu.unlp.info.oo2.Ejercicio19_OO2;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactoryTest {
	private PersonajeFactory creadorArquero;
	private PersonajeFactory creadorGuerrero;
	private PersonajeFactory creadorMago;
	private PersonajeFactory creadorThoor;
	private Personaje mago;
	private Personaje arquero;
	private Personaje guerrero;
	private Personaje thoor;

	@BeforeEach
	void setUp() throws Exception {
		creadorArquero = new CreadorArquero();
		arquero = creadorArquero.crearPersonaje();
		creadorGuerrero = new CreadorGuerrero();
		guerrero = creadorGuerrero.crearPersonaje();
		creadorMago = new CreadorMago();
		mago = creadorMago.crearPersonaje();
		creadorThoor = new CreadorThoor();
		thoor = creadorThoor.crearPersonaje();
	}

	@Test
	void testCrearPersonaje() {
		assertEquals("Soy el Mago Ahri y me queda 100 de vida.",mago.toString());
		assertEquals("Soy el Guerrero Yone y me queda 100 de vida.",guerrero.toString());
		assertEquals("Soy el Arquero Ashe y me queda 100 de vida.",arquero.toString());
		assertEquals("Soy el Thoor Thoor y me queda 100 de vida.",thoor.toString());
	}
	
	@Test
	void testAtacarGuerrero() {
		guerrero.atacar(mago); //8 de vida tiene armadura de cuero
		assertEquals("Soy el Mago Ahri y me queda 92 de vida.",mago.toString());
		guerrero.atacar(guerrero); //3 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Yone y me queda 97 de vida.",guerrero.toString());
		guerrero.atacar(thoor); //5 de vida armadura de hierro
		assertEquals("Soy el Thoor Thoor y me queda 95 de vida.",thoor.toString());
	}
	
	@Test
	void testAtacarArquero() {
		arquero.atacar(guerrero); //2 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Yone y me queda 98 de vida.",guerrero.toString());
		arquero.atacar(mago); //5 de vida tiene armadura de cuero
		assertEquals("Soy el Mago Ahri y me queda 95 de vida.",mago.toString());
		arquero.atacar(thoor); //3 de vida tiene armadura de hierro
		assertEquals("Soy el Thoor Thoor y me queda 97 de vida.",thoor.toString());
	}
	
	@Test
	void testAtacarMago() {
		mago.atacar(arquero); //2 de vida tiene armadura de cuero
		assertEquals("Soy el Arquero Ashe y me queda 98 de vida.",arquero.toString());
		mago.atacar(guerrero); //1 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Yone y me queda 99 de vida.",guerrero.toString());
		mago.atacar(thoor); //1 de vida tiene armadura de hierro
		assertEquals("Soy el Thoor Thoor y me queda 99 de vida.",thoor.toString());
	}
	
	@Test
	void testAtacarThoor() {
		thoor.atacar(arquero); //6 de vida tiene armadura de cuero
		assertEquals("Soy el Arquero Ashe y me queda 94 de vida.",arquero.toString());
		thoor.atacar(guerrero); //2 de vida tiene armadura de acero
		assertEquals("Soy el Guerrero Yone y me queda 98 de vida.",guerrero.toString());
		thoor.atacar(thoor); //4 de vida tiene armadura de hierro
		assertEquals("Soy el Thoor Thoor y me queda 96 de vida.",thoor.toString());
	}
	


}