package control;

import model.*;

public class ControlePerfilDoCliente extends PerfilDoCliente{
	//private String nome, cpf_cpnj, idade, pais, cidade, cep, logradouro, uf;

	public ControlePerfilDoCliente(String nome, String cpf_cnpj, String idade, Endereco endereco) {
		super(nome, cpf_cnpj, idade, endereco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf_cpnj() {
		return cpf_cnpj;
	}

	public void setCpf_cpnj(String cpf_cpnj) {
		this.cpf_cnpj = cpf_cpnj;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}