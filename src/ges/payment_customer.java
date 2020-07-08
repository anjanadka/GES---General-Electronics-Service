package ges;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.CENTER;
import static javax.swing.GroupLayout.Alignment.LEADING;
import static javax.swing.GroupLayout.Alignment.TRAILING;
import javax.swing.JApplet;
/**
 *
 * @author Anjana Dileepkumar
 */
public class payment_customer extends JFrame implements ActionListener,ItemListener{
    private final JLabel title=new JLabel(" PAYMENT ");
    private final JLabel sel_comp = new JLabel("Select Complaint : ");
    private final JLabel tech_lbl = new JLabel("Technician         :");
    private final JLabel tech_txt = new JLabel();
    private final JLabel amount = new JLabel("Amount             :");
    private final JLabel amount_txt = new JLabel();
    private final JButton pay = new JButton("  Pay  ");
    private final JButton back=new JButton("Back");
    private final JComboBox cb = new JComboBox();
    private JPanel j1=new JPanel() ;
    public int q;
    public int selected;
    public int comp_id[]=new int[10];
    
    public payment_customer(int a) {
        q=a;
        get_cb();
        title.setFont(new Font("Times New Roman",Font.BOLD,40));
                title.setForeground(new Color(0,153,204));
                amount.setFont(new Font("Times New Roman",Font.PLAIN,18));
               tech_lbl.setFont(new Font("Times New Roman",Font.PLAIN,18));
                sel_comp.setFont(new Font("Times New Roman",Font.PLAIN,18));
                cb.setBackground(Color.WHITE);
                cb.setFont(new Font("Times New Roman",Font.PLAIN,15) );
                amount_txt.setFont(new Font("Times New Roman",Font.PLAIN,18));
               tech_txt.setFont(new Font("Times New Roman",Font.PLAIN,18));
               pay.setFont(new Font("Times New Roman",Font.PLAIN,18));
               back.setFont(new Font("Times New Roman",Font.PLAIN,18));
        
        GroupLayout g1 = new GroupLayout(j1);
        g1.setAutoCreateGaps(true);  
        g1.setAutoCreateContainerGaps(true);  
        g1.setHorizontalGroup(g1.createSequentialGroup()     
                        .addGroup(g1.createParallelGroup(LEADING)
                                .addGap(150))
                        .addGroup(g1.createParallelGroup(LEADING)
                            .addComponent(sel_comp)
                            .addComponent(tech_lbl)
                            .addComponent(amount)
                            .addComponent(back,CENTER))
                        .addGroup(g1.createParallelGroup()
                            .addComponent(title)
                            .addComponent(cb)
                            .addComponent(tech_txt)
                            .addComponent(amount_txt)
                            .addComponent(pay,CENTER))
                         .addGroup(g1.createParallelGroup(LEADING)
                                 .addGap(150)
                ));
        g1.setVerticalGroup(g1.createSequentialGroup() 
                .addGap(50)
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(title,CENTER)
                        .addGap(150))  
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(sel_comp)
                        .addComponent(cb)
                        .addGap(50))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(tech_lbl)
                        .addComponent(tech_txt)
                        .addGap(50))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(amount)
                        .addComponent(amount_txt)
                        .addGap(100))
                .addGroup(g1.createParallelGroup(BASELINE)
                        .addComponent(back)
                        .addComponent(pay,CENTER))
                );  
        j1.setLayout(g1);
        cb.addItemListener(this);
        pay.addActionListener(this);
        j1.setSize(400,400);
        j1.setVisible(true);  
        j1.setBackground(Color.WHITE);
        back.addActionListener(this);
        add(j1);

        
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        Object se = e.getSource();
        if(se==pay){
        
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
            s.executeUpdate("update complaint set status='completed' where comp_id ="+comp_id[selected]);
            
            
        }catch(SQLException ex){
            System.out.println("An error occurred while connecting MySQL databse");
            ex.printStackTrace();
        }
       
            
           rating a = new rating(q,comp_id[selected]);
            a.setVisible(true);
           this.setVisible(false);
           a.setSize(750,750);
        }
        else if(se==back)
        {
            customer_options c =new customer_options(q);
            c.setVisible(true);
            this.setVisible(false);
            c.setSize(750,750);
            
        }

    }
    
    public static void main(String args[]){
        payment_customer a = new payment_customer(1001);
        a.setVisible(true);
        a.setSize(750,750);
    }
    
     void get_cb()
    {
      
        
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
            ResultSet r = s.executeQuery("select * from complaint where cust_id "
                    + "="+q+" and status = 'not completed' and amount is not null");
            int i=1;
            cb.addItem("");
             while(r.next())
            {   comp_id[i++]=r.getInt(1);
                ResultSet r1,r2;
                int a=r.getInt(3),b=r.getInt(4);
                r1 = s1.executeQuery("select name from equipment where equip_id ="+a);
                r2 = s2.executeQuery("select name from brand where brand_id ="+b);
                r1.next();
                String str1=r1.getString(1);
                r2.next();
                String str2=r2.getString(1);
                cb.addItem(str1+" -- "+str2);
            }
             con.close();
            
        }catch(SQLException e){
            System.out.println("An error occurred while connecting MySQL databse");
            e.printStackTrace();
        }
    }
      public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cb) { 
            selected =cb.getSelectedIndex();
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
            ResultSet r = s.executeQuery("select * from complaint where comp_id ="+comp_id[selected]);
            r.next();
            int a1 = r.getInt(6);
            String am=r.getString(8);
            ResultSet r1=s.executeQuery("select name from technician where tech_id="+a1);
            r1.next();
            String str=r1.getString(1);
            tech_txt.setHorizontalAlignment(SwingConstants.LEFT);
             amount_txt.setHorizontalAlignment(SwingConstants.LEFT);
            tech_txt.setText(str);
            amount_txt.setText(am);
            con.close();
        }catch(SQLException ex){
            System.out.println("An error occurred while connecting MySQL databse");
            ex.printStackTrace();
        }
        } 
    
}




