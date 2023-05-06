package org.example;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton botonPanel1;
    private JLabel etiquetaPanel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);
        //panel1
        panel1= new JPanel();
        panel1.add(etiquetaPanel1);
        this.getContentPane().add(panel1,0);
        //panel2
        panel2=new JPanel();
        panel2.setBackground(new Color(250,224,221));
        this.getContentPane().add(panel2,1);
        //panel3
        panel3=new JPanel();
        panel3.setBackground(Color.GREEN);
        this.getContentPane().add(panel3,2);
        //panel4
        panel4=new JPanel();
        panel4.setBackground(Color.ORANGE);
        this.getContentPane().add(panel4,3);

        this.setVisible(true);
    }
}
