import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class complaintdetails extends Applet {
	private Choice EQUIPMENT =new Choice();
	private Choice Brand =new Choice();
	private JLabel brand=new JLabel("Brand :");
	private JLabel head=new JLabel("COMPLAINT DETAILS");

	private JTextField Complaint=new JTextField(10);
	private JLabel COMPLAINT =new JLabel("COMPLAINT");
	private JLabel Equipment =new JLabel("Equipment  :");
	private JLabel DES =new JLabel("Description :");
	private JTextField des=new JTextField(100);
	private JButton Search = new JButton("SEARCH");



    public void init() 
    {
  

	
        setLayout(null);
	Equipment.setFont(new Font("Arno Pro",Font.BOLD,18));
	brand.setFont(new Font("Arno Pro",Font.BOLD,18));
	head.setFont(new Font("ALGERIAN",Font.BOLD,18));
	EQUIPMENT.addItem("FAN");
	EQUIPMENT.addItem("T.V");
	EQUIPMENT.addItem("Refrigerator");
	EQUIPMENT.addItem("Washing Machine");
	EQUIPMENT.addItem("Motor");
	EQUIPMENT.addItem("Mixer Grinder");
	EQUIPMENT.setBounds(700,140,200,100);
	Equipment.setBounds(500,100,200,100);
	brand.setBounds(500,180,200,100);
	Brand.setBounds(700,220,200,100);
	DES.setBounds(500,260,200,100);
	des.setBounds(700,300,200,20);
	Brand.addItem("BAJAJ");
	Brand.addItem("WHIRLPOOL");
	Brand.addItem("SAMSUNG");
	Brand.addItem("L.G");
	Brand.addItem("CG");
	head.setBounds(600,50,200,100);
	Search.setBounds(600,400,200,20);
	head.setForeground(Color.red);
	Equipment.setForeground(Color.blue);
	DES.setForeground(Color.blue);
	brand.setForeground(Color.blue);
	
        add(EQUIPMENT);
	add(Equipment);
	add(head);
	add(Brand);
	add(brand);
	add(head);
	add(DES);
	add(des);
	add(Search);

}
}

