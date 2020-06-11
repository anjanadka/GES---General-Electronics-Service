package ges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class customerdetails extends Applet {
	private JLabel NAME =new JLabel("Name		:");
	private JLabel ADDRESS =new JLabel("Address		:");
	private JLabel PINCODE =new JLabel("PINCODE		:");
	private JButton Submit = new JButton("SUBMIT");
	private JTextField Name=new JTextField(30);
	private JTextField Address=new JTextField(100);
	private JTextField Pincode=new JTextField(6);
	private JTextField Mob=new JTextField(10);
	private JLabel MOB =new JLabel("Mob 	:");
	private JLabel Customer=new JLabel("CUSTOMER DETAILS");


    public void init() 
    {
  


        setLayout(null);
	Customer.setBounds(500,100,200,10);
	Customer.setForeground(Color.red);
	NAME.setForeground(Color.blue);
	PINCODE.setForeground(Color.blue);
	MOB.setForeground(Color.blue);
	ADDRESS.setForeground(Color.blue);
	
	NAME.setFont(new Font("ALGERIAN",Font.BOLD,40));
	
	NAME.setBounds(400,150,100,20);
	NAME.setFont(new Font("Arno Pro",Font.PLAIN,20));
	
	Name.setBounds(620,150,150,20);
	ADDRESS.setFont(new Font("Arno Pro",Font.PLAIN,20));
	ADDRESS.setBounds(400,175,100,20);
	Address.setBounds(620,175,250,20);
	PINCODE.setBounds(400,200,100,20);
	PINCODE.setFont(new Font("Arno Pro",Font.PLAIN,20));
	Pincode.setBounds(620,200,100,20);
	MOB.setBounds(400,225,100,20);
	MOB.setFont(new Font("Arno Pro",Font.PLAIN,20));
	Mob.setBounds(620,225,150,20);
	Submit.setBounds(500,300,80,40);
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
}
}

