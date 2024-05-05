package ar.edu.unlp.info.oo2.Ejercicio21_OO2;

public class NullObject implements Obtenible {
	
	public Obtenible getMadre() {
		return new NullObject();
	}
	
	public Obtenible getPadre() {
		return new NullObject();
	}
	
	public boolean tieneComoAncestroA(Obtenible ancestro) {
		return false;
	}
}