package ar.edu.unlp.info.oo2.Ejercicio8_OO2;

public class InProgress extends State {
	
	public void start() {

	}
	
	public void togglePause() {
		this.getItem().setState(new Paused());
	}
	
	public void finish() {
		this.getItem().setState(new Finished());
		this.getItem().setEndTime();
	}
	
	public boolean allowsComment() {
		return true;
	}
	
}