package ar.edu.unlp.info.oo2.Ejercicio15_OO2;

public abstract class FileDecorator extends FileOO2 {
	protected FileOO2 file;
	
	public abstract String prettyPrint();
	
	public String getNombre() {
		return this.file.getNombre();
	}

	public String getExtension() {
		return this.file.getExtension();
	}

	public String getTamaño() {
		return this.file.getTamaño();
	}
	
	public String getFechaCreacion() {
		return this.file.getFechaCreacion();
	}

	public String getFechaModificacion() {
		return this.file.getFechaModificacion();
	}

	public String getPermisos() {
		return this.file.getPermisos();
	}
}
