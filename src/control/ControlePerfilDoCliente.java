package control;

import model.*;

public class ControlePerfilDoCliente {
	private String nome, cpf_cpnj, idade, pais, cidade, cep, logradouro, uf;

	/*public ControlePerfilDoCliente(String nome, String cpf_cnpj, String idade, Endereco endereco) {
		super(nome, cpf_cnpj, idade, endereco);
		// TODO Auto-generated constructor stub
	}*/

	public ControlePerfilDoCliente(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean validaNome(String nome) {
		boolean verifica=true;
		if(nome.isEmpty()) {
			verifica=false;
		}
		return verifica;
	}
	
	public String getCpf_cpnj() {
		return cpf_cpnj;
		
	}

	public void setCpf_cpnj(String cpf_cpnj) {
		this.cpf_cpnj = cpf_cpnj;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	
	
		
}
