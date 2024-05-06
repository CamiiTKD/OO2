package ar.edu.unlp.info.oo2.Ejercicio22_OO2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CocinaTest {
	private Cocina cocina;
	
	@BeforeEach
	void setUp() throws Exception {
		SandwichBuilder clasicoBuilder = new SandwichClasicoBuilder();
		cocina = new Cocina(clasicoBuilder);
	}
	
	@Test
	void buildSangucheClasicoTest() {
		cocina.prepararSandwich();
		assertEquals(500d, cocina.getSandwich().calcularPrecio());
	}
	
	@Test
	void buildSangucheVegetarianoTest() {
		SandwichBuilder vegetarianoBuilder = new SandwichVegetarianoBuilder();
		cocina.setSandwichBuilder(vegetarianoBuilder);
		cocina.prepararSandwich();
		assertEquals(420d, cocina.getSandwich().calcularPrecio());
	}
	
	@Test
	void buildSangucheVeganoTest() {
		SandwichBuilder veganoBuilder = new SandwichVeganoBuilder();
		cocina.setSandwichBuilder(veganoBuilder);
		cocina.prepararSandwich();
		assertEquals(620d, cocina.getSandwich().calcularPrecio());
	}
	
	@Test
	void buildSangucheSinTaccTest() {
		SandwichBuilder sinTaccBuilder = new SandwichSinTaccBuilder();
		cocina.setSandwichBuilder(sinTaccBuilder);
		cocina.prepararSandwich();
		assertEquals(618d, cocina.getSandwich().calcularPrecio());
	}
	
}