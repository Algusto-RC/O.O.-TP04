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
	JButton pcliente, pprofissional, cancelar; 
	JLabel titulo, resultado1, resultado2, telaFundo;
	ImageIcon imagemFundo;
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
		//-----------------------//-----------------------//-----------------------
		// Criando e configurando o JPanel dos clientes.  
		painelCliente = new ViewPerfildoCliente(); 
		//-----------------------//-----------------------//-----------------------
		// Criando e configurando o JPanel dos profissionais.  
		painelProfissional = new ViewPerfildoProfissional(); 
	//-------------------------------------------------------------------------------------------------------------------------
		//-----------------------//-----------------------//-----------------------
		// Criando e configurando imagem de fundo do JPanel principal.
		imagemFundo = new ImageIcon(getClass().getResource("background.PNG"));
		telaFundo = new JLabel(imagemFundo);
		telaFundo.setBounds(-200, 0, 1080, 811);
		telaFundo.setVisible(true);

		// Criando e  configurando um titulo para o JPanel principal.  
		titulo = new JLabel("ESCOLHA SEU TIPO DE PERFIL");
		titulo.setFont(new Font("Arial", Font.BOLD, 25));
		titulo.setBounds(850, 70, 400, 50);
		//-----------------------//-----------------------//-----------------------
		// Criando e configurando um botao para a interface de clientes.  
		JButton pcliente = new JButton("Cliente"); 
		pcliente.setBounds(915, 160, 250, 30);
		pcliente.addActionListener(this); 
		//-----------------------//-----------------------//-----------------------
		// Criando e configurando um botao para a interface de profissionais.  
		JButton pprofissional = new JButton("Profissional");
		pprofissional.setBounds(915, 210, 250, 30);
		pprofissional.addActionListener(this); 
		//-----------------------//-----------------------//-----------------------
		//Criando e configurando os botoes.	
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(225, 590, 130, 30);
		cancelar.addActionListener(this); 
		cancelar.setVisible(false);

	//-------------------------------------------------------------------------------------------------------------------------
		// Adicionando tela de fundo
		painelPrincipal.add(telaFundo);
		// Adiciona os componentes ao Painel principal.
		painelPrincipal.add(titulo);  
		painelPrincipal.add(pcliente); 
		painelPrincipal.add(pprofissional);	
		// Adiciona os componentes ao Painel principal.
		painelCliente.cadastrarComponent(cancelar);
		//-----------------------//-----------------------//-----------------------
		// Adiciona JPanels ao JFrame principal.
		telaPrincipal.add(painelPrincipal);	
		telaPrincipal.add(painelCliente);
		telaPrincipal.add(painelProfissional);
		//-------------------------------------------------------------------------------------------------------------------------
		//Habilitando a visibilidade do Jframe principal.
		painelPrincipal.setVisible(true);
		telaPrincipal.setVisible(true); 
	} 

	//-------------------------------------------------------------------------------------------------------------------------
	//METODO PARA GERENCIAR EVENTOS 
	public void actionPerformed(ActionEvent ae) { 
		if(ae.getActionCommand().equals("Cliente")) {  
			painelPrincipal.setVisible(false);
			painelCliente.bloquearLiberarCampos(true);
			painelCliente.cadastrarComponent(telaPrincipal);
			painelCliente.setVisible(true);
			cancelar.setVisible(true);

		}else if (ae.getActionCommand().equals("Profissional")) {
			painelPrincipal.setVisible(false);
			painelProfissional.cadastrarComponent(telaPrincipal);
			painelProfissional.setVisible(true);
			cancelar.setVisible(true);
		} 

		if (ae.getActionCommand().equals("Cancelar")) {
            painelCliente.setVisible(false);
            painelCliente.bloquearLiberarCampos(false);
			painelPrincipal.setVisible(true);
			cancelar.setVisible(false);
		} 
	}

	public void retornarTela(){
		painelPrincipal.setVisible(true);
    }






	
	public static void main(String[] args) {		
		
		new Site();  
	}
}
