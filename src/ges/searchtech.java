package ges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class searchtech extends Applet {
	private JLabel tech =new JLabel("TECHNICIAN");
	private JLabel name=new JLabel("Name	:");
	private JLabel Rating =new JLabel("Rating 	:");
	private JButton Select = new JButton("SELECT");
	public void init() 
    {
  


        setLayout(null);
	tech.setBounds(600,50,200,100);
	tech.setForeground(Color.red);
	tech.setFont(new Font("Algerian",Font.BOLD,18));
	name.setBounds(400,150,200,30);
	name.setForeground(Color.blue);
	name.setFont(new Font("Arno Pro",Font.BOLD,18));
	Rating.setBounds(400,200,200,30);
	Rating.setForeground(Color.blue);
	Rating.setFont(new Font("Arno Pro",Font.BOLD,18));
	Select.setBounds(600,250,200,20);
	add(tech);
	add(name);
	add(Rating);
	add(Select);
}
}
