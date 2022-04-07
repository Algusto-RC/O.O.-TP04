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
    Endereco e = new Endereco("null", "null", "null", "null", "null");
    ControlePerfilDoCliente cliente = new ControlePerfilDoCliente("null", "null", "null", e);

    //Componentes  para o campo de visualizacao do perfil
    JTextField[] renomear = new JTextField[8];
    JButton visitarPerfil, excluirPerfil, sim, nao, home; JButton[] editor = new JButton[8];
    JLabel titulo, msgAviso, msgDespedida, msgSobreposta; JLabel[] infoPerfil = new JLabel[8]; JLabel[] tracejado = new JLabel[2];
    JDialog dialogoDeConfirmacao;
    JPanel painelDialogo;

    //Componentes para o campo de contratação de profissionais 
    JComboBox filtroPesquisa;
    JButton verContratos, cancele, confirme; JButton [] profissionais = new JButton[25];
    JTextArea[] detalheProfissional = new JTextArea[25];
    
    public ViewPerfildoProfissional(){
        //Criando o Painel principal 
            painelCliente = new JPanel();
            painelCliente.setSize(1300, 700);
            painelCliente.setLayout(null); 
        //-----------------------//-----------------------//-----------------------
        //PAINEL DE CADASTRO
            // Criando e configurando a imagem que aparece durante o cadastro de cliente.
                imagemFundo = new ImageIcon(getClass().getResource("backgroundcliente.PNG"));
                telaFundo = new JLabel(imagemFundo);
                telaFundo.setBounds(345, -50, 1080, 811);
                telaFundo.setVisible(true);

            //Criando e configurando  Titulos e campos de texto que aparecem durante o cadastro de cliente.
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
            //Criando e configurando o botao que aparece durante o cadastro.
                confirmar = new JButton("Confirmar");
                confirmar.setBounds(85, 590, 230, 30);
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
            // Criando e configurando os titulos e as caixas de texto.
                titulo = new JLabel("T6.3");
                titulo.setFont(new Font("Arial", Font.BOLD, 100));
                titulo.setBounds(55, 30, 250, 100);

                msgSobreposta = new JLabel("VOLTE SEMPRE!");
                msgSobreposta.setFont(new Font("Arial", Font.BOLD, 50));
                msgSobreposta.setForeground(Color.black);
                msgSobreposta.setBounds(433, 303, 450, 50);

                msgDespedida = new JLabel("VOLTE SEMPRE!");
                msgDespedida.setFont(new Font("Arial", Font.BOLD, 50));
                msgDespedida.setForeground(Color.pink);
                msgDespedida.setBounds(430, 300, 450, 50);

                //========
                infoPerfil[0] = new JLabel("NOME: ");
                infoPerfil[0].setFont(new Font("Arial", Font.BOLD, 35));
                infoPerfil[0].setBounds(335, 65, 540, 35);
                renomear[0] = new JTextField(" ");
                renomear[0].setBounds(335, 65, 540, 35);
                renomear[0].addActionListener(this);
                //========
                tracejado[0] = new JLabel("------------------------------------------------------------------------------------------------------------------------------ DADOS PESSOAIS ------------------------------------------------------------------------------------------------------------------------------");
                tracejado[0].setFont(new Font("Arial", Font.BOLD, 10));
                tracejado[0].setBounds(355, 140, 950, 10);
                //========
                infoPerfil[1] = new JLabel("CPF OU CPNJ: ");
                infoPerfil[1].setBounds(355, 165, 300, 30);
                renomear[1] = new JTextField(" ");
                renomear[1].setBounds(355, 165, 300, 30);
                renomear[1].addActionListener(this);
                //========
                infoPerfil[2] = new JLabel("IDADE");
                infoPerfil[2].setBounds(355, 215, 300, 30);
                renomear[2] = new JTextField(" ");
                renomear[2].setBounds(355, 215, 300, 30);
                renomear[2].addActionListener(this);
                //========
                tracejado[1] = new JLabel("---------------------------------------------------------------------------------------------------------------------------- DADOS DE ENDERECO ---------------------------------------------------------------------------------------------------------------------------");
                tracejado[1].setFont(new Font("Arial", Font.BOLD, 10));
                tracejado[1].setBounds(355, 280, 950, 10);
                //========
                infoPerfil[3] = new JLabel("PAIS");
                infoPerfil[3].setBounds(355, 305, 300, 30);
                renomear[3] = new JTextField(" ");
                renomear[3].setBounds(355, 305, 300, 30);
                renomear[3].addActionListener(this);
                //========
                infoPerfil[4] = new JLabel("UF");
                infoPerfil[4].setBounds(355, 355, 300, 30);
                renomear[4] = new JTextField(" ");
                renomear[4].setBounds(355, 355, 300, 30);
                renomear[4].addActionListener(this);
                //========
                infoPerfil[5] = new JLabel("CIDADE");
                infoPerfil[5].setBounds(355, 405, 300, 30);
                renomear[5] = new JTextField(" ");
                renomear[5].setBounds(355, 405, 300, 30);
                renomear[5].addActionListener(this);
                //========
                infoPerfil[6] = new JLabel("CEP");
                infoPerfil[6].setBounds(845, 305, 300, 30);
                renomear[6] = new JTextField(" ");
                renomear[6].setBounds(845, 305, 300, 30);
                renomear[6].addActionListener(this);
                //========
                infoPerfil[7] = new JLabel("LOGRADOURO");
                infoPerfil[7].setBounds(845, 355, 300, 30);
                renomear[7] = new JTextField(" ");
                renomear[7].setBounds(845, 355, 300, 30);
                renomear[7].addActionListener(this);
                //========
                //-----------------------//-----------------------//-----------------------
            //Criando e configurando os botoes.
                visitarPerfil = new JButton("MEU PERFIL");
                visitarPerfil.setFont(new Font("Arial", Font.BOLD, 35));
                visitarPerfil.setBounds(55, 150, 250, 50);
                visitarPerfil.addActionListener(this); 
                //========
                excluirPerfil = new JButton("EXCLUIR PERFIL");
                excluirPerfil.setFont(new Font("Arial", Font.BOLD, 25));
                excluirPerfil.setBounds(945, 590, 260, 30);
                excluirPerfil.addActionListener(this); 
                //========
                home = new JButton("HOME");
                home.setFont(new Font("Arial", Font.BOLD, 35));
                home.setBounds(55, 220, 250, 50);
                home.addActionListener(this); 
                //========
                //======== Estes botoes sao utilizados para editar os dados no campo de visualizacao de perfil 
                editor[0] = new JButton("0");           editor[1] = new JButton("1");           editor[2] = new JButton("2");                
                editor[0].setBounds(1180, 90, 30, 30);  editor[1].setBounds(695, 165, 30, 30);  editor[2].setBounds(695, 215, 30, 30);
                editor[0].addActionListener(this);      editor[1].addActionListener(this);      editor[2].addActionListener(this);
                
                editor[3] = new JButton("3");           editor[4] = new JButton("4");           editor[5] = new JButton("5");                
                editor[3].setBounds(695, 305, 30, 30);  editor[4].setBounds(695, 355, 30, 30);  editor[5].setBounds(695, 405, 30, 30);
                editor[3].addActionListener(this);      editor[4].addActionListener(this);      editor[5].addActionListener(this);

                editor[6] = new JButton("6");           editor[7] = new JButton("7");            
                editor[6].setBounds(1180, 305, 30, 30); editor[7].setBounds(1180, 355, 30, 30); 
                editor[6].addActionListener(this);      editor[7].addActionListener(this);
                //========
                //-----------------------//-----------------------//-----------------------
            //Criando e configurando a caixa de dialogo responsavel pela confirmacao da exclusao do perfil
                dialogoDeConfirmacao = new JDialog();
                dialogoDeConfirmacao.setSize(350, 150);
                dialogoDeConfirmacao.setLocationRelativeTo(painelCliente);
                    //Criando e configurando um painel para o dialogoDeConfirmacao
                        painelDialogo = new JPanel();
                        painelDialogo.setSize(350, 150);
                        painelDialogo.setLayout(null);
                        //========
                    //Criando e configurando o JLabel vinculado ao dialogoDeConfirmacao
                        msgAviso = new JLabel("Tem certeza que deseja excluir este perfil?");
                        msgAviso.setBounds(40, 25, 250, 20);
                        msgAviso.setVisible(true);
                        //========
                    //Criando e configurando os botoes vinculados ao dialogoDeConfirmacao
                        sim = new JButton("SIM");          nao = new JButton("NAO");
                        sim.setBounds(80, 60, 60, 35);     nao.setBounds(185, 60, 60, 35);
                        sim.addActionListener(this);       nao.addActionListener(this);
                        sim.setVisible(true);              nao.setVisible(true);
                        //========
                    //Adicionando as componentes ao Dialogo
                        painelDialogo.add(msgAviso); painelDialogo.add(sim); painelDialogo.add(nao); 
                        dialogoDeConfirmacao.add(painelDialogo);
                        //========
                //-----------------------//-----------------------//-----------------------
            //Visibilidade
                /*Este trecho de codigo permite desabilitar todos os componentes do campo de visualizacao de perfil,
                  isto eh importante para que nao haja comflito com os componentes de outros campos 
                */
                titulo.setVisible(false);
                msgDespedida.setVisible(false); msgSobreposta.setVisible(false);
                tracejado[0].setVisible(false); tracejado[1].setVisible(false);
                for(int j=0; j<8;j++) {  	   
                    infoPerfil[j].setVisible(false);
                    editor[j].setVisible(false);
                    renomear[j].setVisible(false);
                }
                visitarPerfil.setVisible(false);
                excluirPerfil.setVisible(false);
                home.setVisible(false);
                dialogoDeConfirmacao.setVisible(false);
            //-----------------------//-----------------------//-----------------------
            //Adicionando as componentes ao Painel.
                painelCliente.add(titulo); painelCliente.add(msgDespedida); painelCliente.add(msgSobreposta);
                painelCliente.add(tracejado[0]); painelCliente.add(tracejado[1]);

                painelCliente.add(infoPerfil[0]); painelCliente.add(infoPerfil[1]); painelCliente.add(infoPerfil[2]); painelCliente.add(infoPerfil[3]);
                painelCliente.add(infoPerfil[4]); painelCliente.add(infoPerfil[5]); painelCliente.add(infoPerfil[6]); painelCliente.add(infoPerfil[7]);
        
                painelCliente.add(renomear[0]); painelCliente.add(renomear[1]); painelCliente.add(renomear[2]); painelCliente.add(renomear[3]);
                painelCliente.add(renomear[4]); painelCliente.add(renomear[5]); painelCliente.add(renomear[6]); painelCliente.add(renomear[7]);

                painelCliente.add(visitarPerfil); painelCliente.add(excluirPerfil); painelCliente.add(home);
                painelCliente.add(editor[0]); painelCliente.add(editor[1]); painelCliente.add(editor[2]); painelCliente.add(editor[3]);
                painelCliente.add(editor[4]); painelCliente.add(editor[5]); painelCliente.add(editor[6]); painelCliente.add(editor[7]);
                //-----------------------//-----------------------//-----------------------
        //-------------------------------------------------------------------------------------------------------------------------
        //PAINEL PARA CONTRATACAO DE PROFISSIONAIS
            //Criando e configurando os JComboBox para o filtro de pesquisa
                filtroPesquisa = new JComboBox<>();

            //Criando e configurando os JButtons e os JTextArea para a contratacao de profissionais
                verContratos = new JButton("Ver Contratos");
                verContratos.setBounds(300, 50, 100, 50);
                verContratos.addActionListener(this); 

                profissionais[0] = new JButton(" ");
                profissionais[0].setFont(new Font("Arial", Font.BOLD, 35));
                profissionais[0].setBounds(300, 50, 100, 50);
                profissionais[0].addActionListener(this); 
                
                detalheProfissional[0] = new JTextArea("");
                detalheProfissional[0].setFont(new Font("Arial", Font.BOLD, 35));
                detalheProfissional[0].setBounds(300, 50, 100, 50);
                


                confirme = new JButton("Fechar Negocio"); cancele = new JButton("Voltar"); 
            //-----------------------//-----------------------//-----------------------
            //Adicionando as componentes ao Painel.
            

        //-------------------------------------------------------------------------------------------------------------------------
        //Ativando visibilidade do painel central.        
        painelCliente.setVisible(true);
    }
//-------------------------------------------------------------------------------------------------------------------------
//------      ------      ------      ------      ------      ------      ------      ------      ------      ------      
//------------------------------------------------------------------------------------------------------------------------- 
    //Metodo responsavel pelo cadastro dos dados
        public void cadastrar(){
            cliente.setNome(texto[0].getText());
            cliente.setCpf_cpnj(texto[1].getText());
            cliente.setIdade(texto[2].getText());
            e.setPais(texto[3].getText());
            e.setUf(texto[4].getText());
            e.setCidade(texto[5].getText());
            e.setCep(texto[6].getText());
            e.setLogradouro(texto[7].getText()); 
        }
    //-------------------------------------------------------------------------------------------------------------------------
    //Metodo responsavel pela edicao dos dados que aparecem no perfil
        public void editar(int indicador){
            switch (indicador) {
                case 0:
                    renomear[0].setVisible(true);
                    infoPerfil[0].setVisible(false);
                    
                    renomear[0].addKeyListener(new java.awt.event.KeyAdapter(){
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                            if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                                cliente.setNome(renomear[0].getText());
                                renomear[0].setVisible(false);
                                infoPerfil[0].setText(cliente.getNome());
                                infoPerfil[0].setVisible(true);
                            }
                        }
                    });
                    break;
                case 1:
                    renomear[1].setVisible(true);
                    infoPerfil[1].setVisible(false);
                    
                    renomear[1].addKeyListener(new java.awt.event.KeyAdapter(){
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                            if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                            cliente.setCpf_cpnj(renomear[1].getText());
                                renomear[1].setVisible(false);
                                infoPerfil[1].setText("CPF/CNPJ: " + cliente.getCpf_cpnj());
                                infoPerfil[1].setVisible(true);
                            }
                        }
                    });
                    break;
                case 2:
                    renomear[2].setVisible(true);
                    infoPerfil[2].setVisible(false);
                    
                    renomear[2].addKeyListener(new java.awt.event.KeyAdapter(){
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                            if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                                cliente.setIdade(renomear[2].getText());
                                renomear[2].setVisible(false);
                                infoPerfil[2].setText("IDADE: " + cliente.getIdade() + " anos");
                                infoPerfil[2].setVisible(true);
                            }
                        }
                    });
                    break;
                case 3:
                    renomear[3].setVisible(true);
                    infoPerfil[3].setVisible(false);
                    
                    renomear[3].addKeyListener(new java.awt.event.KeyAdapter(){
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                            if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                                e.setPais(renomear[3].getText());
                                renomear[3].setVisible(false);
                                infoPerfil[3].setText("PAIS: " + e.getPais());
                                infoPerfil[3].setVisible(true);
                            }
                        }
                    });
                    break;
                case 4:
                    renomear[4].setVisible(true);
                    infoPerfil[4].setVisible(false);
                    
                    renomear[4].addKeyListener(new java.awt.event.KeyAdapter(){
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                            if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                                e.setUf(renomear[4].getText());
                                renomear[4].setVisible(false);
                                infoPerfil[4].setText("UF: " + e.getUf());
                                infoPerfil[4].setVisible(true);
                            }
                        }
                    });
                    break;
                case 5:
                    renomear[5].setVisible(true);
                    infoPerfil[5].setVisible(false);
                    
                    renomear[5].addKeyListener(new java.awt.event.KeyAdapter(){
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                            if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                                e.setCidade(renomear[5].getText());
                                renomear[5].setVisible(false);
                                infoPerfil[5].setText("CIDADE: " + e.getCidade());
                                infoPerfil[5].setVisible(true);
                            }
                        }
                    });
                    break;
                case 6:
                    renomear[6].setVisible(true);
                    infoPerfil[6].setVisible(false);
                    
                    renomear[6].addKeyListener(new java.awt.event.KeyAdapter(){
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                            if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                                e.setCep(renomear[6].getText());
                                renomear[6].setVisible(false);
                                infoPerfil[6].setText("CEP: " + e.getCep());
                                infoPerfil[6].setVisible(true);
                            }
                        }
                    });
                    break;
                case 7:
                    renomear[7].setVisible(true);
                    infoPerfil[7].setVisible(false);
                    
                    renomear[7].addKeyListener(new java.awt.event.KeyAdapter(){
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                            if (evt.getKeyCode() == KeyEvent.VK_ENTER){
                                e.setLogradouro(renomear[7].getText()); 
                                renomear[7].setVisible(false);
                                infoPerfil[7].setText("LOG E CASA: " + e.getLogradouro());
                                infoPerfil[7].setVisible(true);
                            }
                        }
                    });
                    break;
            }
        }
    //-------------------------------------------------------------------------------------------------------------------------
    //Metodo responsavel pela exclusao do perfil
        public void deletar(){
            painelCliente.setVisible(true);
        }
    //Metodo responsavel pelo filtro de busca
        public void pesquisar(){
            painelCliente.setVisible(true);
        }
    //-------------------------------------------------------------------------------------------------------------------------
    //Metodos Adicionais
        /* Estes metodos surgiram para suprir necessidades durante o desenvolvimento do codigo,
           alguns tem chamada unica durante toda a execucao do codigo 
        */

        //Sobrecarga de metodos
            //Metodos utilizado para vincular o painel aqui criado com o JFrame da classe Site
            public void cadastrarComponent(JFrame princComponent) {
                princComponent.add(painelCliente);    
            }
            //Metodos utilizado para vincular um botao criado na classe Site com o painel aqui criado.
            public void cadastrarComponent(JButton bigButton) {
                painelCliente.add(bigButton);    
            }
        //Metodo que habilita e desabilita a visualizacao dos componentes da sessao de cadastro
        public void bloquearLiberarCampos( boolean acao){
        for(int j=0; j<8;j++) {  	   
            texto[j].setVisible(acao);
            mensagemExterna[j].setVisible(acao);
        }
            confirmar.setVisible(acao);
        }
//-------------------------------------------------------------------------------------------------------------------------
//------      ------      ------      ------      ------      ------      ------      ------      ------      ------      
//------------------------------------------------------------------------------------------------------------------------- 
    //Metodo onde os eventos serao executados
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Confirmar")) { 
            
            /*Quando o botao 'Confirmar' for apertado, 
              todo o processo de cadastro sera realizado 
              com a chamada do metodo cadastrar()
            */  
            cadastrar(); 
        	//========
                /*Este trecho de codigo eh responsavel por 
                desabilitar todos os componentes da etapa de cadastro
                */
                telaFundo.setVisible(false);
                for(int j=0; j<8;j++) {  	   
                texto[j].setVisible(false);
                mensagemExterna[j].setVisible(false);
                }
                confirmar.setVisible(false); 
            //========
                /*Este trecho de codigo eh responsavel por 
                habilitar os componentes iniciais para a segunda etapa de funcionamento do codigo
                */
                titulo.setVisible(true);
                visitarPerfil.setVisible(true);
                home.setVisible(true);
            //========
        //-----------------------//-----------------------//-----------------------
		}else if (ae.getActionCommand().equals("MEU PERFIL")) {
            /*Ao clicar em 'MEU PERFIL', uma tela com todos os dados cadastrados
              ira aparecer, permitindo visualizacao e edicao destes dados.
            */
            titulo.setText("T6.3");
            infoPerfil[0].setText(cliente.getNome());
            infoPerfil[1].setText("CPF/CNPJ: " + cliente.getCpf_cpnj());
            infoPerfil[2].setText("IDADE: " + cliente.getIdade() +" anos");
            infoPerfil[3].setText("PAIS: " + e.getPais());
            infoPerfil[4].setText("UF: " + e.getUf());
            infoPerfil[5].setText("CIDADE: " + e.getCidade());
            infoPerfil[6].setText("CEP: " + e.getCep());
            infoPerfil[7].setText("LOG e CASA: " + e.getLogradouro());
            //========
                /*Este trecho de codigo eh responsavel por 
                  habilitar todos os componentes do campo de visualizacao do perfil
                */
                tracejado[0].setVisible(true); tracejado[1].setVisible(true);
                for(int j=0; j<8;j++) {  	   
                    infoPerfil[j].setVisible(true);
                    editor[j].setVisible(true);
                }
                excluirPerfil.setVisible(true);
            } 
            //========
                /*Este trecho de codigo eh responsavel pela edicao dos dados cadastrados
                  Existe uma realacao de um botao para um campo, logo, quando o botao
                  vinculado a um campo for apertado, a edicao sera habilitada.
                */
                else if (ae.getActionCommand().equals("0")) {
                    editar(0);
                    
                }else if (ae.getActionCommand().equals("1")) {
                    editar(1);
                    
                }else if (ae.getActionCommand().equals("2")) {
                    editar(2);
                    
                }else if (ae.getActionCommand().equals("3")) {
                    editar(3);
                    
                }else if (ae.getActionCommand().equals("4")) {
                    editar(4);
                    
                }else if (ae.getActionCommand().equals("5")) {
                    editar(5);
                    
                }else if (ae.getActionCommand().equals("6")) {
                    editar(6);
                    
                }else if (ae.getActionCommand().equals("7")) {
                    editar(7);
                }

        else if (ae.getActionCommand().equals("EXCLUIR PERFIL")) {
            dialogoDeConfirmacao.setVisible(true);
        } 
            else if (ae.getActionCommand().equals("SIM")) {
                //Trecho de cod que desabilita todos os componentes da tela
                titulo.setVisible(false);
                msgDespedida.setVisible(false);
                tracejado[0].setVisible(false); tracejado[1].setVisible(false);
                for(int j=0; j<8;j++) {  	   
                    infoPerfil[j].setVisible(false);
                    editor[j].setVisible(false);
                    renomear[j].setVisible(false);
                }
                visitarPerfil.setVisible(false);
                excluirPerfil.setVisible(false);
                home.setVisible(false);
                dialogoDeConfirmacao.setVisible(false);
                
                //Ativacao da mensagem de despedida
                msgDespedida.setVisible(true);
                msgSobreposta.setVisible(true);
                
            }else if (ae.getActionCommand().equals("NAO")) {
                dialogoDeConfirmacao.setVisible(false);
            } 

        //-----------------------//-----------------------//-----------------------
        else if (ae.getActionCommand().equals("HOME")) {
            //Trecho de cod que desabilita todos os componentes da tela
            msgDespedida.setVisible(false); msgSobreposta.setVisible(false);
            tracejado[0].setVisible(false); tracejado[1].setVisible(false);
            for(int j=0; j<8;j++) {  	   
                infoPerfil[j].setVisible(false);
                editor[j].setVisible(false);
                renomear[j].setVisible(false);
            }
            excluirPerfil.setVisible(false);
            dialogoDeConfirmacao.setVisible(false);
        }
    }
}
    
