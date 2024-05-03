package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.Map;
import java.util.HashMap;

public class Twitter {
	private Map<String, Usuario> usuarios;
	
	public Twitter() {
		usuarios = new HashMap<>();
	}
	
	public void agregarUsuario(String nombre) {
		if(!usuarios.containsKey(nombre)) {
			Usuario user = new Usuario(nombre);
			usuarios.put(nombre, user);
		}
	}
	
	public void eliminarUsuario(String nombre) {
		usuarios.get(nombre).eliminarPublicaciones();
	}
}