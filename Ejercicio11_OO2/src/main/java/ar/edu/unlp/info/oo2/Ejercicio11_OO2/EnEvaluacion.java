package ar.edu.unlp.info.oo2.Ejercicio11_OO2;

public class EnEvaluacion extends State{

	public EnEvaluacion() {
		
	}
	
	public void aprobarEtapa() {
		this.getProyecto().setState(new Confirmada());
	}

	public void modificarMargen(double margen) {
		if((margen >= 11)&&(margen <= 15)) {
			this.getProyecto().setMargen(margen);
		}
	}

	public void cancelarProyecto() {
		
	}

}
