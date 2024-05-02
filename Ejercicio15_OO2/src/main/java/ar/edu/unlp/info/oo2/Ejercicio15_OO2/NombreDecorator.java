package ar.edu.unlp.info.oo2.Ejercicio15_OO2;

public class NombreDecorator extends FileDecorator {
	
	public NombreDecorator(FileOO2 file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return (this.file.getNombre() + " " + this.file.prettyPrint());
	}
}