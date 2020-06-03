/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ges;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Anjana Dileepkumar
 */
public class first_window extends Applet implements ActionListener{

    private final Button customer =new Button  ("  Customer ");//button-Customer
    private final Button technician = new Button (" Technician ");//Button-Technician
    @Override
    public void init() {
        GridBagLayout g1=new GridBagLayout();//gridLayout
	setLayout(g1);
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.setConstraints(customer, c);
        add(customer);
        c.gridy=1;
        g1.setConstraints(technician, c);
        add(technician);
       
        customer.addActionListener(this);
        technician.addActionListener(this); 
        
    }

    /**
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event){
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
