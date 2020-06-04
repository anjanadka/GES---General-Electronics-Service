package ges;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.CENTER;
import static javax.swing.GroupLayout.Alignment.*;
import static javax.swing.GroupLayout.Alignment.TRAILING;
import javax.swing.JApplet;

/**
 *
 * @author Anjana Dileepkumar
 */
public class work extends JApplet implements ActionListener {

    private final JPanel new_wk=new JPanel();
    private final JPanel comp_wk=new JPanel();
    private final JLabel work = new JLabel(" Work ");
    private final JLabel work1 = new JLabel(" Work ");
    private final JLabel txt_cust = new JLabel("Customer Name : ");
    private final JLabel txt_cust1 = new JLabel("Customer Name : ");
    private final JLabel txt_add = new JLabel("Address                : ");
    private final JLabel txt_equip = new JLabel("Equipment            : ");
    private final JLabel txt_equip1 = new JLabel("Equipment            : ");
    private final JLabel txt_brand = new JLabel("Brand                     : ");
    private final JLabel txt_complaint = new JLabel("Complaint             : ");
    private final JButton ok = new JButton (" OK ");
    private final JButton ok1 = new JButton (" OK ");
    private final JSeparator space = new JSeparator();
    private final JSeparator space1 = new JSeparator();
    private final JLabel txt_rate = new JLabel("Rating                    : ");
    @Override
    public void init() {
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(0,0,400,400);  
        
        tp.add("New Work",new_wk);  
        GroupLayout g1 = new GroupLayout(new_wk);
        g1.setAutoCreateGaps(true);  
        g1.setAutoCreateContainerGaps(true);  
         g1.setHorizontalGroup(g1.createSequentialGroup()  
                .addGroup(g1.createParallelGroup(LEADING).addComponent(work,CENTER).addComponent(txt_cust).addComponent(txt_add)
                .addComponent(txt_equip).addComponent(txt_brand).addComponent(txt_complaint).addComponent(space))  
                .addGroup(g1.createParallelGroup(TRAILING).addComponent(ok,CENTER)));
        g1.setVerticalGroup(g1.createSequentialGroup()  
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(work))  
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_cust))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_add))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_equip))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_brand))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_complaint))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(ok))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(space)));   
         new_wk.setLayout(g1);
         
        tp.add("Completed Work",comp_wk); 
        GroupLayout g2 = new GroupLayout(comp_wk);
        g2.setAutoCreateGaps(true);  
        g2.setAutoCreateContainerGaps(true);  
         g2.setHorizontalGroup(g2.createSequentialGroup()  
                .addGroup(g2.createParallelGroup(LEADING).addComponent(work1,CENTER).addComponent(txt_cust1)
                .addComponent(txt_equip1).addComponent(txt_rate).addComponent(space1))  
                .addGroup(g2.createParallelGroup(TRAILING).addComponent(ok1,CENTER)));
        g2.setVerticalGroup(g2.createSequentialGroup()  
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(work1))  
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(txt_cust1))
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(txt_equip1))
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(txt_rate))
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(ok1))
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(space1)));   
         comp_wk.setLayout(g2);
        
        add(tp);
        
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);
        
       ok.addActionListener(this);
        ok1.addActionListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
