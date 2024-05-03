package ar.edu.unlp.info.oo2.Ejercicio4_OO2;

public class Temporario extends Asalariado {
	private int horas;
	private boolean casado;
	private int hijos;
	
	public Temporario(boolean estaCasado, int cantHijos, int cantHoras) {
		this.casado = estaCasado;
		this.hijos = cantHijos;
		this.horas = cantHoras;
	}
	
	protected double basico() {
		return 20000 + (this.horas * 300);
	}
	
	protected double adicional() {
		double extra = 0;
		if (this.casado) {
			extra = 5000;
		}
		return extra + this.hijos * 2000;
	}
}