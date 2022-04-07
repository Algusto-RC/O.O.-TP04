package control;

import model.Endereco;

public class ControleEndereco extends Endereco {

    public ControleEndereco(String pais, String cep, String cidade, String logradouro, String uf) {
        super(pais, cep, cidade, logradouro, uf);
    }

    //GETS E SETS:
	public String getPais() {
		return pais;
	}
	//---//------------//---//
	public void setPais(String pais) {
		this.pais = pais;
	}
	//---//------------//---//
	public String getCep() {
		return cep;
	}
	//---//------------//---//
	public void setCep(String cep) {
		this.cep = cep;
	}
	//---//------------//---//
	public String getCidade() {
		return cidade;
	}
	//---//------------//---//
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	//---//------------//---//
	public String getLogradouro() {
		return logradouro;
	}
	//---//------------//---//
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	//---//------------//---//
	public String getUf() {
		return uf;
	}
	//---//------------//---//
	public void setUf(String uf) {
		this.uf = uf;
	}
}
