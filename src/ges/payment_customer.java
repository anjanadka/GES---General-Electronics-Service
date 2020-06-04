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
    
    private final JLabel tech_lbl = new JLabel("Technician : ");
    private final JTextField tech_txt = new JTextField(20);
    private final JLabel amount = new JLabel("Amount     : ");
    private final JTextField amount_txt = new JTextField(20);
    private final JButton pay = new JButton("  Pay  ");
    
    @Override
    public void init() {
        
        GridBagLayout g1 = new GridBagLayout();
        setLayout(g1);
        GridBagConstraints c = new GridBagConstraints();
        c.fill=GridBagConstraints.HORIZONTAL;
        g1.setConstraints(tech_lbl, c);
        add(tech_lbl);
        c.fill=GridBagConstraints.NONE;
        g1.setConstraints(tech_txt, c);
        add(tech_txt);
        c.gridy=1;
        c.fill=GridBagConstraints.HORIZONTAL;
        g1.setConstraints(amount, c);
        add(amount);
        c.fill=GridBagConstraints.NONE;
        g1.setConstraints(amount_txt, c);
        add(amount_txt);
        c.gridy=2;
        g1.setConstraints(pay, c);
        add(pay);
        
        tech_txt.addActionListener(this);
        amount_txt.addActionListener(this);
        pay.addActionListener(this);
        
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
