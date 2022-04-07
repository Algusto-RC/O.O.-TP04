package model;

import java.util.Scanner;

public class Endereco {
	//ATRIBUTOS:
	static Scanner ler=new Scanner(System.in);
	protected String pais;
	protected String cep;
	protected String cidade;
	protected String logradouro;
	protected String uf;
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//CONSTRUTOR:
	public Endereco(String pais, String cep, String cidade, String logradouro, String uf) {
		this.pais = pais;
		this.cep = cep;
		this.cidade = cidade;
		this.logradouro = logradouro;
		this.uf = uf;
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//METODOS:
	public void cadastrar() {
		System.out.println("Digite o nome do seu pais: ");
		pais=ler.nextLine();
		System.out.println(" ");      
		
		System.out.println("Digite sua UF: ");
		uf=ler.nextLine();
		System.out.println(" ");      

		System.out.println("Digite o nome da sua cidade: ");
		cidade=ler.nextLine();
		System.out.println(" ");      

		System.out.println("Digite o seu CEP: ");
		cep=ler.nextLine();
		System.out.println(" "); 
		
		System.out.println("Digite o seu logradouro: ");
		logradouro=ler.nextLine();
		System.out.println(" "); 
	}
	//---//------------//---//
	public void editar() {
		String desejada, nova;

        System.out.println("Escolha o que deseja editar: ");
        desejada = ler.nextLine();
        desejada = desejada.toLowerCase(); 
		System.out.println(" "); 

        switch (desejada) {
            case "pais":
                System.out.println("Digite o novo pais: ");
                nova = ler.nextLine();
                pais = pais.replace(pais, nova);  
				System.out.println(" ");      
                break;
            
            case "cep":
                System.out.println("Digite o novo CEP: ");
                nova = ler.nextLine();
                cep = cep.replace(cep, nova);
				System.out.println(" ");                           
                break;
            
            case "cidade":
            	System.out.println("Digite a nova cidade: ");
                nova = ler.nextLine();
                cidade = cidade.replace(cidade, nova); 
				System.out.println(" ");  
                break;

            case "logradouro":
            	System.out.println("Digite o novo logradouro: ");
                nova = ler.nextLine();
                logradouro = logradouro.replace(logradouro, nova);
				System.out.println(" ");   
                break;

            case "uf":
            	System.out.println("Digite a nova UF: ");
                nova = ler.nextLine();
                uf = uf.replace(uf, nova); 
				System.out.println(" ");  
                break;
            
            default:
				System.out.println("Opcao Invalida!");
				System.out.println(" "); 
                break;
        }
	}
	//---//------------//---//
	public void deletar() {
		pais = pais.replace(pais, "Pais nao cadastrado");       
		cep = cep.replace(cep, "CEP nao cadastrado");                  
		cidade = cidade.replace(cidade, "Cidade nao cadastrada");  
		logradouro = logradouro.replace(logradouro, "Logradouro nao cadastrado");  
		uf = uf.replace(uf, "UF nao cadastrada");  
	}
	//---//------------//---//
	public void visualizar() {
		System.out.printf("Pais: %s\nCEP: %s\nCidade: %s\nLogradouro: %s\nUF: %s",pais, cep, cidade, logradouro, uf);
		System.out.println(" "); 
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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


