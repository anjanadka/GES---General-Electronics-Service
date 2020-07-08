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
public class technician_option extends JFrame implements ActionListener{
    private JPanel g1 ;   
    private final JButton works = new JButton ("         Works        ");
    private final JButton payment_details = new JButton ("Payment Details");
    private final JButton logout = new JButton ("         Logout         ");
    public int k;
    public technician_option(int q) {
    k=q;
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
    g1.setBackground(new Color(0,153,204));
     g1.setVisible(true);
     add(g1);
     setSize(400,400);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();
        if(s == works){
            work a = new work(k);
            a.setVisible(true);
            this.setVisible(false);
            a.setSize(750,750);
        }
        else if(s == payment_details){
             payment_tech a= new payment_tech(k);
            a.setVisible(true);
            this.setVisible(false);
            a.setSize(750,750);
        }
        else if(s == logout)
        {
            technician_login c = new technician_login();
            c.setVisible(true);
            this.setVisible(false);
            c.setSize(750,750);
        }
        
    }
    
    public static void main(String args[]){
        technician_option a = new technician_option(2001);
        a.setVisible(true);
        a.setSize(750,750);
    }
}
