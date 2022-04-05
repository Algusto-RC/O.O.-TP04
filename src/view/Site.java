package view;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import java.util.*;
import model.*;
import control.*;

public class Site implements ActionListener {
    static Scanner ler=new Scanner(System.in);

	JFrame telaPrincipal;
	JTextField texto; 
	JButton pcliente, pprofissional, confirmar, cancelar; 
	JLabel titulo, resultado1, resultado2;
	JPanel painelPrincipal;
	ViewPerfildoCliente painelCliente;
	ViewPerfildoProfissional painelProfissional;

	public Site() { 
		// Criando e  configurando o JFrame principal.  
		telaPrincipal = new JFrame("Marido de aluguel T6.3"); 
		telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		telaPrincipal.setSize(1300, 700); 
		telaPrincipal.setLayout(null); 
		telaPrincipal.setLocationRelativeTo(null); 
		//-----------------------//-----------------------//-----------------------
		// Criando e configurando o JPanel principal.  
		painelPrincipal = new JPanel(); 
		painelPrincipal.setSize(1300, 700); 
		painelPrincipal.setLayout(null); 
		painelPrincipal.setVisible(true);
		//-----------------------//-----------------------//-----------------------
		// Criando e configurando o JPanel dos clientes.  
		painelCliente = new ViewPerfildoCliente(); 
 
		//-----------------------//-----------------------//-----------------------
		// Criando e configurando o JPanel dos profissionais.  
		painelProfissional = new ViewPerfildoProfissional(); 
		
	//-------------------------------------------------------------------------------------------------------------------------
		//-----------------------//-----------------------//-----------------------
		// Criando e  configurando um titulo para o JPanel principal.  
		titulo = new JLabel("ESCOLHA SEU TIPO DE PERFIL");
		titulo.setFont(new Font("Arial", Font.BOLD, 25));
		titulo.setBounds(775, 70, 400, 50);
		//-----------------------//-----------------------//-----------------------
		// Criando e configurando um botao para a interface de clientes.  
		JButton pcliente = new JButton("Cliente"); 
		pcliente.setBounds(830, 160, 250, 30);
		pcliente.addActionListener(this); 
		//-----------------------//-----------------------//-----------------------
		// Criando e configurando um botao para a interface de profissionais.  
		JButton pprofissional = new JButton("Profissional");
		pprofissional.setBounds(830, 210, 250, 30);
		pprofissional.addActionListener(this); 
		//-----------------------//-----------------------//-----------------------
		//Criando e configurando os botoes.
		confirmar = new JButton("Confirmar");
		confirmar.setBounds(55, 590, 130, 30);
		confirmar.addActionListener(this); 
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(225, 590, 130, 30);
		cancelar.addActionListener(this); 

	//-------------------------------------------------------------------------------------------------------------------------
		// Adiciona os componentes ao Painel principal.
		painelPrincipal.add(titulo);  
		painelPrincipal.add(pcliente); 
		painelPrincipal.add(pprofissional);	
		// Adiciona os componentes ao Painel principal.
		painelCliente.cadastrarComponent(confirmar); 
		painelCliente.cadastrarComponent(cancelar);
		//-----------------------//-----------------------//-----------------------
		// Adiciona JPanels ao JFrame principal.
		telaPrincipal.add(painelPrincipal);	
		telaPrincipal.add(painelCliente);
		telaPrincipal.add(painelProfissional);
		//-------------------------------------------------------------------------------------------------------------------------
		//Habilitando a visibilidade do Jframe principal.
		telaPrincipal.setVisible(true); 
	} 

	//-------------------------------------------------------------------------------------------------------------------------
	//MÉTODO PARA GERENCIAR EVENTOS 
	public void actionPerformed(ActionEvent ae) { 
		if(ae.getActionCommand().equals("Cliente")) {  
			painelPrincipal.setVisible(false);
			painelCliente.cadastrarComponent(telaPrincipal);
			painelCliente.setVisible(true);
			cancelar.setVisible(true);

		}else if (ae.getActionCommand().equals("Profissional")) {
			painelPrincipal.setVisible(false);
			painelProfissional.cadastraComponent(telaPrincipal);
			painelProfissional.setVisible(true);
			cancelar.setVisible(true);
		} 


		if(ae.getActionCommand().equals("Confirmar")) {  
			//TODO Devolver o botão "Confirmar" para a classe ViewPedidodoCliente.

		}else if (ae.getActionCommand().equals("Cancelar")) {
            painelCliente.setVisible(false);
			painelPrincipal.setVisible(true);
			cancelar.setVisible(false);
		} 
	}

	public void retornarTela(){
		painelPrincipal.setVisible(true);
    }








	
	public static void main(String[] args) {		
		
		new Site();  
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
