package ar.edu.unlp.info.oo2.Ejercicio4_OO2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemporarioTest {
	private Temporario temporarioCasado;
	private Temporario temporarioConHijos;
	private Temporario temporario1;
	private Temporario temporario2;
	
	@BeforeEach
	void setUp() {
		temporarioCasado = new Temporario(true, 0, 5);
		temporarioConHijos = new Temporario(false, 3, 10);
		temporario1 = new Temporario(true, 2, 20);
		temporario2 = new Temporario(false, 0, 10);
	}
	
	@Test
	void sueldoCasadoTest() {
		assertEquals(23455d, temporarioCasado.Sueldo()); 
	}
	
	@Test
	void sueldoConHijosTest() {
		assertEquals(25710d, temporarioConHijos.Sueldo());
	}
	
	@Test
	void sueldoTest() {
		assertEquals(31170d, temporario1.Sueldo());
		assertEquals(20010d, temporario2.Sueldo());
	}
}