package model;

import java.util.Scanner;

public class Servico {
	//ATRIBUTOS:
	static Scanner ler=new Scanner(System.in);
	private String tipoDeServico;
	private String formacao;
	//private String especificacao ;
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//CONSTRUTOR:
	public Servico(String tipoDeServico, String formacao) {
		this.tipoDeServico = tipoDeServico;
		this.formacao = formacao;
		//this.especificacao = especificacao;
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//METODOS:
	public void cadastrar() {
		System.out.println("Qual a sua area de atuacao? ");
		System.out.println("Eletricista \nMecanico \nEncanador(a) \nFaxineiro(a) \nCozinheiro(a)");
		tipoDeServico = ler.nextLine();
		tipoDeServico = tipoDeServico.toLowerCase();
		System.out.println(" ");

		System.out.println("Qual a sua formacao na area? ");
		System.out.println("Sem formacao \nTecnico \nTecnologo \nGraduado/Licenciado \nMestre");
		formacao = ler.nextLine();
		formacao = formacao.toLowerCase();
		System.out.println(" ");
	}
	//---//------------//---//
	public void editar() {
		int desejada;
		String nova;

        System.out.println("Escolha o que deseja editar: ");
		System.out.println("[1] Area de atuacao \n[2] Formacao");
        desejada = ler.nextInt();
		ler.nextLine();
		System.out.println(" ");

        switch (desejada) {
            case 1:
                System.out.println("Digite a sua area de atuacao atual: ");
				nova = ler.nextLine();
                tipoDeServico = tipoDeServico.replace(tipoDeServico, nova);
                break;
            case 2:
                System.out.println("Digite a sua formacao atual: ");
				nova = ler.nextLine();
                formacao = formacao.replace(formacao, nova);   
                break;           
            default:
                break;
        }
		System.out.println(" ");
	}
	//---//------------//---//
	public void deletar(){
		tipoDeServico = tipoDeServico.replace(tipoDeServico, "Tipo de servico nao cadastrado");
		formacao = formacao.replace(formacao, "Formacao nao cadastrada");   
	}
	//---//------------//---//
	public void visualizar() {
		System.out.printf("Area de atuacao: %s \n Formacao: %s", tipoDeServico, formacao);
	}
	//---//------------//---//
	public void pesquisar() {
		//FAREMOS DEPOIS
		//REALIZAR PESQUISA PELO TIPO DE SERVICO E MOSTRAR TODOS OS PROFISSIONAIS CADASTRADOS NO TIPO
	}
	//---//------------//---//
	public void solicitar() {
		//FAREMOS DEPOIS
		//CHAT COM FUNCIONARIO, ESTILO DE MULTIPLA ESCOLHA
	}
	//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//GETS E SETS:
	public String getTipoDeServico() {
		return tipoDeServico;
    }
	//---//------------//---//
    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }
	//---//------------//---//
    public String getFormacao() {
        return formacao;
    }
	//---//------------//---//
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
