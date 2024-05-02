package ar.edu.unlp.info.oo2.Ejercicio8_OO2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pending extends State{
	
	public void start() {
		this.getItem().setState(new InProgress());
		this.getItem().setStartTime();
	}
	
	public void togglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public void finish() {
		
	}
	
	public boolean allowsComment() {
		return true;
	}

	
}