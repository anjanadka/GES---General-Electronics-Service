package ges;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;

/**
 *
 * @author Anjana Dileepkumar
 */
public class payment_tech extends JFrame implements ActionListener,WindowListener,ItemListener{
    private final JPanel j1=new JPanel();
    private final JLabel pay = new JLabel("PAYMENT");
    private final JLabel txt_cust = new JLabel("Customer Name :   ");
    private final JLabel txt_equip = new JLabel("Equipment         :   ");
    private final JLabel txt_amount = new JLabel("Amount             :   ");
    private final JLabel cust_name = new JLabel();
    private final JLabel equip=new JLabel();
    private final JTextField amount = new JTextField(10);
    private final JLabel txt_brand = new JLabel("Brand                 :   ");
    private final JLabel brand=new JLabel();
    private final JButton submit = new JButton("Submit");
    private final JComboBox cb = new JComboBox();
    private final JLabel comp=new JLabel("Complaint          :   ");
    public int q;
    int selected;
    int comp_id[]=new int[10];
    public payment_tech(int t) {
       q=t;
       get_cb();
                pay.setFont(new Font("Times New Roman",Font.BOLD,40));
                pay.setForeground(Color.blue);
                txt_amount.setFont(new Font("Times New Roman",Font.PLAIN,18));
                txt_equip.setFont(new Font("Times New Roman",Font.PLAIN,18));
                txt_cust.setFont(new Font("Times New Roman",Font.PLAIN,18));
                 txt_brand.setFont(new Font("Times New Roman",Font.PLAIN,18));
               comp.setFont(new Font("Times New Roman",Font.PLAIN,18));
                cb.setBackground(Color.WHITE);
                cb.setFont(new Font("Times New Roman",Font.PLAIN,15) );
                amount.setFont(new Font("Times New Roman",Font.PLAIN,18));
                equip.setFont(new Font("Times New Roman",Font.PLAIN,18));
                cust_name.setFont(new Font("Times New Roman",Font.PLAIN,18));
                 brand.setFont(new Font("Times New Roman",Font.PLAIN,18));
                 submit.setFont(new Font("Times New Roman",Font.PLAIN,18));
                
        GroupLayout g1 = new GroupLayout(j1);
        
        cust_name.requestFocusInWindow();
        g1.setHorizontalGroup(g1.createSequentialGroup()
                .addGroup(g1.createParallelGroup()
                    .addGap(150))
                .addGroup(g1.createParallelGroup(LEADING)
                        .addComponent(comp)
                        .addComponent(txt_cust)
                        .addComponent(txt_equip)
                        .addComponent(txt_brand)
                        .addComponent(txt_amount))
            .addGroup(g1.createParallelGroup()
                    .addComponent(pay)
                    .addComponent(cb)
                    .addComponent(cust_name)
                    .addComponent(equip)
                    .addComponent(brand)
                    .addComponent(amount)
                    .addComponent(submit,CENTER))
            .addGroup(g1.createParallelGroup()
                    .addGap(150)));
        
        g1.setVerticalGroup(g1.createSequentialGroup()
                .addGap(50)
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(pay,CENTER)
                        .addGap(150))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(comp)
                        .addComponent(cb)
                        .addGap(50))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(txt_cust)
                        .addComponent(cust_name)
                        .addGap(50))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(txt_equip)
                        .addComponent(equip)
                        .addGap(50))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(txt_brand)
                        .addComponent(brand)
                        .addGap(50))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(txt_amount)
                        .addComponent(amount)
                        .addGap(50))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(submit)
                ));
        j1.setLayout(g1);
        setSize(400,400);
        j1.setBackground(Color.WHITE);
          add(j1);
        j1.setVisible(true); 
        submit.addActionListener(this);
        amount.addActionListener(this);
        cb.addItemListener(this);
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source= e.getSource();
        
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(payment_tech.class.getName()).log(Level.SEVERE, null, ex);
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
           String str=amount.getText();
           int am=Integer.parseInt(str);
           System.out.println(am);
            s.executeUpdate("Update Complaint set amount="+am+ " where comp_id ="+com);
        
            
            
        }catch(SQLException eb){
            System.out.println("An error occurred while connecting MySQL databse");
            eb.printStackTrace();

        }
        technician_option t1=new technician_option(q);
        t1.setVisible(true);
            this.setVisible(false);
            t1.setSize(400,400);
        
    }
    
    public static void main(String args[]) throws SQLException, ClassNotFoundException{
        payment_tech a= new payment_tech(2001);
        
        a.setVisible(true);
        a.setSize(750,750);
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        setVisible(false);
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

   
     void get_cb()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(payment_customer.class.getName()).log(Level.SEVERE, null, ex);
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
            Statement s2 = con.createStatement();
            ResultSet r = s.executeQuery("select * from complaint where tech_id ="+q+" and status = 'not completed'");
            int i=1;
            cb.addItem("");
             while(r.next())
            {   comp_id[i]=r.getInt(1);
                String str=i+"";
                cb.addItem("Complaint "+str);
                i++;
            }
             con.close();
            
        }catch(SQLException e){
            System.out.println("An error occurred while connecting MySQL databse");
            e.printStackTrace();
        }
    }
     int com;
      public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cb) { 
            selected =cb.getSelectedIndex();
        }
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(payment_customer.class.getName()).log(Level.SEVERE, null, ex);
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
            Statement s1=con.createStatement();
            com=comp_id[selected];
            ResultSet r = s.executeQuery("select * from complaint where comp_id ="+comp_id[selected]);
            r.next();
            int a1 = r.getInt(5);
            ResultSet r1=s1.executeQuery("select name from customer where cust_id="+a1);
            r1.next();
            cust_name.setText(r1.getString(1));
            r1=s1.executeQuery("select name from equipment where equip_id="+r.getInt(3));
            r1.next();
            equip.setText(r1.getString(1));
            r1=s1.executeQuery("select name from brand where brand_id="+r.getInt(4));
            r1.next();
            brand.setText(r1.getString(1));
            con.close();
        }catch(SQLException ex){
            System.out.println("An error occurred while connecting MySQL databse");
            ex.printStackTrace();
        }
        } 

    
}

    

