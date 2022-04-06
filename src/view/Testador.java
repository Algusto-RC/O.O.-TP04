package view;

// programa swing_button_2.java
// inicio do programa swing_button - versao 2.1

import javax.swing.*;  //All swing components live
		       //in the javax.swing package

import java.awt.*;
import java.awt.event.*;

// a classe swing_button_2 antes era subclasse de Object
// agora, torna-se subclasse de JFrame e implementa as
// interfaces da classe ActionListener
public class Testador extends JFrame implements ActionListener {

	// os widgets que eram criados no main
	// agora são membros da classe
	static Box vbox;
	static JButton button1;
	static JTextField entry1;

	// ActionListener faz button1 iteragir com entry1
	public void actionPerformed(ActionEvent e) {
		entry1.setText("OK");
	};

	public static void main(String[] args) {

		// o frame é criado no main (como antes)
		// a diferença é que chamamos o constructor da classe
		// este constructor se encarrega de montar vbox, button1 e entry1
        Testador frame = new Testador("swing_button_2");

		// o resto é igual
		frame.add(vbox);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(212, 258);
		frame.setVisible(true);
	}

	// o trabalho de criar os widgets vbox, button1 e entry1 é feito no constructor da classe
	public Testador(String title) {

		// super chama o constructor da classe JFrame
		super(title);
 
		// o resto é igual
		vbox = new Box(BoxLayout.Y_AXIS);
		button1 = new JButton("OK");
		entry1 = new JTextField("");

		// button1 ganha um ActionListener
		button1.addActionListener(this); 

		vbox.add(button1);
		vbox.add(entry1);

	}
}
 

