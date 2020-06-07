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
    private JPanel g1 ;   
    private final JButton works = new JButton ("         Works        ");
    private final JButton payment_details = new JButton ("Payment Details");
    private final JButton logout = new JButton ("         Logout         ");
   
    @Override
    public void init() {
    g1 = new JPanel(new GridBagLayout());    
    GridBagConstraints c = new GridBagConstraints();
    c.weighty=1;
    g1.add(works, c);
    c.gridy=1;
    g1.add(payment_details, c);
    c.gridy=2;
    g1.add(logout, c);
    
    works.addActionListener(this);
    payment_details.addActionListener(this);
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
