package ar.edu.unlp.info.oo2.Ejercicio6_OO2;

public class Tierra extends Topografia{
	
	public Tierra() {
		
	}
	
	public double proporcionAgua() {
		return 0;
	}
	
	public boolean esIgual(Topografia topografia) {
		return topografia.compararContraSimple(0);
	}
	
	public boolean compararContraSimple(double num) {
		return (this.proporcionAgua() == num);
	}
	
	public boolean compararContraMixta(Mixta topografia) {
		return false;
	}
}