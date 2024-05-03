package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	private String screenName;
	private List<Publicacion> publicaciones;
	
	public Usuario(String unNombre) {
		this.screenName = unNombre;
		this.publicaciones = new ArrayList<>();
	}
	
	public void Twittear(String text) {
		if((!text.isBlank()) && (text.length() <= 280)) {
			Tweet tw = new Tweet(text);
			this.publicaciones.add(tw);
		}
	}
	
	public void ReTwittear(Tweet tw) {
		this.publicaciones.add(tw);
	}
	
	public void eliminarPublicaciones() {
		for(Publicacion p : this.publicaciones) {
			p.eliminar();
		}
	}
}