package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	Biblioteca b;
	@BeforeEach
	void setupUp(){
		b = new Biblioteca();
	}
	@Test
	void testSinSocios() {
		assertEquals("[]", b.exportarSocios());
	}
	@Test
	void test1Socios() {
		b.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		String testString = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	}\n"
				+ "]".replace("\n", "\t");
		assertEquals(testString, b.exportarSocios());
	}
	@Test
	void test2Socios() {
		assertEquals("[]", b.exportarSocios());
	}
}
