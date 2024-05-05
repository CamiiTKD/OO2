package ar.edu.unlp.info.oo2.Ejercicio19_OO2;

import java.util.List;

public abstract class Personaje {
	private String nombre;
	private int vida;
	private Armadura armadura;
	private Arma arma;
	private List<Habilidad> habilidades;
	
	public Personaje(String nombre, Armadura armadura, Arma arma, List<Habilidad> habilidades) {
		this.nombre = nombre;
		this.vida = 100;
		this.armadura = armadura;
		this.arma = arma;
		this.habilidades = habilidades;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVida() {
		return vida;
	}

	public String getTipoArmadura() {
		return armadura.getType();
	}

	public String getTipoArma() {
		return arma.getType();
	}
	
	public void atacar(Personaje objetivo) {
		objetivo.recibirAtaque(this.arma.calcularDanio(objetivo.getTipoArmadura()));
	}
	
	public void recibirAtaque(int danio) {
		if(this.estaVivo()) {
			this.vida -= danio;
		}
	}
	
	public boolean estaVivo() {
		return (this.vida > 0);
	}
	
	public abstract String getType();
	
	@Override	
	public String toString() {
		return ("Soy el " +this.getType()+ " " +this.nombre+ " y me queda " +this.vida+ " de vida.");
	}
}