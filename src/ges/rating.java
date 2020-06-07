package ges;

import javax.swing.JApplet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.GroupLayout.Alignment.*;
import static javax.swing.GroupLayout.DEFAULT_SIZE;
import javax.swing.border.Border;

/**
 *
 * @author Anjana Dileepkumar
 */
public class rating extends JApplet implements ActionListener{

     private final JLabel msg = new JLabel("Payment Successful");
     private final JLabel rate_lbl = new JLabel("Rate Technician (0-5) : ");
     private final JTextField rate=new JTextField(3);
     private final JButton submit = new JButton("Submit");
     private final JPanel j1=new JPanel();
     
     @Override
     public void init() {
      
        
        GroupLayout g1 = new GroupLayout(j1);
        g1.setAutoCreateGaps(true);  
        g1.setAutoCreateContainerGaps(true);  
        
        g1.setHorizontalGroup(g1.createSequentialGroup()  
                .addGroup(g1.createParallelGroup().addGap(10, 200, 200)
                        .addGroup(g1.createParallelGroup(LEADING).addComponent(msg).addComponent(rate_lbl)))  
                .addGroup(g1.createParallelGroup(TRAILING).addComponent(rate).addComponent(submit)));
        g1.setVerticalGroup(g1.createSequentialGroup()  
                .addGroup(g1.createParallelGroup(BASELINE).addGap(10, 200, 200) .addComponent(msg))  
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(rate_lbl).addComponent(rate))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(submit,CENTER).addGap(0,30,30)));   
        
       
        j1.setLayout(g1);
          add(j1);
        j1.setVisible(true);  
        msg.setFont(new Font("Times New Roman",Font.BOLD,18));
        rate_lbl.setFont(new Font("Times New Roman",Font.BOLD,18));
        msg.setForeground(Color.red);
        rate_lbl.setForeground(Color.blue);
        j1.setBackground( Color.WHITE );
        submit.addActionListener(this);
        setSize(400,400);
        setBackground(Color.WHITE);
      
        j1.show();
        
        
        
         
      
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
