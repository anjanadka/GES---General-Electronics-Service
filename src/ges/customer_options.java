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

public class customer_options extends JApplet implements ActionListener{

    private final JButton add_details =new JButton  ("     Add_Details    ");//Add details
    private final JButton  add_complaints = new JButton (" Add Complaints ");//Button-add complaints
    private final JButton payment =new JButton  ("        Payment        ");//button-Payment
    private final JButton  logout= new JButton ("         Logout           ");//Button-Logout
    @Override
    public void init() {
        GridBagLayout g1=new GridBagLayout();//gridLayout
	setLayout(g1);
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.setConstraints(add_details, c);
        add(add_details);
        c.gridy=1;
        g1.setConstraints(add_complaints, c);
        add(add_complaints);
        c.gridy=2;
        g1.setConstraints(payment, c);
        add(payment);
        c.gridy=3;
        g1.setConstraints(logout, c);
        add(logout);
        
        add_details.addActionListener(this);
        add_complaints.addActionListener(this);
        payment.addActionListener(this);
        logout.addActionListener(this); 

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
