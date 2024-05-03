package ar.edu.unlp.info.oo2.Ejercicio5_OO2;

public class VideoStreamAdapter extends Media{
	private VideoStream videoStream = new VideoStream();
	
	public VideoStreamAdapter() {
		
	}
	
	public void Play() {
		this.videoStream.reproduce();
	}
}