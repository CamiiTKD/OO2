package ar.edu.unlp.info.oo2.Ejercicio5_OO2;

import java.util.List;
import java.util.ArrayList;

public class MediaPlayer{
	private List<Media> medias;
	
	public MediaPlayer() {
		this.medias = new ArrayList<>();
	}
	
	public void Play() {
		this.medias.stream().forEach(m -> m.Play());
	}
	
	public void AgregarMedia(Media unaMedia) {
		this.medias.add(unaMedia);
	}
}