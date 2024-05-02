package ar.edu.unlp.info.oo2.Ejercicio15_OO2;

public class PermisosDecorator extends FileDecorator {
	
	public PermisosDecorator(FileOO2 file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return (this.file.getPermisos() + " " + this.file.prettyPrint());
	}
}