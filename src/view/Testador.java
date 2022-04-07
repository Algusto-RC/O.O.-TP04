package view;
// Java Program to create a simple JComboBox
// and add elements to it
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Testador extends JFrame implements ItemListener {
 
    static JFrame f;
    static JComboBox filtroPesquisa;
    static JButton[] profissionais = new JButton[2];
    static ItemListener batata;
 
    // main class
    public static void main(String[] args)
    {
        f = new JFrame("frame");
 
        Testador s = new Testador();
 
        f.setLayout(null);
 
        String s1[] = { "Eletricista", "Mecanico", "Encanador", "Faxineiro", "Cozinheiro" };
 
        filtroPesquisa = new JComboBox<>(s1);
        filtroPesquisa.setBounds(10, 10, 200, 20);
        filtroPesquisa.setVisible(true);
        filtroPesquisa.addItemListener(s);

        JPanel p = new JPanel();
        p.setLayout(null);
        p.setSize(400,300);
        
        profissionais[0] = new JButton("Batata");
        profissionais[0].setBounds(5, 50, 400, 25);
        profissionais[0].setVisible(false);

        p.add(profissionais[0]);
        p.add(filtroPesquisa);
        f.add(p);
        f.setSize(400, 300);
        f.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e){
        // if the state combobox is changed
        if (e.getSource() == filtroPesquisa){

            if(filtroPesquisa.getSelectedItem() == "Eletricista"){
                profissionais[0].setVisible(true);

            }else if (filtroPesquisa.getSelectedItem() == "Mecanico") {
                profissionais[0].setVisible(false);
                
            }else if (filtroPesquisa.getSelectedItem() == "Encanador") {
                profissionais[0].setVisible(false);

            }else if (filtroPesquisa.getSelectedItem() == "Faxineiro") {
                    profissionais[0].setVisible(false);

            }else if (filtroPesquisa.getSelectedItem() == "Cozinheiro") {
                   profissionais[0].setVisible(false);

            }
        }
    }
}