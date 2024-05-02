package ar.edu.unlp.info.oo2.Ejercicio15_OO2;

public class FechaCreacionDecorator extends FileDecorator {
	
	public FechaCreacionDecorator(FileOO2 file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return (this.file.getFechaCreacion() + " " + this.file.prettyPrint());
	}
}