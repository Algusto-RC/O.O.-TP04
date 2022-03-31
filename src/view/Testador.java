package view;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

public class Testador implements ActionListener{
    JTextField jtf; 
    JButton jbtnRev; 
    JLabel jlabPrompt, jlabContents;  

    public Testador() { 
        // Cria um novo container JFrame.  
        JFrame jfrm = new JFrame("Marido de aluguel T6.3"); 
        // Especifica o uso do FlowLayout.   
        jfrm.setLayout(new FlowLayout()); 
        // Define o tamanho do frame.  
        jfrm.setSize(600, 600); 
        // Encerra o programa caso o usuário feche a aplicação.  
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //Cria um campo de texto.  
        jtf = new JTextField(10); 
        // Define uma ação pata o campo de texto.  
        jtf.setActionCommand("myTF"); 
        // Cria o botão com para transformar todas as letras em maiúsculo.  
        JButton jbtnRev = new JButton("Vai ficar grande"); 
        // Adiciona eventos.  
        jtf.addActionListener(this); 
        jbtnRev.addActionListener(this); 
        // Armazena a nova string no campo de texto.  
        jlabPrompt = new JLabel("Digite um texto: "); 
        jlabContents = new JLabel(""); 
        // Adiciona os componentes ao painel de conteúdo.  
        jfrm.add(jlabPrompt); 
        jfrm.add(jtf);  
        jfrm.add(jbtnRev);  
        jfrm.add(jlabContents); 
        // Mostra o frame construído.  
        jfrm.setVisible(true); 
    } 
    //Método para gerência de eventos 
    public void actionPerformed(ActionEvent ae) { 
        if(ae.getActionCommand().equals("Vai ficar grande")) { 
            // Converte as letras para maiúsculo caso o botão seja pressionado.   
            String orgStr = jtf.getText(); 
            String resStr = orgStr.toUpperCase(); 
            // Cria rótulos.  
            jtf.setText(resStr);  
        } else {
            // A tecla enter é pressionada enquanto o cursor estana no campo de texto. 
            jlabContents.setText("You pressed ENTER. Text is: " + 
            jtf.getText()); 
        } 
    }
    public static void main(String args[]) { 
        new Testador();  
    } 
}    

