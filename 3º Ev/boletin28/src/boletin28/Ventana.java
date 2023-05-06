
package boletin28;

import javax.swing.*;

public class Ventana {
    
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JTextField lTexto1, lTexto2;
    JTextArea aTexto;
    JLabel etiqueta1, etiqueta2;
    
    
    
    public void iniciarcomponentes(){
        
        marco = new JFrame();
        panel = new JPanel();
        etiqueta1 = new JLabel("Nome");
        etiqueta2 = new JLabel("PASSWORD");
        lTexto1 = new JTextField();
        lTexto2 = new JTextField();
        aTexto = new JTextArea("Area de texto.");
        boton1 = new JButton("PEMER");
        boton2 = new JButton("LIMPAR");
        
        //Caracteristicas 
        
        marco.setBounds(0, 0, 650, 550);
        panel.setBounds(5, 5, 550, 400);
        etiqueta1.setBounds(100, 25, 150, 50);
        etiqueta2.setBounds(100, 100,150, 50);
        lTexto1.setBounds(250, 25, 200, 50);
        lTexto2.setBounds(250, 100, 200, 50);
        aTexto.setBounds(100, 200, 400, 100);
        boton1.setBounds(100, 400, 100, 50);
        boton2.setBounds(400, 400, 100, 50);
        
        //añadimos los componentes al panel
        
        panel.setLayout(null);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(lTexto1);
        panel.add(lTexto2);
        panel.add(aTexto);
        
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
        
    }
    
    
}
