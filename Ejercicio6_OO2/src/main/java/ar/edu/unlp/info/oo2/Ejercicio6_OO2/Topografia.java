package ar.edu.unlp.info.oo2.Ejercicio6_OO2;

public abstract class Topografia {
	
	public double proporcionTierra() {
		return (1 - this.proporcionAgua());
	}
	@Override
	public boolean equals(Object obj) {
		return this.esIgual((Topografia)obj);
	}
	public abstract double proporcionAgua();
	public abstract boolean esIgual(Topografia topografia);
	public abstract boolean compararContraSimple(double num);
	public abstract boolean compararContraMixta(Mixta topografia);
	
	// faltan test y corregir el método equals
}