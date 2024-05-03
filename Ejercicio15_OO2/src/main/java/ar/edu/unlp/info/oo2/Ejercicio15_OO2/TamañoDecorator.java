package ar.edu.unlp.info.oo2.Ejercicio15_OO2;

public class TamañoDecorator extends FileDecorator {
	
	public TamañoDecorator(FileOO2 file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return (this.file.getTamaño() + " " + this.file.prettyPrint());
	}
}