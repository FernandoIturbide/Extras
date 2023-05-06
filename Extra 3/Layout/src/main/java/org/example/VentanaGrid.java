package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaGrid extends Frame{
    private Label lblEtiqueta1;
    private Label lblEtiqueta2;
    private TextField txtCuadro1;
    private TextField txtCuadro2;
    private Button btn1;
    private GridLayout layout;

    public VentanaGrid(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout=new GridLayout(3,2);
        this.setLayout(layout);
        lblEtiqueta1=new Label("Etiqueta 1");
        this.add(lblEtiqueta1,0);
        txtCuadro1=new TextField(30);
        this.add(txtCuadro1,1);
        lblEtiqueta2=new Label("Etiqueta 2");
        this.add(lblEtiqueta2,2);
        txtCuadro2=new TextField(30);
        this.add(txtCuadro2,3);
        btn1=new Button("Precioname");
        this.add(btn1,4);
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String text=txtCuadro1.getText()+" "+txtCuadro2.getText();
                JOptionPane.showMessageDialog(null,text);
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setVisible(true);
    }
}
