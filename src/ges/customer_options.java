package ges;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.CENTER;
import static javax.swing.GroupLayout.Alignment.LEADING;
import static javax.swing.GroupLayout.Alignment.TRAILING;
import javax.swing.JApplet;
/**
 *
 * @author Anjana Dileepkumar
 */

public class customer_options extends JFrame implements ActionListener{
    private JPanel g1 = new JPanel() ;
    private final JButton add_details =new JButton  ("     Add_Details    ");//Add details
    private final JButton  add_complaints = new JButton (" Add Complaints ");//Button-add complaints
    private final JButton payment =new JButton  ("        Payment        ");//button-Payment
    private final JButton  logout= new JButton ("         Logout           ");//Button-Logout
    public int k;
    public customer_options(int q) {
    k=q;
    g1 = new JPanel(new GridBagLayout());    
    GridBagConstraints c = new GridBagConstraints();
    c.weighty=1;
    g1.add(add_details, c);
    c.gridy=1;
    g1.add(add_complaints, c);
    c.gridy=2;
    g1.add(payment,c);
    c.gridy=3;
    g1.add(logout, c);
        
        add_details.addActionListener(this);
        add_complaints.addActionListener(this);
        payment.addActionListener(this);
        logout.addActionListener(this);
        g1.setBackground(new Color(0,153,204));
         g1.setVisible(true);
         add(g1);
         setSize(400,400);
     

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object s= e.getSource();
        if(s == add_details)
        {
           customerdetails a = new customerdetails(k); 
           a.setVisible(true);
           this.setVisible(false);
           a.setSize(750,750);
        }
        else if(s == add_complaints)
        {
            complaintdetails b = new complaintdetails(k);
            b.setVisible(true);
            this.setVisible(false);
            b.setSize(750, 750);
        }
        else if(s == payment)
        {
            payment_customer c = new payment_customer(k);
            c.setVisible(true);
            this.setVisible(false);
            c.setSize(750,750);
        }
        else if(s==logout)
        {
            customer_login d = new customer_login();
            d.setVisible(true);
            this.setVisible(false);
            d.setSize(750,750);
        }
    }
    
    public static void main(String args[]){
        customer_options a = new customer_options(1003);
        a.setVisible(true);
        a.setSize(750,750);
        
    }
}
