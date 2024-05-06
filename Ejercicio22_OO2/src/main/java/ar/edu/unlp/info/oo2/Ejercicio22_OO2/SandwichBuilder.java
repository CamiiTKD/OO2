package ar.edu.unlp.info.oo2.Ejercicio22_OO2;

public abstract class SandwichBuilder {
	protected Sandwich sandwich;
	
	public void reset() {
		this.sandwich = new Sandwich();
	}
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}
	
	public abstract void buildPan();
	public abstract void buildAderezo();
	public abstract void buildPrincipal();
	public abstract void buildAdicional();
}