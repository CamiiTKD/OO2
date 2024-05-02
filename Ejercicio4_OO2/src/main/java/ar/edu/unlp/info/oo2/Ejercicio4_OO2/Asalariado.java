package ar.edu.unlp.info.oo2.Ejercicio4_OO2;

public abstract class Asalariado {
	
	public double Sueldo() {
		double basico = basico();
		double adicional = adicional();
		return basico + adicional - descuento(basico, adicional);
	}
	
	private double descuento(double basico, double adicional) {
		return basico * 0.13 + adicional * 0.05;
	}
	
	protected abstract double basico();
	protected abstract double adicional();
}