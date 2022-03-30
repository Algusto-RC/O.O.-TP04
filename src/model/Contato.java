package model;


import java.util.Scanner;

public class Contato {
	//ATRIBUTOS:
	static Scanner ler=new Scanner(System.in);
	private String telefone;
	private String email;
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//CONSTRUTOR:
	public Contato(String telefone, String email) {
		this.telefone = telefone;
		this.email = email;
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//METODOS:
	public void cadastrar() {
		System.out.println("Digite o seu telefone:");
		telefone=ler.nextLine();
		System.out.println(" ");
		
		System.out.println("Digite o seu email: ");
		email=ler.nextLine();
		System.out.println(" ");
	}
	//-----//
	public void editar() {
		String desejada, nova;

        System.out.print("Escolha o que deseja editar: ");
        desejada = ler.nextLine();
        desejada = desejada.toLowerCase(); 
		System.out.println(" ");

        switch (desejada) {
            case "telefone":
                System.out.println("Digite seu novo telefone: ");
                nova = ler.nextLine();
                telefone = telefone.replace(telefone, nova);       
                break;
            
            case "email":
                System.out.println("Digite o novo email: ");
                nova = ler.nextLine();
                email = email.replace(email, nova);               
                break;
            
            default:
                break;
        }
		System.out.println(" ");
	}
	//-----//
	public void deletar() {
		telefone = telefone.replace(telefone, "Telefone nao cadastrado");       
		email = email.replace(email, "Email nao cadastrado");                      
	}
	//-----//
	public void visualizar() {
		System.out.printf("Telefone: %s \nEmail: %s",telefone, email);
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
