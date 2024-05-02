package ar.edu.unlp.info.oo2.Ejercicio15_OO2;

public class ExtensionDecorator extends FileDecorator {
	
	public ExtensionDecorator(FileOO2 file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return (this.file.getExtension() + " " + this.file.prettyPrint());
	}
}