import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class CheckDetails  implements ActionListener
{
    public JFrame f;
    boolean b=false;
    JTextField t1,t2,t3,t4;
    JCheckBox l4;
     Object kc;
    JCheckBox tt4;
    JButton b1,b2;
Connection c=null;int n;
    public CheckDetails()
    {
        f=new JFrame("Product Details");
f.setSize(600,400);
f.setLayout(null);
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int sw=(int)d.getWidth();
int sh=(int)d.getHeight();
f.getContentPane().setBackground(Color.ORANGE);
f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
f.setLocation((sw-600)/2,(sh-350)/2);
f.setVisible(true);
JLabel l1=new JLabel("NAME");
JLabel l2=new JLabel("CLASS");
JLabel l3=new JLabel("SECTION");
 l4=new JCheckBox("CT");
t1=new JTextField(30);
t2=new JTextField(30);
t3=new JTextField(30);
tt4=new JCheckBox("ST");
 b1=new JButton("submit");
b2=new JButton("Display All");
//Button b2=new Button("MORE INFORMATION");
Font ft=new Font("tahoma",Font.ITALIC+Font.BOLD,30);
l1.setFont(ft);
l2.setFont(ft);
l3.setFont(ft);
l4.setFont(ft);
tt4.setFont(ft);
t1.setFont(ft);
t2.setFont(ft);
b1.setFont(ft);
b2.setFont(ft);
//b2.setFont(ft);
t3.setFont(ft);
l1.setBounds(100,20,150,50);
l2.setBounds(100,80,150,50);
l3.setBounds(100,140,150,50);
l4.setBounds(100,200,150,50);
t1.setBounds(280,20,150,50);
t2.setBounds(280,80,150,50);
t3.setBounds(280,140,150,50);
tt4.setBounds(280,200,150,50);
b1.setBounds(170,260,150,50);
b2.setBounds(330,260,170,50);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(tt4);
f.add(b1);
//f.add(b2);
b2.addActionListener(this);
b1.addActionListener(this);
        }
public void actionPerformed(ActionEvent e)
{
    kc=e.getSource();
     if(kc==b2)
    {

        f.dispose();
       // new CheckClass();
         
       // System.out.println("done");
    }
    if(kc==b1)
    {
    String str1=t1.getText();
    String str2=t2.getText();
    String str3=t3.getText();
     boolean b1=l4.isSelected();
     boolean b2=tt4.isSelected();
    
    try{
    n=Integer.parseInt(t2.getText());
     b=true;
    }
    catch(Exception e3)
    {
        JOptionPane.showMessageDialog(f,"Class Name Should Be Numeric");
        
      
    }
    if(b)
    {
    f.dispose();
    new DisplayDemo(str1,n,str3,b1,b2);
    }
    else
    {
          t1.setText("");
 t2.setText("");
  t3.setText("");
   t4.setText("");
   f.dispose();
    new CheckDetails();
    }
    }
    }
public static void main(String a[])
{
    new CheckDetails();
}
}