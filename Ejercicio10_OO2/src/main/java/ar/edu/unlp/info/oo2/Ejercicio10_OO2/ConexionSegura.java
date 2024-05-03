package ar.edu.unlp.info.oo2.Ejercicio10_OO2;

public class ConexionSegura extends Conexion{
	
	public ConexionSegura(Encriptador e) {
		super(e);
	}
	
	@Override
	public void enviar(String msj) {
		String msjEncriptado = this.getEncriptador().encriptar(msj);
		super.enviar(msjEncriptado);
	}
}
