package ges;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
/**
 *
 * @author Anjana Dileepkumar
 */
public class technician_selection extends JApplet implements ActionListener{

   private final JButton new_technician =new JButton  ("       New Technician      ");//button-new_Customer
   private final JButton  registered_technician = new JButton (" Registered Technician ");//Button-Registered_customer
   @Override
    public void init() {
        GridBagLayout g1=new GridBagLayout();//gridLayout
	setLayout(g1);
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.setConstraints(new_technician, c);
        add(new_technician);
        c.gridy=1;
        g1.setConstraints(registered_technician, c);
        add(registered_technician);
        
        new_technician.addActionListener(this);
        registered_technician.addActionListener(this); 
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
