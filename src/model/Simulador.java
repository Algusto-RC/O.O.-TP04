package model;

import java.util.Scanner;

public class Simulador {
	static Scanner ler=new Scanner(System.in);

	public static void main(String[] args) {

		int opc;
		//PerfilDoProfissional pdp;
		//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		System.out.println("--------------------------------------------------");
		System.out.println("-------------- BEM VINDO(A) AO BETA --------------");
		System.out.println("--------------------------------------------------");
		System.out.println(" ");

		System.out.println("Escolha um tipo de perfil: ");
		System.out.println("[1] Profissional");
		System.out.println("[2] Cliente");

		do{
			opc = ler.nextInt();
			System.out.println(" ");

			//Condicional para o Perfil do Profissional
			if ( opc == 1) {
				Inicializador_Perfil_Profissional();
			//Condicional para o Perfil do Cliente
			}else if (opc == 2){
				Inicializador_Perfil_Cliente();
				break;
	
			}else{
				System.out.println("Opcao Invalida!");
				System.out.println(" ");
				System.out.print("Digite novamente: ");
			}
		}while( opc != 1 || opc != 2);

	}
	//---//------------//---//
	static void Inicializador_Perfil_Profissional(){
		int opc, confirm;
		Endereco ndrc = new Endereco("null", "null", "null", "null", "null");
		Servico srvc = new Servico("null", "null");
		Contato cntt = new Contato("null", "null");
		//String experiencia;
		PerfilDoProfissional pdp = new PerfilDoProfissional("null", "null", "null", ndrc, srvc, cntt,"null");

		pdp.cadastrar(); //Chamada da funcao cadastrar para inicializar os recursos.

		System.out.println("-----------------------------------------------");
		System.out.println("------------------ SEU PERFIL -----------------");
		System.out.println("-----------------------------------------------");
		
		do{
			System.out.println(" ");
			System.out.println("---------- O que deseja fazer agora? ----------");		
			System.out.println("[1] Visualizar meus dados");
			System.out.println("[2] Editar meus dados");
			System.out.println("[3] Ver meus pedidos (EM BREVE)");
			System.out.println("[4] Deletar perfil");
			System.out.println("[5] Encerrar");

			System.out.println("Digite aqui: ");
			opc = ler.nextInt();
			ler.nextLine();

			switch (opc) {
				case 1:
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					pdp.visualizar();
					System.out.println("-----------------------------------------------");
					System.out.println(" ");
					break;
				case 2:
					pdp.editar();
					System.out.println(" ");
					break;
				case 3:
					System.out.println("Indisponivel no momento :( ");
					System.out.println(" ");
					break;
				case 4:
					int confirmacao;
		
					System.out.println("Tem certeza que deseja deletar este perfil?");
					System.out.println("[1] SIM --------------------------- [2] NAO");
					confirmacao = ler.nextInt();
					ler.nextLine();
					System.out.println(" ");      

					if (confirmacao == 1) {
						pdp.deletar();

						System.out.println("Deseja cadastrar um novo perfil?");
						System.out.println("[1] SIM --------------- [2] NAO");
						confirm = ler.nextInt();
						ler.nextLine();

						if (confirm == 1) {
							pdp.cadastrar();
	
						} else {
							opc = 5;
							System.out.println(" ");
							System.out.println("----- OBRIGADO POR USAR O NOSSO PROGRAMA! -----");
							System.out.println("---------------- VOLTE SEMPRE! ----------------");
							System.out.println(" ");
							return;
						}
					}else{
						break;
					}
					break;
				case 5:
					System.out.println(" ");
					System.out.println("----- OBRIGADO POR USAR O NOSSO PROGRAMA! -----");
					System.out.println("---------------- VOLTE SEMPRE! ----------------");
					System.out.println(" ");
					break;	
				default:
					System.out.println("Opcao Invalida!");
					break;
			}
		}while (opc != 5);

		System.out.println(" ");
	}
	//---//------------//---//
	static void Inicializador_Perfil_Cliente(){
		int opc, confirm;
		Endereco ndrc = new Endereco("null", "null", "null", "null", "null");
		PerfilDoCliente pdc = new PerfilDoCliente("null", "null", "null", ndrc);

		pdc.cadastrar(); //Chamada da funcao cadastrar para inicializar os recursos.

		System.out.println("-----------------------------------------------");
		System.out.println("------------------ SEU PERFIL -----------------");
		System.out.println("-----------------------------------------------");
		
		do{
			System.out.println(" ");
			System.out.println("---------- O que deseja fazer agora? ----------");		
			System.out.println("[1] Visualizar meus dados");
			System.out.println("[2] Editar meus dados");
			System.out.println("[3] Pesquisar por profissionais (EM BREVE)");
			System.out.println("[4] Deletar perfil");
			System.out.println("[5] Encerrar");

			System.out.println("Digite aqui: ");
			opc = ler.nextInt();
			ler.nextLine();

			switch (opc) {
				case 1:
					System.out.println(" ");
					System.out.println("-----------------------------------------------");
					pdc.visualizar();
					System.out.println("-----------------------------------------------");
					System.out.println(" ");
					break;
				case 2:
					pdc.editar();
					System.out.println(" ");
					break;
				case 3:
					System.out.println("Indisponivel no momento :( ");
					System.out.println(" ");
					break;
				case 4:
					int confirmacao;
		
					System.out.println("Tem certeza que deseja deletar este perfil?");
					System.out.println("[1] SIM --------------------------- [2] NAO");
					confirmacao = ler.nextInt();
					ler.nextLine();
					System.out.println(" ");      

					if (confirmacao == 1) {
						pdc.deletar();

						System.out.println("Deseja cadastrar um novo perfil?");
						System.out.println("[1] SIM --------------- [2] NAO");
						confirm = ler.nextInt();
						ler.nextLine();

						if (confirm == 1) {
							pdc.cadastrar();
	
						} else {
							opc = 5;
							System.out.println(" ");
							System.out.println("----- OBRIGADO POR USAR O NOSSO PROGRAMA! -----");
							System.out.println("---------------- VOLTE SEMPRE! ----------------");
							System.out.println(" ");
							return;
						}
					}else{
						break;
					}
					break;
				case 5:
					System.out.println(" ");
					System.out.println("----- OBRIGADO POR USAR O NOSSO PROGRAMA! -----");
					System.out.println("---------------- VOLTE SEMPRE! ----------------");
					System.out.println(" ");
					break;	

				default:
					System.out.println("Opcao Invalida!");
					break;
			}
		
		}while (opc != 5);

		System.out.println(" ");
	}
}
