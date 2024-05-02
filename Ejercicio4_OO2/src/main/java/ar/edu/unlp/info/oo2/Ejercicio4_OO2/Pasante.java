package ar.edu.unlp.info.oo2.Ejercicio4_OO2;

public class Pasante extends Asalariado {
	private int examenes;
	
	public Pasante(int cantExamenes) {
		this.examenes = cantExamenes;
	}
	
	protected double basico() {
		return 20000;
	}
	
	protected double adicional() {
		return this.examenes * 2000;
	}
}