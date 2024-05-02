package ar.edu.unlp.info.oo2.Ejercicio4_OO2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasanteTest {
	private Pasante pasanteConExamenes;
	private Pasante pasanteSinExamenes;
	
	@BeforeEach
	void setUp() {
		pasanteConExamenes = new Pasante(20);
		pasanteSinExamenes= new Pasante(0);
	}	
	
	@Test
	void sueldoConExamenesTest() {
		assertEquals(55400d, pasanteConExamenes.Sueldo());
	}
	
	@Test
	void sueldoSinExamenesTest() {
		assertEquals(17400d, pasanteSinExamenes.Sueldo());
	}
}