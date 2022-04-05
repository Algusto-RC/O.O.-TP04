package view;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.AncestorListener;

import java.util.*;
import model.*;


public class ViewPerfildoCliente extends JPanel implements ActionListener{

    JPanel painelCliente;
    JTextField texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8;
    
    JLabel  mensagemExterna1, mensagemExterna2, mensagemExterna3, mensagemExterna4,
            mensagemExterna5, mensagemExterna6, mensagemExterna7, mensagemExterna8;

    public ViewPerfildoCliente(){
        //Criando o Painel principal 
        painelCliente = new JPanel();
        painelCliente.setBounds(800, 5, 400, 700);
        painelCliente.setLayout(null); 
        //-----------------------//-----------------------//-----------------------
        //Titulos e campos de texto 
        mensagemExterna1 = new JLabel(" NOME COMPLETO ");
		mensagemExterna1.setBounds(55, 30, 300, 50);
		mensagemExterna1.setVisible(true);

        texto1 = new JTextField("  Digite seu nome aqui");
		texto1.setBounds(55, 65, 300, 30);
		texto1.setVisible(true);
        //========

        mensagemExterna2 = new JLabel(" CPF OU CNPJ ");
		mensagemExterna2.setBounds(55, 95, 300, 50);
		mensagemExterna2.setVisible(true);

        texto2 = new JTextField("  Digite seu CPF ou CNPJ aqui");
		texto2.setBounds(55, 130, 300, 30);
		texto2.setVisible(true);
        //========

        mensagemExterna3 = new JLabel(" IDADE ");
		mensagemExterna3.setBounds(55, 160, 300, 50);
		mensagemExterna3.setVisible(true);

        texto3 = new JTextField("  Digite sua idade aqui");
		texto3.setBounds(55, 195,  300, 30);
		texto3.setVisible(true);
        //========
        
        //-------------------ENDERECO
        mensagemExterna4 = new JLabel(" PAIS ");
		mensagemExterna4.setBounds(55, 230, 300, 50);
		mensagemExterna4.setVisible(true);

        texto4 = new JTextField("  Digite seu pais aqui");
		texto4.setBounds(55, 265, 300, 30);
		texto4.setVisible(true);
        //========

        mensagemExterna5 = new JLabel(" UF ");
		mensagemExterna5.setBounds(55, 295, 300, 50);
		mensagemExterna5.setVisible(true);

        texto5 = new JTextField("  Digite sua UF aqui");
		texto5.setBounds(55, 330, 300, 30);
		texto5.setVisible(true);
        //========
        
        mensagemExterna6 = new JLabel(" CIDADE ");
		mensagemExterna6.setBounds(55, 360, 300, 50);
		mensagemExterna6.setVisible(true);

        texto6 = new JTextField("  Digite sua cidade aqui");
		texto6.setBounds(55, 395, 300, 30);
		texto6.setVisible(true);
        //========
        
        mensagemExterna7 = new JLabel(" CEP ");
		mensagemExterna7.setBounds(55, 425, 300, 50);
		mensagemExterna7.setVisible(true);

        texto7 = new JTextField("  Digite seu CEP aqui");
		texto7.setBounds(55, 460, 300, 30);
		texto7.setVisible(true);
        //========
        
        mensagemExterna8 = new JLabel(" LOGRADOURO ");
		mensagemExterna8.setBounds(55, 490, 300, 50);
		mensagemExterna8.setVisible(true);

        texto8 = new JTextField("  Digite seu logradouro aqui");
		texto8.setBounds(55, 525, 300, 30);
		texto8.setVisible(true);
        //========
        //-----------------------//-----------------------//-----------------------
        //Criando e configurando os botoes.
        
        //-----------------------//-----------------------//-----------------------
        //Adicionando as componentes ao Painel.
        painelCliente.add(texto1); painelCliente.add(texto2); painelCliente.add(texto3); painelCliente.add(texto4);
        painelCliente.add(texto5); painelCliente.add(texto6); painelCliente.add(texto7); painelCliente.add(texto8);
       
        painelCliente.add(mensagemExterna1); painelCliente.add(mensagemExterna2); painelCliente.add(mensagemExterna3); painelCliente.add(mensagemExterna4);
        painelCliente.add(mensagemExterna5); painelCliente.add(mensagemExterna6); painelCliente.add(mensagemExterna7); painelCliente.add(mensagemExterna8);
        
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



    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Confirmar")) {  

		}else if (ae.getActionCommand().equals("Cancelar")) {
            painelCliente.setVisible(false);
		} 
    }
    



//-------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        new ViewPerfildoCliente();
    }
}
