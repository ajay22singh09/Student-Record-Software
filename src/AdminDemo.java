import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AdminDemo
{
AdminDemo(Object k,Object k1,Object k2,Object k3,Object k4,Object k5)
{
JFrame f=new JFrame();
f.setTitle("ADMIN FORM");
f.setLayout(null);
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int sw=(int)d.getWidth();
int sh=(int)d.getHeight();
f.setSize(500,400);
f.setLocation((sw-600)/2,(sh-500)/2);
f.getContentPane().setBackground(Color.GRAY);
JLabel l1=new JLabel("UserName");
Font ft=new Font("tahoma",Font.ITALIC,20);
l1.setFont(ft);
f.setVisible(true);
l1.setBounds(100,100,150,50);
f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
JTextField t1=new JTextField(30);
t1.setFont(ft);
t1.setBounds(270,100,150,50);
JLabel l2=new JLabel("Password");
l2.setBounds(100,170,150,50);
l2.setFont(ft);
JPasswordField t2=new JPasswordField(30);
t2.setFont(ft);
t2.setBounds(270,170,150,50);
JButton b=new JButton("login");
b.setFont(ft);
b.setBounds(180,250,150,50);
f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(b);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String tf1=t1.getText();
String tf2=t2.getText();
if(k==k1)
{
if(tf1.equals("admin") && tf2.equals("password"))
{
    f.dispose();
new DetailsDemo();
}
else 
{
JOptionPane.showMessageDialog(f,"plzz enter correct details");
}
}
if(k==k2)
{
if(tf1.equals("admin") && tf2.equals("password"))
{
    f.dispose();
new AddMarks();
}
else
{
JOptionPane.showMessageDialog(f,"plzz enter correct details");
}
}
if(k==k3)
{
if(tf1.equals("admin") && tf2.equals("password"))
{
    f.dispose();
    new AddMarks1();
}
else
{
JOptionPane.showMessageDialog(f,"plzz enter correct details");
}
}
if(k==k4)
{
if(tf1.equals("admin") && tf2.equals("password"))
{
    f.dispose();
    new CheckDetails();
}
else
{
JOptionPane.showMessageDialog(f,"plzz enter correct details");
}
}
if(k==k5)
{
if(tf1.equals("admin") && tf2.equals("password"))
{
    f.dispose();
    new CheckClass();
}
else
{
JOptionPane.showMessageDialog(f,"plzz enter correct details");
}
}
}
});
}
}