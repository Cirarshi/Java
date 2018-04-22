import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Keyevent extends Applet implements KeyListener
{
String str=" ";
int key;
public void init()
{
addKeyListener(this);
}
public void keyPressed(KeyEvent k)
{
showStatus("Key is pressed");
}
public void keyReleased(KeyEvent k)
{
showStatus("Key is released");
}
public void keyTyped(KeyEvent k)
{
str=str+k.getKeyChar();
key=k.getKeyCode();
repaint();
}
public void paint(Graphics g)
{
g.drawString(str,30,50);
g.drawString("Key code"+key,30,80);
}
}
/*<Applet code = "Keyevent.class" width=800 Height=500>
</Applet>
*/