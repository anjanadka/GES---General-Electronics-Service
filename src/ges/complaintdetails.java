package ges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class complaintdetails extends JFrame implements ActionListener {
	private Choice EQUIPMENT =new Choice();
	private Choice Brand =new Choice();
	private JLabel brand=new JLabel("Brand :");
	private JLabel head=new JLabel("COMPLAINT DETAILS");
	private JLabel Copy=new JLabel("COMPLAINT DETAILS");

	private JTextField Complaint=new JTextField(10);
	private JLabel COMPLAINT =new JLabel("COMPLAINT");
	private JLabel Equipment =new JLabel("Equipment  :");
	private JLabel DES =new JLabel("Description :");
	private JTextField des=new JTextField(100);
	private JButton Search = new JButton("Search");
	private JButton back = new JButton("Back");





    complaintdetails() 
    {
  

	Color c=new Color(0,153,204);
	Color d=new Color(255,255,181);
	getContentPane().setBackground(c);
	Copy.setForeground(Color.black);
        setLayout(null);
	DES.setFont(new Font("Arno Pro",Font.BOLD,25));
	Equipment.setFont(new Font("Arno Pro",Font.BOLD,25));
	brand.setFont(new Font("Arno Pro",Font.BOLD,25));
	head.setFont(new Font("ALGERIAN",Font.BOLD,40));
	Copy.setFont(new Font("ALGERIAN",Font.BOLD,40));
	EQUIPMENT.addItem("FAN");
	EQUIPMENT.addItem("T.V");
	EQUIPMENT.addItem("Refrigerator");
	EQUIPMENT.addItem("Washing Machine");
	EQUIPMENT.addItem("Motor");
	EQUIPMENT.addItem("Mixer Grinder");
	EQUIPMENT.setBounds(300,140,200,100);
	Equipment.setBounds(100,100,200,100);
	brand.setBounds(100,180,200,100);
	Brand.setBounds(300,220,200,100);
	DES.setBounds(100,260,200,100);
	des.setBounds(300,300,200,20);
	Brand.addItem("BAJAJ");
	Brand.addItem("WHIRLPOOL");
	Brand.addItem("SAMSUNG");
	Brand.addItem("L.G");
	Brand.addItem("CG");
	head.setBounds(100,10,500,150);
	Copy.setBounds(102,12,500,150);
	Search.setBounds(400,350,80,40);
	back.setBounds(100,350,80,40);
	head.setForeground(d);
	Equipment.setForeground(Color.white);
	DES.setForeground(Color.white);
	brand.setForeground(Color.white);
	Search.addActionListener(this);
	back.addActionListener(this);
	add(back);
        add(EQUIPMENT);
	add(Equipment);
	add(head);
	add(Brand);
	add(brand);
	add(head);
	add(DES);
	add(des);
	add(Search);
	add(Copy);
}
public void actionPerformed(ActionEvent k)
{
Object l=k.getSource();
if(l==Search)
{
searchtech m=new searchtech();
m.setVisible(true);
this.setVisible(false);
m.setSize(750,750);
}
else if(l==back)
{
customer_options n=new customer_options(100);
n.setVisible(true);
this.setVisible(false);
n.setSize(750,750);
}



}
    public static void main(String[] args){
       complaintdetails o = new complaintdetails();
        o.setVisible(true);
        o.setSize(750,750);
    }
}
