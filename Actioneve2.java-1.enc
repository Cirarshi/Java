import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Actionevent2 extends Applet implements ActionListener
{
String Str=new String("Press a button");
Button b1=new Button("Open");
Button b2=new Button("Close");
Button b3=new Button("Copy");
Button b4=new Button("Delete");
public void init()
{
	setSize(300,150);
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void paint(Graphics g)
{
	g.drawString(Str,20,80);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
	Str=("you have clicked open button");
else if(ae.getSource()==b2)
	Str=("you have clicked Close button");
else if(ae.getSource()==b3)
	Str=("you have clicked Copy button");
if(ae.getSource()==b4)
	Str=("you have clicked Delete button");
repaint();
}
}

/*<Applet code = "Actionevent2.class" width=800 Height=500>
</Applet>
*/