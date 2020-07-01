package ges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class customerdetails extends JFrame implements ActionListener  {
	
	private JLabel NAME =new JLabel("Name		:");
	private JLabel ADDRESS =new JLabel("Address		:");
	private JLabel PINCODE =new JLabel("PINCODE		:");
	private JButton Submit = new JButton("SUBMIT");
	private JButton back = new JButton("Back");
	private JTextField Name=new JTextField(30);
	private JTextArea Address=new JTextArea(" ");
	private JTextField Pincode=new JTextField(6);
	private JTextField Mob=new JTextField(10);
	private JLabel MOB =new JLabel("Mob 	:");
	private JLabel Customer=new JLabel("CUSTOMER DETAILS");
	private JLabel Copy=new JLabel("CUSTOMER DETAILS");
	


   

customerdetails() 
    {
  	
	
	Color c=new Color(0,153,204);
	Color d=new Color(255,255,181);
	getContentPane().setBackground(c);
        setLayout(null);

	Customer.setForeground(Color.black);
	Copy.setForeground(Color.black);
	
	Customer.setBounds(100,10,400,150);
	Copy.setBounds(102,12,400,150);
	Customer.setForeground(d);
	NAME.setForeground(Color.white);
	PINCODE.setForeground(Color.white);
	MOB.setForeground(Color.white);
	ADDRESS.setForeground(Color.white);
	
	Customer.setFont(new Font("Algerian",Font.BOLD,40));
	Copy.setFont(new Font("Algerian",Font.BOLD,40));
	
	NAME.setBounds(100,150,100,20);
	NAME.setFont(new Font("Arno Pro",Font.BOLD,25));
	
	Name.setBounds(260,150,150,20);
	ADDRESS.setFont(new Font("Arno Pro",Font.BOLD,25));
	ADDRESS.setBounds(100,195,100,20);
	Address.setBounds(260,195,150,50);
	PINCODE.setBounds(100,250,150,30);
	PINCODE.setFont(new Font("Arno Pro",Font.BOLD,25));
	Pincode.setBounds(260,250,150,20);
	MOB.setBounds(100,285,100,20);
	MOB.setFont(new Font("Arno Pro",Font.BOLD,25));
	Mob.setBounds(260,285,150,20);
	Submit.setBounds(400,350,80,40);
	back.setBounds(100,350,80,40);
	add(back);
	Submit.addActionListener(this);
	back.addActionListener(this);
        add(NAME);
	add(Name);
	add(ADDRESS);
	add(Address);
	add(PINCODE);
	add(Pincode);
	add(MOB);
	add(Mob);
	add(Submit);
	add(Customer); 
	add(Copy);

}

public void actionPerformed(ActionEvent f)
{
Object g=f.getSource();
if(g==Submit)
{
complaintdetails h=new complaintdetails();
h.setVisible(true);
this.setVisible(false);
h.setSize(750,750);
}
else if(g==back)
{
customer_options i=new customer_options(100);
i.setVisible(true);
this.setVisible(false);
i.setSize(750,750);
}

}
	
 public static void main(String[] args){
        customerdetails j = new customerdetails();
	
        j.setVisible(true);
        j.setSize(750,7500);
    }
}
