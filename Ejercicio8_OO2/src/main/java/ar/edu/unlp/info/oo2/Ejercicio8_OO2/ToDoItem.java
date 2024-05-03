package ar.edu.unlp.info.oo2.Ejercicio8_OO2;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String nombre;
	private List<String> comentarios;
	private State estado;
	private LocalTime startTime;
	private LocalTime endTime;
	
	public ToDoItem(String name) {
		this.nombre = name;
		this.comentarios = new ArrayList<>();
		this.setState(new Pending());
	}
	
	public void setState(State estado) {
		this.estado.setToDoItem(this);
		this.estado = estado;
	}
	
	public void start() {
		this.estado.start();
	}
	
	public void togglePause() {
		this.estado.togglePause();
	}
	
	public void finish() {
		this.estado.finish();
	}
	
	public Duration workedTime() {
		return Duration.between(getStartTime(), getEndStartTime());
	}
	
	public void addComment(String comment) {
		if(this.estado.allowsComment()) {
			this.comentarios.add(comment);
		}
	}
	
	public void setStartTime() {
		this.startTime = LocalTime.now();
	}
	
	public void setEndTime() {
		this.endTime = LocalTime.now();
	}
	
	public LocalTime getStartTime() {
		return this.startTime;
	}
	
	public LocalTime getEndStartTime() {
		return this.endTime;
	}
}