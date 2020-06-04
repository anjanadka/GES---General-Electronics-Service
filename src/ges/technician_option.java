package ges;
import javax.swing.*;
import javax.swing.JApplet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Anjana Dileepkumar
 */
public class technician_option extends JApplet implements ActionListener{
    
    private final JButton works = new JButton ("         Works        ");
    private final JButton payment_details = new JButton ("Payment Details");
    private final JButton logout = new JButton ("         Logout         ");
   
    @Override
    public void init() {
    GridBagLayout g1=new GridBagLayout();//gridLayout 
    setLayout(g1);
    GridBagConstraints c = new GridBagConstraints();
    c.weighty=1;
    g1.setConstraints(works, c);
    add(works);
    c.gridy=1;
    g1.setConstraints(payment_details, c);
    add(payment_details);
    c.gridy=2;
    g1.setConstraints(logout, c);
    add(logout);
    
    works.addActionListener(this);
    payment_details.addActionListener(this);
    logout.addActionListener(this);
    
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
