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
    private JPanel g1 ;
    private final JButton add_details =new JButton  ("     Add_Details    ");//Add details
    private final JButton  add_complaints = new JButton (" Add Complaints ");//Button-add complaints
    private final JButton payment =new JButton  ("        Payment        ");//button-Payment
    private final JButton  logout= new JButton ("         Logout           ");//Button-Logout
    @Override
    public void init() {
        g1 = new JPanel(new GridBagLayout());	
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.add(add_details, c);
        c.gridy=1;
        g1.add(add_complaints, c);
        c.gridy=2;
        g1.add(payment, c);
        c.gridy=3;
        g1.add(logout, c);
        
        add_details.addActionListener(this);
        add_complaints.addActionListener(this);
        payment.addActionListener(this);
        logout.addActionListener(this); 
        g1.setBackground(Color.WHITE);
         g1.setVisible(true);
         add(g1);
         setSize(400,400);
        

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
