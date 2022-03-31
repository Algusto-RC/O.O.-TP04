package view;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.*;
import model.*;

public class Site implements ActionListener {
    static Scanner ler=new Scanner(System.in);

	JTextField texto; 
	JButton pcliente, pprofissional; 
	JLabel titulo, interno, externo;

	public Site() { 
		// Cria um novo container JFrame.  
		JFrame t_principal = new JFrame("Marido de aluguel T6.3"); 
		// Especifica o uso do FlowLayout.   
		t_principal.setLayout(null); 
		// Define o tamanho do frame.  
		t_principal.setSize(1000, 500); 
		// Encerra o programa caso o usuário feche a aplicação.  
		t_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		titulo = new JLabel("ESCOLHA UM TIPO DE PERFIL");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(350, 10, 300, 50);
		// Cria um botão para a interface de clientes.  
		JButton pcliente = new JButton("Cliente"); 
		pcliente.setBounds(350, 100, 130, 30);
		// Cria um botão para a interface de profissionais.  
		JButton pprofissional = new JButton("Profissional");
		pprofissional.setBounds(500, 100, 130, 30);
		// Adiciona eventos.  
		pcliente.addActionListener(this); 
		pprofissional.addActionListener(this); 
		// Adiciona os componentes ao painel de conteúdo.
		t_principal.add(titulo);  
		t_principal.add(pcliente); 
		t_principal.add(pprofissional);		
		// Mostra o frame construído.  
		t_principal.setVisible(true); 
	} 
		
	//Método para gerência de eventos 
	public void actionPerformed(ActionEvent ae) { 
		if(ae.getActionCommand().equals("Cliente")) { 
			// Converte as letras para maiúsculo caso o botão seja pressionado.   
			String orgStr = texto.getText(); 
			String resStr = orgStr.toUpperCase(); 
			// Cria rótulos.  
			texto.setText(resStr);  
		} else {
			// A tecla enter é pressionada enquanto o cursor estana no campo de texto. 
			externo.setText("You pressed ENTER. Text is: " + 
			texto.getText()); 
		} 
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
