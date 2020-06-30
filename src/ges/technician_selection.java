package ges;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
/**
 *
 * @author Anjana Dileepkumar
 */
public class technician_selection extends JFrame implements ActionListener{
   private JPanel g1 ;
   private final JLabel txt = new JLabel("TECHNICIAN");      
   private final JButton new_technician =new JButton  ("       New Technician      ");//button-new_Customer
   private final JButton  registered_technician = new JButton (" Registered Technician ");//Button-Registered_customer

   public technician_selection() {
        g1 = new JPanel(new GridBagLayout());	
	GridBagConstraints c= new GridBagConstraints();
        c.weighty=0.0001;
        g1.add(txt, c);
        c.gridy=1;
        g1.add(new_technician, c);
        c.gridy=2;
        g1.add(registered_technician, c);
          setSize(400,400);
        setBackground(Color.WHITE);
        txt.setFont(new Font("Times New Roman",Font.BOLD,35));
        txt.setForeground(Color.WHITE);
        new_technician.addActionListener(this);
        registered_technician.addActionListener(this); 
        g1.setBackground(new Color(0,153,204));
         g1.setVisible(true);
         add(g1);
         setSize(400,400);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object s =e.getSource();
        if(s ==new_technician)
        {
            create_technician a = new create_technician();
            this.setVisible(false);
            a.setVisible(true);
            a.setSize(750, 750);
        }
        else{
            if(s == registered_technician){
                technician_login b = new technician_login();
                this.setVisible(false);
                b.setVisible(true);
                b.setSize(750,750);
            }
        }
        
    }
       
     public static void main(String args[])
    {
        technician_selection a=new technician_selection();
        a.setVisible(true);
        a.setSize(750,750);
    }
}
