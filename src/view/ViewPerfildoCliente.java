package view;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.util.*;
import control.*;
import model.*;

public class ViewPerfildoCliente extends JPanel implements ActionListener{

    JPanel painelCliente;
    JTextField[] texto = new JTextField[8];
    JButton confirmar;
    JLabel[]  mensagemExterna = new JLabel[8];
    Endereco e = new Endereco("null", "null","null","null", "null");
    ControlePerfilDoCliente cliente = new ControlePerfilDoCliente("null", "null","null",e);
    
    
    public ViewPerfildoCliente(){
        //Criando o Painel principal 
        painelCliente = new JPanel();
        painelCliente.setSize(1300, 700);
        painelCliente.setLayout(null); 
        //-----------------------//-----------------------//-----------------------
        //Titulos e campos de texto 
        mensagemExterna[0] = new JLabel(" NOME COMPLETO ");
		mensagemExterna[0].setBounds(55, 30, 300, 50);
		

		texto[0] = new JTextField("  Digite seu nome aqui");
		texto[0].setBounds(55, 65, 300, 30);
		
        //========

		mensagemExterna[1] = new JLabel(" CPF OU CNPJ ");
		mensagemExterna[1].setBounds(55, 95, 300, 50);
		

		texto[1] = new JTextField("  Digite seu CPF ou CNPJ aqui");
		texto[1].setBounds(55, 130, 300, 30);
		
        //========

		mensagemExterna[2] = new JLabel(" IDADE ");
		mensagemExterna[2].setBounds(55, 160, 300, 50);
		

		texto[2] = new JTextField("  Digite sua idade aqui");
		texto[2].setBounds(55, 195,  300, 30);
		
        //========
        
        //-------------------ENDERECO
		mensagemExterna[3] = new JLabel(" PAIS ");
		mensagemExterna[3].setBounds(55, 230, 300, 50);
		

		texto[3] = new JTextField("  Digite seu pais aqui");
		texto[3].setBounds(55, 265, 300, 30);
		
        //========

		mensagemExterna[4] = new JLabel(" UF ");
		mensagemExterna[4].setBounds(55, 295, 300, 50);
		

		texto[4] = new JTextField("  Digite sua UF aqui");
		texto[4].setBounds(55, 330, 300, 30);
		
        //========
        
		mensagemExterna[5] = new JLabel(" CIDADE ");
		mensagemExterna[5].setBounds(55, 360, 300, 50);
		

		texto[5] = new JTextField("  Digite sua cidade aqui");
		texto[5].setBounds(55, 395, 300, 30);
		
        //========
        
		mensagemExterna[6] = new JLabel(" CEP ");
		mensagemExterna[6].setBounds(55, 425, 300, 50);
		

		texto[6] = new JTextField("  Digite seu CEP aqui");
		texto[6].setBounds(55, 460, 300, 30);
		
        //========
        
		mensagemExterna[7] = new JLabel(" LOGRADOURO E CASA ");
		mensagemExterna[7].setBounds(55, 490, 300, 50);
		

		texto[7] = new JTextField("  Digite seu logradouro e casa aqui");
		texto[7].setBounds(55, 525, 300, 30);
		
        //========
        //-----------------------//-----------------------//-----------------------
        //Criando e configurando os botoes.
		confirmar = new JButton("Confirmar");
		confirmar.setBounds(55, 590, 130, 30);
		confirmar.addActionListener(this); 
		
        //-----------------------//-----------------------//-----------------------
        //Adicionando as componentes ao Painel.
        painelCliente.add(texto[0]); painelCliente.add(texto[1]); painelCliente.add(texto[2]); painelCliente.add(texto[3]);
        painelCliente.add(texto[4]); painelCliente.add(texto[5]); painelCliente.add(texto[6]); painelCliente.add(texto[7]);
       
        painelCliente.add(mensagemExterna[0]); painelCliente.add(mensagemExterna[1]); painelCliente.add(mensagemExterna[2]); painelCliente.add(mensagemExterna[3]);
        painelCliente.add(mensagemExterna[4]); painelCliente.add(mensagemExterna[5]); painelCliente.add(mensagemExterna[6]); painelCliente.add(mensagemExterna[7]);
        
        painelCliente.add(confirmar);
        //-----------------------//-----------------------//-----------------------
        //Ativando visibilidade.
        
        painelCliente.setVisible(true);
    }



    public void cadastrar(){
        painelCliente.setVisible(true);
    }

    public void editar(){
        painelCliente.setVisible(true);
    }
    public void deletar(){
        painelCliente.setVisible(true);
    }
    public void pesquisar(){
        painelCliente.setVisible(true);
    }

    
    //Sobrecarga de metodos
    public void cadastrarComponent(JFrame princComponent) {
		princComponent.add(painelCliente);    
	}

    public void cadastrarComponent(JButton bigButton) {
		painelCliente.add(bigButton);    
	}
    
    public void bloquearLiberarCampos( boolean acao){
       for(int j=0; j<8;j++) {  	   
    	   texto[j].setVisible(acao);
    	   mensagemExterna[j].setVisible(acao);
       }
    	confirmar.setVisible(acao);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Confirmar")) {  
        	cliente.setNome(texto[0].getText());
        	cliente.setCpf_cpnj(texto[1].getText());
        	cliente.setIdade(texto[2].getText());
        	cliente.setPais(texto[3].getText());
        	cliente.setUf(texto[4].getText());
        	cliente.setCidade(texto[5].getText());
        	cliente.setCep(texto[6].getText());
        	cliente.setLogradouro(texto[7].getText()); 
        	

        	
        	for(int j=0; j<8;j++) {  	   
         	   texto[j].setVisible(false);
         	   mensagemExterna[j].setVisible(false);
            }
         	confirmar.setVisible(false);
         	
        	
        	
        	
        	
        	
		} 
    }
    



//-------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        new ViewPerfildoCliente();
    }
}
