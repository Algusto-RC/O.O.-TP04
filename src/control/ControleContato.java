package control;

import model.*;

public class ControleContato extends Contato {
	
	public ControleContato(String telefone, String email) {
		super(telefone, email);
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//GETS E SETS
	public String getTelefone() {
		return telefone;
	}
	//-----//
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	//-----//
	public String getEmail() {
		return email;
	}
	//-----//
	public void setEmail(String email) {
		this.email = email;
	}
}
