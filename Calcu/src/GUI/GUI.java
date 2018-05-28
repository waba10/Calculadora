/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import main.AbstractFactory;
import main.Produccion;
import operaciones_concretas.Aritmetica;
import operaciones_concretas.Convertor;

/**
 *
 * @author LN710Q
 */
public class GUI extends JPanel {
    
    public int WIDTH = 350, widthTF = 120, widthB = 120;
    public int HEIGHT = 350, heightTF = 30, heightB = 20;
    public JTextField textF1, textF2,textF3;
    public JButton buttonsum, buttonres,buttondiv,buttonmul,buttonbi;
    AbstractFactory factory;

    public GUI() {
        
        

        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(15, 30, widthTF, heightTF));

        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(15, 70, widthTF, heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(15, 150, widthTF, heightTF));
        

        buttonsum = new JButton("Sumar");
        buttonsum.setBounds(new Rectangle(180, 30, widthB, heightB));
        
        buttonres = new JButton("Restar");
        buttonres.setBounds(new Rectangle(180, 70, widthB, heightB));
         
        buttondiv = new JButton("Dividir");
        buttondiv.setBounds(new Rectangle(180, 110, widthB, heightB));

        buttonmul = new JButton("Multiplicar");
        buttonmul.setBounds(new Rectangle(180, 150, widthB, heightB));
      
       
        buttonbi = new JButton("Num Binario");
        buttonbi.setBounds(new Rectangle(180, 190, widthB, heightB));
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);

        buttonsum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Double n1 = Double.parseDouble(textF1.getText());
                Double n2 = Double.parseDouble(textF2.getText());
                factory = Produccion.getFactory("operaciones concretas");
                Aritmetica sum = factory.getAritmetica("Suma");
                double r = 0;
                r = sum.efectuar(n1,n2);
                

                textF3.setText(String.valueOf(r));
            }

        });
        buttonres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Double n1 = Double.parseDouble(textF1.getText());
                Double n2 = Double.parseDouble(textF2.getText());
                factory = Produccion.getFactory("operaciones concretas");
                Aritmetica res = factory.getAritmetica("Resta");
                double r = 0;
                r = res.efectuar(n1,n2);
                

                textF3.setText(String.valueOf(r));
            }

        });
        buttondiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Double n1 = Double.parseDouble(textF1.getText());
                Double n2 = Double.parseDouble(textF2.getText());
                factory = Produccion.getFactory("operaciones concretas");
                Aritmetica div = factory.getAritmetica("Division");
                double r = 0;
                r = div.efectuar(n1,n2);
                

                textF3.setText(String.valueOf(r));
            }

        });
        buttonmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Double n1 = Double.parseDouble(textF1.getText());
                Double n2 = Double.parseDouble(textF2.getText());
                factory = Produccion.getFactory("operaciones concretas");
                Aritmetica mul = factory.getAritmetica("Multiplicacion");
                double r = 0;
                r = mul.efectuar(n1,n2);
                

                textF3.setText(String.valueOf(r));
            }

        });
        buttonbi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int n1 = Integer.parseInt(textF1.getText());
                
                factory = Produccion.getFactory("operaciones concretas");
                Convertor bi = factory.getConvertor("Binario");
                String r;
                r = bi.efectuar(n1);
                //System.out.println(r);

                textF3.setText(r);
            }

        });

        add(textF1);
        add(textF2);
        add(textF3);
        add(buttonsum);
        add(buttonres);
        add(buttondiv);
        add(buttonmul);
        add(buttonbi);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
}
