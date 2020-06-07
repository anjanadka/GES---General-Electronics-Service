package ges;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Anjana Dileepkumar
 */
public class first_window extends JApplet implements ActionListener{
    private JPanel g1 ;
    private final JLabel txt = new JLabel("GENERAL ELECTRONICS SERVICE");
    private final JButton customer =new JButton  ("  Customer ");//button-Customer
    private final JButton technician = new JButton (" Technician ");//Button-Technician
    @Override
    public void init() {
        g1 = new JPanel(new GridBagLayout());
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.add(txt, c);
        c.gridy=1;
        g1.add(customer, c);
        c.gridy=2;
        g1.add(technician, c);
       
        customer.addActionListener(this);
        technician.addActionListener(this);
        setSize(400,400);
        g1.setBackground(Color.WHITE);
        txt.setFont(new Font("Times New Roman",Font.BOLD,18));
        txt.setForeground(Color.blue);
         g1.setVisible(true);
         add(g1);
         setSize(400,400);

        
    }

    /**
     *
     * @param event
     */
    @Override
    public void actionPerformed(ActionEvent event){
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
