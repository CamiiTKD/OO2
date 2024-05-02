package ar.edu.unlp.info.oo2.Ejercicio1;

public class ReTweet {
	private Tweet tweet;
	
	public ReTweet(Tweet unTweet) {
		this.tweet = unTweet;
	}
	
	public String getTexto() {
		return this.tweet.getTexto();
	}
	
	public void eliminar() {
		return;
	}
}