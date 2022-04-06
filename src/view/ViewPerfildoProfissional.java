package view;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.util.*;
import control.*;
import model.*;

public class ViewPerfildoProfissional extends JPanel implements ActionListener{

    //Painel principal
    JPanel painelCliente;

    //Componentes para a etapa de Cadastro

    JTextField[] texto = new JTextField[8];
    JButton confirmar;
    JLabel[]  mensagemExterna = new JLabel[8];
    ImageIcon imagemFundo;
    JLabel telaFundo;
    Endereco e = new Endereco("null", "null","null","null", "null");
    ControlePerfilDoCliente cliente = new ControlePerfilDoCliente("null");

    //Componentes  para a etapa de visualizacao do perfil
    JTextField[] renomear = new JTextField[8];
    JButton visitarPerfil, home; JButton[] editor = new JButton[8];
    JLabel titulo; JLabel[] infoPerfil = new JLabel[8]; JLabel[] tracejado = new JLabel[2];
    
    
    public ViewPerfildoProfissional(){
        //Criando o Painel principal 
        painelCliente = new JPanel();
        painelCliente.setSize(1300, 700);
        painelCliente.setLayout(null); 
        //-----------------------//-----------------------//-----------------------
        //PAINEL DE CADASTRO
            // Criando e configurando imagem de fundo do JPanel.
            imagemFundo = new ImageIcon(getClass().getResource("backgroundprofissional.PNG"));
            telaFundo = new JLabel(imagemFundo);
            telaFundo.setBounds(345, -50, 1080, 811);
            telaFundo.setVisible(true);

            //Titulos e campos de texto 
            mensagemExterna[0] = new JLabel(" NOME COMPLETO ");
            mensagemExterna[0].setBounds(55, 30, 300, 50);

            texto[0] = new JTextField(" ");
            texto[0].setBounds(55, 65, 300, 30);
            //========

            mensagemExterna[1] = new JLabel(" CPF OU CNPJ ");
            mensagemExterna[1].setBounds(55, 95, 300, 50);
            
            texto[1] = new JTextField(" ");
            texto[1].setBounds(55, 130, 300, 30);
            //========

            mensagemExterna[2] = new JLabel(" IDADE ");
            mensagemExterna[2].setBounds(55, 160, 300, 50);
            
            texto[2] = new JTextField(" ");
            texto[2].setBounds(55, 195,  300, 30);
            //========
            //-------------------ENDERECO
            mensagemExterna[3] = new JLabel(" PAIS ");
            mensagemExterna[3].setBounds(55, 230, 300, 50);

            texto[3] = new JTextField(" ");
            texto[3].setBounds(55, 265, 300, 30);
            //========

            mensagemExterna[4] = new JLabel(" UF ");
            mensagemExterna[4].setBounds(55, 295, 300, 50);

            texto[4] = new JTextField(" ");
            texto[4].setBounds(55, 330, 300, 30);
            //========
            
            mensagemExterna[5] = new JLabel(" CIDADE ");
            mensagemExterna[5].setBounds(55, 360, 300, 50);
            
            texto[5] = new JTextField(" ");
            texto[5].setBounds(55, 395, 300, 30);
            //========
            
            mensagemExterna[6] = new JLabel(" CEP ");
            mensagemExterna[6].setBounds(55, 425, 300, 50);
            
            texto[6] = new JTextField(" ");
            texto[6].setBounds(55, 460, 300, 30);
            //========
            
            mensagemExterna[7] = new JLabel(" LOGRADOURO E CASA ");
            mensagemExterna[7].setBounds(55, 490, 300, 50);

            texto[7] = new JTextField(" ");
            texto[7].setBounds(55, 525, 300, 30);
            //========
            //-----------------------//-----------------------//-----------------------
            //Criando e configurando os botoes.
            confirmar = new JButton("Confirmar");
            confirmar.setBounds(55, 590, 130, 30);
            confirmar.addActionListener(this); 
            //-----------------------//-----------------------//-----------------------
            //Adicionando as componentes ao Painel.
            painelCliente.add(telaFundo);

            painelCliente.add(texto[0]); painelCliente.add(texto[1]); painelCliente.add(texto[2]); painelCliente.add(texto[3]);
            painelCliente.add(texto[4]); painelCliente.add(texto[5]); painelCliente.add(texto[6]); painelCliente.add(texto[7]);
        
            painelCliente.add(mensagemExterna[0]); painelCliente.add(mensagemExterna[1]); painelCliente.add(mensagemExterna[2]); painelCliente.add(mensagemExterna[3]);
            painelCliente.add(mensagemExterna[4]); painelCliente.add(mensagemExterna[5]); painelCliente.add(mensagemExterna[6]); painelCliente.add(mensagemExterna[7]);
            
            painelCliente.add(confirmar);
            //-----------------------//-----------------------//-----------------------
        //-------------------------------------------------------------------------------------------------------------------------
        //PAINEL PARA VISUALIZAR PERFIL
            titulo = new JLabel("T6.3");
            titulo.setFont(new Font("Arial", Font.BOLD, 100));
            titulo.setBounds(55, 30, 250, 100);

            infoPerfil[0] = new JLabel("NOME: ");
            infoPerfil[0].setFont(new Font("Arial", Font.BOLD, 35));
            infoPerfil[0].setBounds(335, 65, 540, 35);
            renomear[0] = new JTextField(" ");
            renomear[0].setBounds(335, 65, 540, 35);
            renomear[0].addActionListener(this);
            
            tracejado[0] = new JLabel("------------------------------------------------------------------------------------------------------------------------------ DADOS PESSOAIS ------------------------------------------------------------------------------------------------------------------------------");
            tracejado[0].setFont(new Font("Arial", Font.BOLD, 10));
            tracejado[0].setBounds(355, 140, 950, 10);
            
            infoPerfil[1] = new JLabel("CPF OU CPNJ: ");
            infoPerfil[1].setBounds(355, 165, 300, 30);
            renomear[1] = new JTextField(" ");
            renomear[1].setBounds(355, 165, 300, 30);
            renomear[1].addActionListener(this);
            
            infoPerfil[2] = new JLabel("IDADE");
            infoPerfil[2].setBounds(355, 215, 300, 30);
            renomear[2] = new JTextField(" ");
            renomear[2].setBounds(355, 215, 300, 30);
            renomear[2].addActionListener(this);
            
            tracejado[1] = new JLabel("---------------------------------------------------------------------------------------------------------------------------- DADOS DE ENDERECO ---------------------------------------------------------------------------------------------------------------------------");
            tracejado[1].setFont(new Font("Arial", Font.BOLD, 10));
            tracejado[1].setBounds(355, 280, 950, 10);

            infoPerfil[3] = new JLabel("PAIS");
            infoPerfil[3].setBounds(355, 305, 300, 30);
            renomear[3] = new JTextField(" ");
            renomear[3].setBounds(355, 305, 300, 30);
            renomear[3].addActionListener(this);
            
            infoPerfil[4] = new JLabel("UF");
            infoPerfil[4].setBounds(355, 355, 300, 30);
            renomear[4] = new JTextField(" ");
            renomear[4].setBounds(355, 355, 300, 30);
            renomear[4].addActionListener(this);
            
            infoPerfil[5] = new JLabel("CIDADE");
            infoPerfil[5].setBounds(355, 405, 300, 30);
            renomear[5] = new JTextField(" ");
            renomear[5].setBounds(355, 405, 300, 30);
            renomear[5].addActionListener(this);
            
            infoPerfil[6] = new JLabel("CEP");
            infoPerfil[6].setBounds(845, 305, 300, 30);
            renomear[6] = new JTextField(" ");
            renomear[6].setBounds(845, 305, 300, 30);
            renomear[6].addActionListener(this);
            
            infoPerfil[7] = new JLabel("LOGRADOURO");
            infoPerfil[7].setBounds(845, 355, 300, 30);
            renomear[7] = new JTextField(" ");
            renomear[7].setBounds(845, 355, 300, 30);
            renomear[7].addActionListener(this);

            //Criando e configurando os botoes.
            visitarPerfil = new JButton("MEU PERFIL");
            visitarPerfil.setFont(new Font("Arial", Font.BOLD, 35));
            visitarPerfil.setBounds(55, 150, 250, 50);
            visitarPerfil.addActionListener(this); 

            home = new JButton("HOME");
            home.setFont(new Font("Arial", Font.BOLD, 35));
            home.setBounds(55, 220, 250, 50);
            home.addActionListener(this); 

            editor[0] = new JButton("0");              editor[1] = new JButton("1");              editor[2] = new JButton("2");                
            editor[0].setBounds(1180, 90, 30, 30);  editor[1].setBounds(695, 165, 30, 30);  editor[2].setBounds(695, 215, 30, 30);
            editor[0].addActionListener(this);      editor[1].addActionListener(this);      editor[2].addActionListener(this);

            editor[3] = new JButton("3");              editor[4] = new JButton("4");              editor[5] = new JButton("5");                
            editor[3].setBounds(695, 305, 30, 30);  editor[4].setBounds(695, 355, 30, 30);  editor[5].setBounds(695, 405, 30, 30);
            editor[3].addActionListener(this);      editor[4].addActionListener(this);      editor[5].addActionListener(this);

            editor[6] = new JButton("6");              editor[7] = new JButton("7");            
            editor[6].setBounds(1180, 305, 30, 30); editor[7].setBounds(1180, 355, 30, 30); 
            editor[6].addActionListener(this);      editor[7].addActionListener(this);

            //Visibilidade
            titulo.setVisible(false);
            tracejado[0].setVisible(false); tracejado[1].setVisible(false);
            for(int j=0; j<8;j++) {  	   
                infoPerfil[j].setVisible(false);
                editor[j].setVisible(false);
                renomear[j].setVisible(false);
            }
            visitarPerfil.setVisible(false);
            home.setVisible(false);

            //Adicionando as componentes ao Painel.
            painelCliente.add(titulo);
            painelCliente.add(tracejado[0]); painelCliente.add(tracejado[1]);

            painelCliente.add(infoPerfil[0]); painelCliente.add(infoPerfil[1]); painelCliente.add(infoPerfil[2]); painelCliente.add(infoPerfil[3]);
            painelCliente.add(infoPerfil[4]); painelCliente.add(infoPerfil[5]); painelCliente.add(infoPerfil[6]); painelCliente.add(infoPerfil[7]);
       
            painelCliente.add(renomear[0]); painelCliente.add(renomear[1]); painelCliente.add(renomear[2]); painelCliente.add(renomear[3]);
            painelCliente.add(renomear[4]); painelCliente.add(renomear[5]); painelCliente.add(renomear[6]); painelCliente.add(renomear[7]);

            painelCliente.add(visitarPerfil); painelCliente.add(home);
            painelCliente.add(editor[0]); painelCliente.add(editor[1]); painelCliente.add(editor[2]); painelCliente.add(editor[3]);
            painelCliente.add(editor[4]); painelCliente.add(editor[5]); painelCliente.add(editor[6]); painelCliente.add(editor[7]);

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

            titulo.setText("T6.3");
            infoPerfil[0].setText(cliente.getNome());
            infoPerfil[1].setText("CPF/CNPJ: " + cliente.getCpf_cpnj());
            infoPerfil[2].setText("IDADE: " + cliente.getIdade() +" anos");
            infoPerfil[3].setText("PAIS: " + cliente.getPais());
            infoPerfil[4].setText("UF: " + cliente.getUf());
            infoPerfil[5].setText("CIDADE: " + cliente.getCidade());
            infoPerfil[6].setText("CEP: " + cliente.getCep());
            infoPerfil[7].setText("LOG e CASA: " + cliente.getLogradouro());
            
            titulo.setVisible(true);
            tracejado[0].setVisible(true); tracejado[1].setVisible(true);
            for(int j=0; j<8;j++) {  	   
                infoPerfil[j].setVisible(true);
                editor[j].setVisible(true);
            }
            visitarPerfil.setVisible(true);
            home.setVisible(true); 
        	

		}else if (ae.getActionCommand().equals("0")) {
            renomear[0].setVisible(true);
            
            if (ae.getActionCommand().equals("Enter")) {
                cliente.setNome(renomear[0].getText());
                renomear[0].setVisible(false);
            }
            
        }else if (ae.getActionCommand().equals("1")) {
            renomear[1].setVisible(true);
            cliente.setCpf_cpnj(renomear[1].getText());
            
        }else if (ae.getActionCommand().equals("2")) {
            renomear[2].setVisible(true);
            cliente.setIdade(renomear[2].getText());
            
        }else if (ae.getActionCommand().equals("3")) {
            renomear[3].setVisible(true);
            cliente.setPais(renomear[3].getText());
            
        }else if (ae.getActionCommand().equals("4")) {
            renomear[4].setVisible(true);
            cliente.setUf(renomear[4].getText());
            
        }else if (ae.getActionCommand().equals("5")) {
            renomear[5].setVisible(true);
            cliente.setCidade(renomear[5].getText());
            
        }else if (ae.getActionCommand().equals("6")) {
            renomear[6].setVisible(true);
            cliente.setCep(renomear[6].getText());
            
        }else if (ae.getActionCommand().equals("7")) {
            renomear[7].setVisible(true);
            cliente.setLogradouro(renomear[7].getText()); 
            
        }
        
        
    }
}
    
