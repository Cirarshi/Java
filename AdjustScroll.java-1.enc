import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class AdjustScroll extends JPanel implements AdjustmentListener
{
JScrollBar sc=new JScrollBar(JScrollBar.HORIZONTAL);
JLabel  l1=new JLabel("slide scrollbar");
JLabel l2=new JLabel();
public AdjustScroll()
{
setLayout(new BorderLayout());
l1.setHorizontalAlignment(JLabel.CENTER);
add(l1,BorderLayout.CENTER);
add(l2,BorderLayout.SOUTH);
add(sc,BorderLayout.NORTH);
sc.addAdjustmentListener(this);
}
public void adjustmentValueChanged(AdjustmentEvent ae)
{
if(ae.getSource()==sc)
l2.setText("the adjustment type is "+ae.getAdjustmentType()+"pram+"+ae.paramString());
l1.setText("csrollbar position is"+ae.getValue());
}
public static void main(String[] args)
{
JFrame f=new JFrame("Scroll bar example");
AdjustScroll sb=new AdjustScroll();
f.getContentPane().add(sb);
f.setSize(700,200);
f.setVisible(true);
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}});
}
}