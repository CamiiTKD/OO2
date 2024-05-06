package ar.edu.unlp.info.oo2.Ejercicio22_OO2;

public class SandwichVegetarianoBuilder extends SandwichBuilder {
	
	public void buildPan() {
		this.sandwich.setPan(120);
	}
	
	public void buildAderezo() {
		this.sandwich.setAderezo(0);
	}
	
	public void buildPrincipal() {
		this.sandwich.setPrincipal(200);
	}
	
	public void buildAdicional() {
		this.sandwich.setAdicional(100);
	}
}