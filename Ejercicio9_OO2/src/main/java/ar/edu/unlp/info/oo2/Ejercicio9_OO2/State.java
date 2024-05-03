package ar.edu.unlp.info.oo2.Ejercicio9_OO2;

public abstract class State {
	private Excursion excursion;
	
	public void setExcursion(Excursion ex) {
		this.excursion = ex;
	}
	
	public String obtenerInformacion() {
		return ("nombre: " + this.excursion.getNombre() + ", costo: "+ this.excursion.getCosto() +", fecha de inicio: " + this.excursion.getFechaInicial() + ", fecha de fin: " + this.excursion.getFechaFinal() + ", punto de encuentro: " + this.excursion.getPntEncuentro());
	}
	
	public Excursion getExcursion() {
		return this.excursion;
	}
}