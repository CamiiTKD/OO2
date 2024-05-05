package ar.edu.unlp.info.oo2.Ejercicio21_OO2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest{
	private Mamifero mamifero;
	private Obtenible abuela;
	private Obtenible padre;
	
	@BeforeEach
	void setUp() throws Exception {
		abuela = new Mamifero("abuelaMamifero", "Caballo", LocalDate.of(1980, 8, 10), new NullObject(), new NullObject());
		Obtenible madre = new Mamifero("madreMamifero", "Caballo", LocalDate.of(2000, 10, 20), new NullObject(), abuela);
		padre = new Mamifero("padreMamifero", "Burro", LocalDate.of(1999, 4, 12), new NullObject(), new NullObject());
		this.mamifero = new Mamifero("hijo", "Asno", LocalDate.of(2010, 6, 30), padre, madre);
	}
	
	@Test
	void testTieneComoAncestroA() {
		assertEquals(false, this.mamifero.tieneComoAncestroA(new Mamifero("tioRaro", "Unicornio", LocalDate.of(2000, 10, 10), new NullObject(), new NullObject())));
		assertEquals(true, this.mamifero.tieneComoAncestroA(abuela));
	}
	
	@Test
	void testGetPadre() {
		assertEquals(padre, this.mamifero.getPadre());
		Obtenible objeto = this.abuela.getPadre();
		assertTrue(objeto instanceof NullObject);
	}
}