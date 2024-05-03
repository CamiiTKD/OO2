package ar.edu.unlp.info.oo2.Ejercicio6_OO2;

public class Pantano extends Topografia {
	
	public Pantano() {
		
	}
	
	public double proporcionAgua() {
		return 0.7;
	}
	
	public boolean esIgual(Topografia topografia) {
		return topografia.compararContraSimple(0.7);
	}
	
	public boolean compararContraSimple(double num) {
		return (this.proporcionAgua() == num);
	}
	
	public boolean compararContraMixta(Mixta topografia) {
		return false;
	}
}