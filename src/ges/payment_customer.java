package ges;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JApplet;
/**
 *
 * @author Anjana Dileepkumar
 */
public class payment_customer extends JApplet implements ActionListener{
    private final JLabel title=new JLabel(" Payment");
    private final JLabel tech_lbl = new JLabel("Technician : ");
    private final JTextField tech_txt = new JTextField(20);
    private final JLabel amount = new JLabel("Amount     : ");
    private final JTextField amount_txt = new JTextField(20);
    private final JButton pay = new JButton("  Pay  ");
    private JPanel g1 ;
    @Override
    public void init() {
        title.setFont(new Font("Times New Roman",Font.BOLD,18));
                title.setForeground(Color.blue);
                amount.setFont(new Font("Times New Roman",Font.BOLD,18));
               tech_lbl.setFont(new Font("Times New Roman",Font.BOLD,18));
                
        g1 = new JPanel(new GridBagLayout());
        
        
        g1.setBackground(Color.white);
        GridBagConstraints c = new GridBagConstraints();
        c.fill=GridBagConstraints.HORIZONTAL;
        c.weighty=0.1;
       g1. add(title,c);
        c.gridy=1;
        g1.add(tech_lbl, c);
        
        c.fill=GridBagConstraints.NONE;
        g1.add(tech_txt, c);
        c.gridy=2;
        c.fill=GridBagConstraints.HORIZONTAL;
        g1.add(amount, c);
        c.fill=GridBagConstraints.NONE;
        g1.add(amount_txt, c);
        c.gridy=3;
        g1.add(pay, c);
        
        tech_txt.addActionListener(this);
        amount_txt.addActionListener(this);
        pay.addActionListener(this);
        setSize(400,400);
                

                 g1.setVisible(true);  

        add(g1);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
