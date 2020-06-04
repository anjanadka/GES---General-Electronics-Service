package ges;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Anjana Dileepkumar
 */
public class first_window extends JApplet implements ActionListener{

    private final JButton customer =new JButton  ("  Customer ");//button-Customer
    private final JButton technician = new JButton (" Technician ");//Button-Technician
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
