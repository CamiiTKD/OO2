package ar.edu.unlp.info.oo2.Ejercicio15_OO2;

public class FechaModificacionDecorator extends FileDecorator {
	
	public FechaModificacionDecorator(FileOO2 file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return (this.file.getFechaModificacion() + " " + this.file.prettyPrint());
	}
}