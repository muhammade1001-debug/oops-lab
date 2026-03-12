import java.awt.*;
import java.awt.event.*;
class largest extends Frame implements ActionListener
{
 Label l1,l2,l3,l4;
 TextField t1,t2,t3,t4;
 Button b1;
 largest()
 {
  l1=new Label("First no:");
  l2=new Label("Second no:");
  l3=new Label("Third no:");
  l4=new Label("Largest no:");
  t1=new TextField(10);
  t2=new TextField(10);
  t3=new TextField(10);
  t4=new TextField(10);
  b1=new Button("Compare");
  setLayout(new FlowLayout());
  add(l1);
  add(t1);
  add(l2);
  add(t2);
  add(l3);
  add(t3);
  add(b1);
  add(l4);
  add(t4);
  b1.addActionListener(this);
  setSize(300,200);
  setTitle("Largest of Three Numbers");
  setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
  int x=Integer.parseInt(t1.getText());
  int y=Integer.parseInt(t2.getText());
  int z=Integer.parseInt(t3.getText());
  int large;
  if(x>y && x>z)
   large=x;
  else if(y>z)
   large=y;
  else
   large=z;
  t4.setText(String.valueOf(large));
 }
 public static void main(String args[])
 {
  new largest();
 }
}
