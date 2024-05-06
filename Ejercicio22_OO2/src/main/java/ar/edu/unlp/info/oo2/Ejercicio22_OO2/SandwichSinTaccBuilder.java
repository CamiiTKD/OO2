package ar.edu.unlp.info.oo2.Ejercicio22_OO2;

public class SandwichSinTaccBuilder extends SandwichBuilder {
	
	public void buildPan() {
		this.sandwich.setPan(150);
	}
	
	public void buildAderezo() {
		this.sandwich.setAderezo(18);
	}
	
	public void buildPrincipal() {
		this.sandwich.setPrincipal(250);
	}
	
	public void buildAdicional() {
		this.sandwich.setAdicional(200);
	}
}