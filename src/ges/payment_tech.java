package ges;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;

/**
 *
 * @author Anjana Dileepkumar
 */
public class payment_tech extends JApplet implements ActionListener{
    private final JLabel pay = new JLabel("Payment");
    private final JLabel txt_cust = new JLabel("Customer Name : ");
    private final JLabel txt_equip = new JLabel("Equipment          : ");
    private final JLabel txt_amount = new JLabel("Amount             : ");
    private final JTextField cust_name = new JTextField(10);
    private final JTextField amount = new JTextField(10);
    private final JButton submit = new JButton("Submit");
    String equipment[] ={"Refrigerator","Television","Fan","Mixer Grinder","Motor","Washing Mechine"};
    private final JComboBox equ_cb = new JComboBox(equipment);
    
    @Override
    public void init() {
        GroupLayout g1 = new GroupLayout(this);
        g1.setAutoCreateGaps(true);  
        g1.setAutoCreateContainerGaps(true);
        cust_name.requestFocusInWindow();
        g1.setHorizontalGroup(g1.createSequentialGroup()
                .addGroup(g1.createParallelGroup(LEADING)
                        .addComponent(txt_cust)
                        .addComponent(txt_equip)
                        .addComponent(txt_amount))
            .addGroup(g1.createParallelGroup(LEADING)
                    .addComponent(pay)
                    .addComponent(cust_name)
                    .addComponent(equ_cb)
                    .addComponent(amount)
                    .addComponent(submit)));
        
        g1.setVerticalGroup(g1.createSequentialGroup()
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(pay,CENTER))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(txt_cust)
                        .addComponent(cust_name))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(txt_equip)
                        .addComponent(equ_cb))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(txt_amount)
                        .addComponent(amount))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(submit)));
        setLayout(g1);
        
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
