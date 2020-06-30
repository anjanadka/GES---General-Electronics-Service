package ges;

import javax.swing.JApplet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.GroupLayout.Alignment.*;
import static javax.swing.GroupLayout.DEFAULT_SIZE;
import javax.swing.border.Border;

/**
 *
 * @author Anjana Dileepkumar
 */
public class rating extends JFrame implements ActionListener{

     private final JLabel msg = new JLabel("Payment");
     private final JLabel msg1 = new JLabel("Successful");
     private final JLabel rate_lbl = new JLabel("Rate Technician (0-5) : ");
     private final JTextField rate=new JTextField(3);
     private final JButton submit = new JButton("Submit");
     private final JPanel j1=new JPanel();
     private final JLabel txt;
     ImageIcon imageIcon = new ImageIcon("C:\\Users\\HP\\Downloads/logo1.png");
    Image image = imageIcon.getImage(); // transform it 
    Image newimg = image.getScaledInstance(300, 300,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    ImageIcon imageIcon1 = new ImageIcon(newimg);
     public int t,c;
     public rating(int t1,int c1) {
         t=t1;
         c=c1;
          txt = new JLabel(imageIcon1);
        GroupLayout g1 = new GroupLayout(j1);
        g1.setAutoCreateGaps(true);  
        g1.setAutoCreateContainerGaps(true);  
      
        g1.setHorizontalGroup(g1.createSequentialGroup()  
                .addGroup(g1.createParallelGroup().addGap(150))
                        .addGroup(g1.createParallelGroup(LEADING).addComponent(msg).addComponent(rate_lbl))  
                .addGroup(g1.createParallelGroup(TRAILING).addComponent(msg1).addComponent(rate).addComponent(submit))
                .addGroup(g1.createParallelGroup().addGap(150)));
        g1.setVerticalGroup(g1.createSequentialGroup()  
                .addGap(150)
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(msg).addComponent(msg1).addGap(200)) 
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(rate_lbl).addComponent(rate).addGap(50))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(submit,CENTER)));
       
        j1.setLayout(g1);
          add(j1);
        j1.setVisible(true);  
        msg.setFont(new Font("Times New Roman",Font.BOLD,50));
        msg1.setFont(new Font("Times New Roman",Font.BOLD,50));
        rate_lbl.setFont(new Font("Times New Roman",Font.BOLD,18));
        msg.setForeground(Color.red);
        msg1.setForeground(Color.red);
        rate_lbl.setForeground(Color.black);
        
        j1.setBackground( Color.WHITE );
        submit.addActionListener(this);
        setSize(400,400);
        setBackground(Color.WHITE);
        j1.show();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(rating.class.getName()).log(Level.SEVERE, null, ex);
         }
        Connection con = null;
         try {
            String url = "jdbc:mysql://localhost:3306/ges_db";
            String username = "root";
            String password = "root";
            con = DriverManager.getConnection(url, username, password);
            if (con != null)
            { 
                System.out .println("Successfully connected to MySQL database test"); 
            }
            Statement s = con.createStatement();
            Statement s1 = con.createStatement();
            String name=rate.getText();
            float a1=Float.parseFloat(name);
            s.executeUpdate("Update complaint set rating="+a1+ " where comp_id="+c);
            ResultSet r=s.executeQuery("select tech_id from complaint where comp_id="+c);
            r.next();
            int a11=r.getInt(1);
            ResultSet r1=s1.executeQuery("select * from complaint where status='completed' and tech_id = "+a11);
            int count =0;
            while(r1.next()){
                count++;
            }
            int b=count;
            ResultSet r2 = s.executeQuery("select rate from technician where tech_id = "+a11);
            r2.next();
            float p = (b*r2.getInt(1)+a1)/(b+1);
            s1.executeUpdate("update technician set rate ="+p+" where tech_id = "+a11);
             customer_options a = new customer_options(t);
            a.setVisible(true);
            this.setVisible(false);
            a.setSize(400,400);
        }catch(SQLException ex){
            System.out.println("An error occurred while connecting MySQL databse");
            ex.printStackTrace();
            
        }
       
        
    }

    public static void main(String args[])
    {
        rating a = new rating(1003,2);
        a.setVisible(true);
        a.setSize(750,750);
    }
}
