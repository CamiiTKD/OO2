package ar.edu.unlp.info.oo2.Ejercicio14_OO2;

import java.util.Collection;
import java.util.List;

public class DatabaseProxyAccess implements DatabaseAccess{
	private boolean registrado;
	private DatabaseRealAccess realDB;
	
	public DatabaseProxyAccess() {
		this.registrado = false;
		this.realDB = new DatabaseRealAccess();
	}
	
	public Collection<String> getSearchResults(String queryString) {
		if(this.getRegistrado()) {
			return this.realDB.getSearchResults(queryString);
		}
		return null;
    }
	
	public int insertNewRow(List<String> rowData) {
		if(this.getRegistrado()) {
			return this.realDB.insertNewRow(rowData);
		}
		return 0;
	}

	public boolean getRegistrado() {
		return registrado;
	}
	
	public void setRegistrado(boolean r) {
		this.registrado = r;
	}
	
	public void registrarse(String contraseña) {
		if(contraseña == "unaContraseñaComun") {
			this.setRegistrado(true);
		}
	}

}