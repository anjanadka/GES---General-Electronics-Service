package ges;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Anjana Dileepkumar
 */
public class first_window extends JFrame implements ActionListener{
    private JPanel g1 ;
    private final JLabel txt;
    private final JButton customer =new JButton  ("  Customer ");//button-Customer
    private final JButton technician = new JButton (" Technician ");//Button-Technician
    ImageIcon imageIcon = new ImageIcon("C:\\Users\\HP\\Downloads/logo1.png");
    Image image = imageIcon.getImage(); // transform it 
    Image newimg = image.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon imageIcon1 = new ImageIcon(newimg);
    
    public first_window() {
        g1 = new JPanel(new GridBagLayout());
        txt = new JLabel(imageIcon1);
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.add(txt, c);
        c.gridy=1;
        g1.add(customer, c);
        c.gridy=2;
        g1.add(technician, c);
        customer.addActionListener(this);
        technician.addActionListener(this);
        g1.setBackground(new Color(0,153,204));
        txt.setFont(new Font("Times New Roman",Font.BOLD,18));
        txt.setForeground(Color.blue);
         g1.setVisible(true);
        add(g1);
        
    }

    /**
     *
     * @param event
     */
    
    @Override
    public void actionPerformed(ActionEvent event){
        Object s= event.getSource();
        if(s==customer){
            customer_selection a = new customer_selection();
            this.setVisible(false);
            a.setVisible(true);
            a.setSize(750, 750);
        }
        else{
            if(s==technician){
                technician_selection b = new technician_selection();
                b.setVisible(true);
                this.setVisible(false);
                b.setSize(750, 750);
            }
        }
        
    }

     public static void main(String args[])
    {
        first_window a=new first_window();
        a.setVisible(true);
        a.setSize(750,750);
    }
    
}
