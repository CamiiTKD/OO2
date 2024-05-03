package ar.edu.unlp.info.oo2.Ejercicio6_OO2;

import java.util.List;

public class Mixta extends Topografia{
	private List<Topografia> topografias;
	
	public Mixta(List<Topografia> tps) {
		this.topografias = tps;
	}
	
	public double proporcionAgua() {
		return this.topografias.stream().mapToDouble(tps -> tps.proporcionAgua()).sum();
	}
	
	public boolean esIgual(Topografia topografia) {
		return topografia.compararContraMixta(this);
	}
	
	public boolean compararContraSimple(double num) {
		return false;
	}
	
	public boolean compararContraMixta(Mixta topografia) {
		return this.topografias.equals(topografia.getTopografias());
	}
	
	public List<Topografia> getTopografias(){
		return this.topografias;
	}
}