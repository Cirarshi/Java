import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;
public class Mouseevent1 extends JFrame
implements MouseMotionListener
{
int x,y,x1,y1;
public Mouseevent1()
{
addMouseMotionListener(this);
setTitle("Mouse Dragger");
setSize(400,300);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
}
public void mouseDragged(MouseEvent me)
{
System.out.println("Mouse Dragged to point"+me.getPoint());
x=me.getX();
y=me.getY();
repaint();
}
public void mouseMoved(MouseEvent me2)
{System.out.println("Component moved to "+me2.getComponent());
x1=me2.getX();
y1=me2.getY();
repaint();
}
public void paint(Graphics g)
{
g.setColor(Color.green);
g.fillRect(x1,y1,5,5);
g.setColor(Color.pink);
g.fillRect(x,y,5,5);
}
public static void main(String[] args)
{
new Mouseevent1();
}
}

