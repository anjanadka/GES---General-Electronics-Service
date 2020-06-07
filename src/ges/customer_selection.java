/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ges;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.*;
/**
 *
 * @author Anjana Dileepkumar
 */
public class customer_selection extends JApplet implements ActionListener{
    private final JLabel txt = new JLabel("CUSTOMER");
    private final JButton new_customer =new JButton  ("       New Customer      ");//button-new_Customer
    private final JButton  registered_customer = new JButton (" Registered Customer ");//Button-Registered_customer
    private JPanel g1 ;
    @Override
    public void init() {

       g1 = new JPanel(new GridBagLayout());

      
        
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.add(txt, c);
        c.gridy=1;
        g1.add(new_customer, c);
        c.gridy=2;
        g1.add(registered_customer, c);
          setSize(400,400);
        setBackground(Color.WHITE);
        txt.setFont(new Font("Times New Roman",Font.BOLD,18));
        txt.setForeground(Color.blue);
        new_customer.addActionListener(this);
        registered_customer.addActionListener(this); 
        
        g1.setBackground(Color.white);

         g1.setVisible(true);
         add(g1);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
