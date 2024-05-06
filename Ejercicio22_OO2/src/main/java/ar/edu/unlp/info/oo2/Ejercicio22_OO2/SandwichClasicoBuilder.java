package ar.edu.unlp.info.oo2.Ejercicio22_OO2;

public class SandwichClasicoBuilder extends SandwichBuilder {
	
	public void buildPan() {
		this.sandwich.setPan(100);
	}
	
	public void buildAderezo() {
		this.sandwich.setAderezo(20);
	}
	
	public void buildPrincipal() {
		this.sandwich.setPrincipal(300);
	}
	
	public void buildAdicional() {
		this.sandwich.setAdicional(80);
	}
}