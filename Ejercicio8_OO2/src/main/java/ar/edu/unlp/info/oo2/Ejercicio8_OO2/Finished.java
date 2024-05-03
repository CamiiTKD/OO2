package ar.edu.unlp.info.oo2.Ejercicio8_OO2;

public class Finished extends State {
	
	public void start() {

	}
	
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public void finish() {
		
	}
	
	public boolean allowsComment() {
		return false;
	}

}