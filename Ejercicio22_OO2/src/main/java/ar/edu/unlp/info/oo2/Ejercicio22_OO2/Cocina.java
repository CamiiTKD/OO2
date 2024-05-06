package ar.edu.unlp.info.oo2.Ejercicio22_OO2;

public class Cocina {
	private SandwichBuilder builder;
	
	public Cocina(SandwichBuilder builder) {
		this.builder = builder;
	}
	
	public void setSandwichBuilder(SandwichBuilder builder) {
		this.builder = builder;
	}
	
	public Sandwich getSandwich() {
		return this.builder.getSandwich();
	}
	
	public void prepararSandwich() {
		this.builder.reset();
		this.builder.buildPan();
		this.builder.buildAderezo();
		this.builder.buildPrincipal();
		this.builder.buildAdicional();
	}
}