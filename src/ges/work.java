package ges;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class work extends JFrame implements ActionListener {

    private JPanel new_wk=new JPanel();
    private final JPanel comp_wk=new JPanel();
    private final JLabel work[] = new JLabel[5];
    private final JLabel work1[] = new JLabel[5];
    private final JLabel txt_cust[] = new JLabel[5];
    private final JLabel txt_cust1[] = new JLabel[5];
    private final JLabel txt_add[] = new JLabel[5];
    private final JLabel txt_equip[] = new JLabel[5];
    private final JLabel txt_equip1[] = new JLabel[5];
    private final JLabel txt_brand[] = new JLabel[5];
    private final JLabel txt_complaint[] = new JLabel[5];
    private final JButton ok[] = new JButton[5];
    private final JButton ok1[] = new JButton [5];
    private final JSeparator space[] = new JSeparator[5];
    private final JSeparator sp[] = new JSeparator[5];
    private final JSeparator space1[] = new JSeparator[5];
    private final JSeparator sp1[] = new JSeparator[5];
    private final JLabel txt_rate[]= new JLabel[5];
    private final JLabel cust[] = new JLabel[5];
    private final JLabel cust1[] = new JLabel[5];
    private final JLabel add[] = new JLabel[5];
    private final JLabel equip[] = new JLabel[5];
    private final JLabel equip1[] = new JLabel[5];
    private final JLabel brand[] = new JLabel[5];
    private final JLabel complaint[] = new JLabel[5];
    private final JLabel rate[] = new JLabel[5];
    private final JLabel txt_mob[] = new JLabel[5];
    private final JLabel mob[] = new JLabel[5];
    int q;
    public work(int q1) {
        q=q1;
        int i=0,j=0;
        
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
            Statement s3 = con.createStatement();
            ResultSet r = s.executeQuery("select * from complaint where tech_id="+q+" and status = 'not completed'");
            ResultSet r1,r2,r3;
            i=0;
            while(r.next()){
                work[i]= new JLabel("Work");
                r1 =s1.executeQuery("select name,address,pin,mobile_no from customer where cust_id="+r.getInt(5));
                r1.next();
                txt_cust[i]=new JLabel("Customer Name : ");
                String str=r1.getString(1);
                System.out.println(str);
                cust[i]= new JLabel(str);
                txt_add[i]= new JLabel("Address             : ");
                add[i]=new JLabel(r1.getString(2)+" PIN: "+r1.getString(3));
                mob[i]=new JLabel(r1.getString(4));
                txt_mob[i]=new JLabel("Mobile Number  : ");
                r2=s2.executeQuery("select name from equipment where equip_id="+r.getInt(3));
                r2.next();
                txt_equip[i]=new JLabel("Equipment         : ");
                equip[i]=new JLabel(r2.getString(1));
                r3=s3.executeQuery("select name from brand where brand_id="+r.getInt(4));
                r3.next();
                txt_brand[i]=new JLabel("Brand                : ");
                brand[i]=new JLabel(r3.getString(1));
                txt_complaint[i]=new JLabel("Complaint          : ");
                complaint[i]=new JLabel(r.getString(2));
                ok[i]=new JButton("  OK  ");
                space[i] = new JSeparator();
                sp[i]=new JSeparator();
                i++;
                
            }
            ResultSet rs = s.executeQuery("select * from complaint where tech_id="+q+" and status = 'completed'");
            ResultSet rs1,rs2;
            j=0;
            while(rs.next()){
                work1[j]= new JLabel("Work");
                rs1 =s1.executeQuery("select name,address,pin from customer where cust_id="+rs.getInt(5));
                rs1.next();
                txt_cust1[j]=new JLabel("Customer Name : ");
                cust1[j]= new JLabel(rs1.getString(1));
                rs2=s2.executeQuery("select name from equipment where equip_id="+rs.getInt(3));
                rs2.next();
                txt_equip1[j]=new JLabel("Equipment         : ");
                equip1[j]=new JLabel(rs2.getString(1));
                txt_rate[j]=new JLabel("Rating               : ");
                rate[j]=new JLabel(rs.getString(9));
                ok1[j]=new JButton("  OK  ");
                space1[j] = new JSeparator();
                sp1[j]=new JSeparator();
                j++;
            }
        }catch(SQLException e){
            System.out.println("An error occurred while connecting MySQL databse");
            e.printStackTrace();
        }
        JTabbedPane tp=new JTabbedPane();
        tp.setBounds(0,0,500,500);  
          tp.add("New Work",new_wk);
       GroupLayout g1 = new GroupLayout(new_wk);
        g1.setAutoCreateGaps(true);  
        g1.setAutoCreateContainerGaps(true);  
        GroupLayout.ParallelGroup sg = g1.createParallelGroup();
        GroupLayout.ParallelGroup sg1 = g1.createParallelGroup();
        GroupLayout.ParallelGroup sg2 = g1.createParallelGroup();
        GroupLayout.SequentialGroup sq = g1.createSequentialGroup();
         g1.setHorizontalGroup(g1.createSequentialGroup().addGroup(g1.createParallelGroup().addGap(100))
                 .addGroup(sg).addGroup(sg1).addGroup(sg2).addGroup(g1.createParallelGroup().addGap(100))
         );
         g1.setVerticalGroup(g1.createSequentialGroup().addGap(20).addGroup(sq));
          int a=i;
          for(i=0;i<a;i++)
        {
               sg.addGroup(g1.createParallelGroup(LEADING).addComponent(work[i],CENTER).addComponent(txt_cust[i]).addComponent(txt_add[i])
                .addComponent(txt_mob[i]).addComponent(txt_equip[i]).addComponent(txt_brand[i]).addComponent(txt_complaint[i]).addComponent(space[i]));
                sg1.addGroup(g1.createParallelGroup().addComponent(cust[i]).addComponent(add[i])
                .addComponent(mob[i]).addComponent(equip[i]).addComponent(brand[i]).addComponent(complaint[i]).addComponent(sp[i]));
                sg2.addGroup(g1.createParallelGroup(TRAILING).addComponent(ok[i],CENTER));
         
                sq.addGroup(g1.createParallelGroup(BASELINE).addComponent(work[i]))  
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_cust[i]).addComponent(cust[i]))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_add[i]).addComponent(add[i]))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_mob[i]).addComponent(mob[i]))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_equip[i]).addComponent(equip[i]))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_brand[i]).addComponent(brand[i]))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(txt_complaint[i]).addComponent(complaint[i]))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(ok[i],CENTER))
                .addGroup(g1.createParallelGroup(BASELINE).addComponent(space[i]).addComponent(sp[i]));   
        } 
          new_wk.setLayout(g1);
        int w=i;
        for(i=0;i<w;i++)
        {
            ok[i].addActionListener(this);
            work[i].setFont(new Font("Times New Roman",Font.BOLD,24));
                work[i].setForeground(new Color(0,153,204));
                txt_cust[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                txt_equip[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                txt_mob[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                mob[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                txt_brand[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                add[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                txt_complaint[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                txt_add[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                cust[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                equip[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                brand[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
                complaint[i].setFont(new Font("Times New Roman",Font.PLAIN,18));
        
        }
        
        new_wk.setVisible(true);
        new_wk.setBackground(Color.WHITE);
         
        tp.add("Completed Work",comp_wk); 
         GroupLayout g2 = new GroupLayout(comp_wk);
        g2.setAutoCreateGaps(true);  
        g2.setAutoCreateContainerGaps(true);  
        GroupLayout.ParallelGroup gs = g2.createParallelGroup();
        GroupLayout.ParallelGroup gs1 = g2.createParallelGroup();
        GroupLayout.ParallelGroup gs2 = g2.createParallelGroup();

        GroupLayout.SequentialGroup qs = g2.createSequentialGroup();
         g2.setHorizontalGroup(g2.createSequentialGroup().addGroup(g1.createParallelGroup().addGap(100))
                 .addGroup(gs).addGroup(gs1).addGroup(gs2).addGroup(g1.createParallelGroup().addGap(100)));
         g2.setVerticalGroup(g2.createSequentialGroup().addGroup(g1.createParallelGroup().addGap(30)).addGroup(qs));
          int b=j;
          for(j=0;j<b;j++)
        {
               gs.addGroup(g2.createParallelGroup(LEADING).addComponent(work1[j],CENTER).addComponent(txt_cust1[j])
                .addComponent(txt_equip1[j])
                       .addComponent(txt_rate[j])
                       .addComponent(space1[j]));
                gs1.addGroup(g2.createParallelGroup().addComponent(cust1[j])
                .addComponent(equip1[j]).addComponent(rate[j]).addComponent(sp1[j]));
                gs2.addGroup(g2.createParallelGroup(TRAILING).addComponent(ok1[j],CENTER));
         
                qs.addGroup(g2.createParallelGroup(BASELINE).addComponent(work1[j]))  
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(txt_cust1[j]).addComponent(cust1[j]))
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(txt_equip1[j]).addComponent(equip1[j]))
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(txt_rate[j]).addComponent(rate[j]))
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(ok1[j],CENTER))
                .addGroup(g2.createParallelGroup(BASELINE).addComponent(space1[j]).addComponent(sp1[j]));   
        }  
         comp_wk.setLayout(g2);
        comp_wk.setBackground(Color.WHITE);
        for(j=0;j<b;j++){
                work1[j].setFont(new Font("Times New Roman",Font.BOLD,24));
                work1[j].setForeground(new Color(0,153,204));
                txt_cust1[j].setFont(new Font("Times New Roman",Font.PLAIN,18));
                txt_equip1[j].setFont(new Font("Times New Roman",Font.PLAIN,18));
                txt_rate[j].setFont(new Font("Times New Roman",Font.PLAIN,18));
                cust1[j].setFont(new Font("Times New Roman",Font.PLAIN,18));
                equip1[j].setFont(new Font("Times New Roman",Font.PLAIN,18));
                rate[j].setFont(new Font("Times New Roman",Font.PLAIN,18));
                ok1[j].addActionListener(this);
        }
        comp_wk.setVisible(true);
        this.add(tp);

          
        
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        Object s = e.getSource();
        technician_option a = new technician_option(q);
        a.setVisible(true);
        this.setVisible(false);
        a.setSize(750,750);
    }
    
    public static void main(String args[])
    {
        work wk = new work(2001);
        wk.setVisible(true);
       wk.setSize(750,750);
    }
}
