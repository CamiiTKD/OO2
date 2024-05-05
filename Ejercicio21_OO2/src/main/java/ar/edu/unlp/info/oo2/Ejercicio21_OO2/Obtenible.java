package ar.edu.unlp.info.oo2.Ejercicio21_OO2;

public interface Obtenible {
	
	public Obtenible getMadre();
	public Obtenible getPadre();
	public boolean tieneComoAncestroA(Obtenible ancestro);
	
}