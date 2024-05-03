package ar.edu.unlp.info.oo2.Ejercicio6_OO2;

public class Agua extends Topografia {
	
	public Agua() {
		
	}
	
	public double proporcionAgua() {
		return 1;
	}
	
	public boolean esIgual(Topografia topografia) {
		return topografia.compararContraSimple(1);
	}
	
	public boolean compararContraSimple(double num) {
		return (this.proporcionAgua() == num);
	}
	
	public boolean compararContraMixta(Mixta topografia) {
		return false;
	}
}