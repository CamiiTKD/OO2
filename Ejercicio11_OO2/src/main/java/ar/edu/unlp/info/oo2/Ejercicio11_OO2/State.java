package ar.edu.unlp.info.oo2.Ejercicio11_OO2;

public abstract class State {
	private Proyecto proyecto;
	
	public abstract void aprobarEtapa();
	
	public double costoProyecto() {
		return this.getProyecto().calcularDias() * this.getProyecto().getCantIntegrantes() * this.getProyecto().getMonto();
	}
	
	public double precioProyecto() {
		return this.costoProyecto() + ((this.getProyecto().getMargen() / 100) * this.costoProyecto());
	}
	
	public abstract void modificarMargen(double margen);
	public abstract void cancelarProyecto();
	
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public Proyecto getProyecto() {
		return this.proyecto;
	}
}
