package ar.edu.unlp.info.oo2.Ejercicio8_OO2;

public abstract class State {
	private ToDoItem item;
	
	public abstract void start();
	public abstract void togglePause();
	public abstract void finish();
	public abstract boolean allowsComment();
	
	public ToDoItem getItem() {
		return this.item;
	}
	
	public void setToDoItem(ToDoItem item) {
		this.item = item;
	}
	
}