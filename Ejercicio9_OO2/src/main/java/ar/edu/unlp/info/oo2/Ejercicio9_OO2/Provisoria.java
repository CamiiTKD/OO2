package ar.edu.unlp.info.oo2.Ejercicio9_OO2;

public class Provisoria extends State {
	
	@Override
	public String obtenerInformacion() {
		return (super.obtenerInformacion() + ", cantidad de usuarios faltantes: " + super.getExcursion().faltantesMin());
	}
}