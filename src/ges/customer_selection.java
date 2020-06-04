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

    private final JButton new_customer =new JButton  ("       New Customer      ");//button-new_Customer
    private final JButton  registered_customer = new JButton (" Registered Customer ");//Button-Registered_customer
    
    @Override
    public void init() {
        GridBagLayout g1=new GridBagLayout();//gridLayout
	setLayout(g1);
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.setConstraints(new_customer, c);
        add(new_customer);
        c.gridy=1;
        g1.setConstraints(registered_customer, c);
        add(registered_customer);
        
        new_customer.addActionListener(this);
        registered_customer.addActionListener(this); 
       
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
