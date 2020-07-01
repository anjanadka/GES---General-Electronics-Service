package ges;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class searchtech extends JFrame implements ActionListener {
	private JLabel tech =new JLabel("TECHNICIAN");
	private JLabel Copy =new JLabel("TECHNICIAN");
	private JLabel name=new JLabel("Name	:");
	private JLabel Rating =new JLabel("Rating 	:");
	private JButton Select = new JButton("SELECT");
	searchtech() 
    {
  	Color c=new Color(0,153,204);
	Color d=new Color(255,255,181);
	getContentPane().setBackground(c);


        setLayout(null);
	tech.setBounds(100,10,500,150);
	tech.setForeground(d);
	Copy.setBounds(102,12,500,150);
	Copy.setForeground(Color.black);
	tech.setFont(new Font("Algerian",Font.BOLD,40));
	
	Copy.setFont(new Font("Algerian",Font.BOLD,40));
	name.setBounds(100,150,200,30);
	name.setForeground(Color.white);
	name.setFont(new Font("Arno Pro",Font.BOLD,25));
	Rating.setBounds(100,200,200,30);
	Rating.setForeground(Color.white);
	Rating.setFont(new Font("Arno Pro",Font.BOLD,25));
	Select.setBounds(100,250,200,20);
	add(tech);
	add(name);
	add(Rating);
	add(Select);
	add(Copy);
	Select.addActionListener(this);
}
public void actionPerformed(ActionEvent p)
{
Object q=p.getSource();
if(q==Select)
{
customer_options r=new customer_options(100);
r.setVisible(true);
this.setVisible(false);
r.setSize(750,750);
}
}
public static void main(String[] args){
        searchtech s = new searchtech();
        s.setVisible(true);
        s.setSize(750,750);
    }
}
