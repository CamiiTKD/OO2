package ar.edu.unlp.info.oo2.Ejercicio4_OO2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlantaTest {
	private Planta plantaCasado;
	private Planta plantaConHijos;
	private Planta planta1;
	private Planta planta2;
	
	@BeforeEach
	void setUp() {
		plantaCasado = new Planta(true, 0, 5);
		plantaConHijos = new Planta(false, 3, 10);
		planta1 = new Planta(true, 2, 20);
		planta2 = new Planta(false, 0, 0);
	}
	
	@Test
	void sueldoCasadoTest() {
		assertEquals(57750d, plantaCasado.Sueldo());
	}
	
	@Test
	void sueldoConHijosTest() {
		assertEquals(68200d, plantaConHijos.Sueldo());
	}
	
	@Test
	void sueldoTest() {
		assertEquals(90050d, planta1.Sueldo());
		assertEquals(43500d, planta2.Sueldo());
	}
}