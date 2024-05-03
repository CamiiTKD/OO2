package ar.edu.unlp.info.oo2.Ejercicio1;

public class Tweet implements Publicacion{
	private String texto;
	
	public Tweet(String text) {
		this.texto = text;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public void eliminar() {
		this.texto = "Publicación no disponible.";
	}
}