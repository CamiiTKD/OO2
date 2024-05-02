package ar.edu.unlp.info.oo2.Ejercicio9_OO2;

public class Definitiva extends State {
	
	@Override
	public String obtenerInformacion() {
		String st = super.obtenerInformacion();
		if (this.getExcursion().faltantesMax() < 0) {
			return (st + this.getExcursion().infoEmails() + " cantidad de usuarios faltantes: " + super.getExcursion().faltantesMax()); 
		}
		return st;
	}
}