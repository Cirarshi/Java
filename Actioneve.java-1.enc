import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Actionevent1 extends Applet
{
Label l=new Label("Click to submit");
public void init()
{
resize(350,500);
Button b=new Button("Submit");
add(b);
add(l);
Elistener lis=new Elistener();
b.addActionListener(lis);
setVisible(true);
}
class Elistener implements ActionListener
{
public void actionPerformed(ActionEvent ae)
{
l.setText("you have pressed button");
setBackground(Color.green);
}
}
}
/*<Applet code = "Actionevent1.class" width=800 Height=500>
</Applet>
*/

