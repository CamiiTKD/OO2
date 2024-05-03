package ar.edu.unlp.info.oo2.Ejercicio4_OO2;

public class Planta extends Asalariado {
	private boolean casado;
	private int hijos;
	private int antiguedad;
	
	public Planta(boolean estaCasado, int cantHijos, int aniosAntiguedad) {
		this.casado = estaCasado;
		this.hijos = cantHijos;
		this.antiguedad = aniosAntiguedad;
	}
	
	protected double basico() {
		return 50000;
	}
	
	protected double adicional() {
		double extra = 0;
		if (this.casado) {
			extra = 5000;
		}
		return extra + this.hijos * 2000 + this.antiguedad * 2000;
	}
}