package model;

//import java.awt.Image;
import java.util.Scanner;

public abstract class Perfil {
	//ATRIBUTOS:
	protected String nome;
	protected String cpf_cnpj;
	protected String idade;
	//protected Image foto;
	protected Endereco endereco;
	static Scanner ler=new Scanner(System.in);
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//CONSTRUTOR:
	public Perfil(String nome, String cpf_cnpj, String idade,/* Image foto,*/ Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf_cnpj = cpf_cnpj;
		this.idade = idade;
		//this.foto = foto;
		this.endereco = endereco;
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//METODOS:
	public void cadastrar() {
	}
	//---//------------//---//
	public void editar() {
	}
	//---//------------//---//
	public void deletar() {
	}
	//---//------------//---//
	public void visualizar() {
	}	
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//GETS E SETS:
	public String getNome() {
		return nome;
	}
	//---//------------//---//
	public void setNome(String nome) {
		this.nome = nome;
	}
	//---//------------//---//
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	//---//------------//---//
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	//---//------------//---//
	public String getIdade() {
		return idade;
	}
	//---//------------//---//
	public void setIdade(String idade) {
		this.idade = idade;
	}
/*	//---//------------//---//
	public Image getFoto() {
		return foto;
	}
	//---//------------//---//
	public void setFoto(Image foto) {
		this.foto = foto;
	}*/
	//---//------------//---//
	public Endereco getEndereco() {
		return endereco;
	}
	//---//------------//---//
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
