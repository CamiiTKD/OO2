package ar.edu.unlp.info.oo2.Ejercicio11_OO2;

public class EnConstruccion extends State{
	
	public EnConstruccion() {
		
	}

	public void aprobarEtapa() {
		if(this.getProyecto().precioProyecto() != 0) {
			this.getProyecto().setState(new EnEvaluacion());
		}
		else {
			throw new RuntimeException("El precio del proyecto no puede ser 0.");
		}
	}

	public void modificarMargen(double margen) {
		if((margen >= 8)&&(margen <= 10)) {
			this.getProyecto().setMargen(margen);
		}
	}

	public void cancelarProyecto() {
		this.getProyecto().setObjetivo(this.getProyecto().msjCancelacion());
		this.getProyecto().setState(new Cancelada());
	}
}