package ges;

import javax.swing.JApplet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.GroupLayout.Alignment.*;

/**
 *
 * @author Anjana Dileepkumar
 */
public class rating extends JApplet implements ActionListener{

     private final JLabel msg = new JLabel("Payment Successful");
     private final JLabel rate_lbl = new JLabel("Rate Technician (0-5) : ");
     private final JTextField rate=new JTextField(3);
     private final JButton submit = new JButton("Submit");
     
     @Override
     public void init() {
        GroupLayout g1 = new GroupLayout(this);
        g1.setAutoCreateGaps(true);  
        g1.setAutoCreateContainerGaps(true);  
        
        g1.setHorizontalGroup(g1.createSequentialGroup()  
                .addGroup(g1.createParallelGroup(LEADING).addComponent(msg,CENTER).addComponent(rate_lbl).addComponent(submit))  
                .addGroup(g1.createParallelGroup(TRAILING).addComponent(rate)));
        g1.setVerticalGroup(g1.createSequentialGroup()  
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(msg))  
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(rate_lbl).addComponent(rate))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(submit,CENTER)));   
        setLayout(g1);
        this.setVisible(true);  
        
        submit.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
