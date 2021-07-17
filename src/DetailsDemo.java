import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class DetailsDemo 
{
public JFrame f;
Connection c=null;
DetailsDemo()
{
f=new JFrame("Product Details");
f.setSize(600,510);
f.setLayout(null);
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int sw=(int)d.getWidth();
int sh=(int)d.getHeight();
f.getContentPane().setBackground(Color.GRAY);
f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
f.setLocation((sw-550)/2,(sh-500)/2);
f.setResizable(false);
f.setVisible(true);
JLabel l1=new JLabel("NAME");
JLabel l2=new JLabel("CLASS");
JLabel l3=new JLabel("SECTION");
JLabel l4=new JLabel("FT-NAME");
JLabel l5=new JLabel("MB-NUMBER");
JLabel l6=new JLabel("HOUSE");
JTextField t1=new JTextField(30);
JTextField t2=new JTextField(30);
JTextField t3=new JTextField(30);
JTextField t4=new JTextField(30);
JTextField t5=new JTextField(30);
JTextField t6=new JTextField(30);
JButton b1=new JButton("submit");
//Button b2=new Button("MORE INFORMATION");
Font ft=new Font("tahoma",Font.BOLD+Font.ITALIC,30);
l1.setFont(ft);
l2.setFont(ft);
l3.setFont(ft);
l4.setFont(ft);
l5.setFont(ft);
l6.setFont(ft);
t1.setFont(ft);
t2.setFont(ft);
t3.setFont(ft);
t4.setFont(ft);
t5.setFont(ft);
t6.setFont(ft);
//b2.setFont(ft);
b1.setFont(ft);
l1.setBounds(100,10,150,50);
l2.setBounds(100,80,150,50);
l3.setBounds(100,150,150,50);
l4.setBounds(100,220,150,50);
l5.setBounds(100,290,150,50);
l6.setBounds(100,360,150,50);
t1.setBounds(280,10,180,40);
t2.setBounds(280,80,180,40);
t3.setBounds(280,150,180,40);
t4.setBounds(280,220,180,50);
t5.setBounds(280,290,180,40);
t6.setBounds(280,360,180,40);
b1.setBounds(180,420,180,50);
//b2.setBounds(340,320,150,50);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(l4);
f.add(l5);
f.add(l6);
f.add(t4);
f.add(t5);
f.add(t6);
f.add(b1);
//f.add(b2);
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String str1=t1.getText();
String str2=t2.getText();
String str3=t3.getText();
String str4=t4.getText();
String str5=t5.getText();
String str6=t6.getText();
//int n1=Integer.parseInt(str1);
int n=Integer.parseInt(str2);
long n1=Long.parseLong(str5);
try
{
    if(n==12)
    {
        if(str3.equals("A"))
        {
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("driver loaded");

//Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","");
        System.out.println("connection established");
PreparedStatement ps=c.prepareStatement("insert into bharti(name,class,section,father_name,mobile_number,house) values (?,?,?,?,?,?)");
ps.setString(1,str1);
ps.setInt(2,n);
ps.setString(3,str3);
ps.setString(4,str4);
ps.setLong(5,n1);
ps.setString(6,str6);
ps.executeUpdate();
Statement st1=c.createStatement();
c.close();






JOptionPane.showMessageDialog(f,"Data Inserted Successfully");
int done=JOptionPane.showConfirmDialog(f,"Do You Want To Add Another Data");
if(done==JOptionPane.YES_OPTION)
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
}
if(done==JOptionPane.NO_OPTION)
{
 new MainPage();
}
        }
         if(str3.equals("B"))
        {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("driver loaded");

//Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","");
        System.out.println("connection established");
PreparedStatement ps=c.prepareStatement("insert into bharti1(name,class,section,father_name,mobile_number,house) values (?,?,?,?,?,?)");
ps.setString(1,str1);
ps.setInt(2,n);
ps.setString(3,str3);
ps.setString(4,str4);
ps.setLong(5,n1);
ps.setString(6,str6);
ps.executeUpdate();
Statement st1=c.createStatement();
c.close();






JOptionPane.showMessageDialog(f,"Data Inserted Successfully");
int done=JOptionPane.showConfirmDialog(f,"Do You Want To Add Another Data");
if(done==JOptionPane.YES_OPTION)
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
}
if(done==JOptionPane.NO_OPTION)
{
  new MainPage();
}
        }
}
}
catch(Exception e1)
{
}
try{
if(n==11)
{
    
    
    if(str3.equals("A"))
    {
 Class.forName("com.mysql.jdbc.Driver");
System.out.println("driver loaded");

//Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
PreparedStatement ps=c.prepareStatement("insert into bharti2(name,class,section,father_name,mobile_number,house) values (?,?,?,?,?,?)");
ps.setString(1,str1);
ps.setInt(2,n);
ps.setString(3,str3);
ps.setString(4,str4);
ps.setLong(5,n1);
ps.setString(6,str6);
ps.executeUpdate();
Statement st1=c.createStatement();
c.close();
JOptionPane.showMessageDialog(f,"Data Inserted Successfully");
int done=JOptionPane.showConfirmDialog(f,"Do You Want To Add Another Data");
if(done==JOptionPane.YES_OPTION)
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
}
if(done==JOptionPane.NO_OPTION)
{
     new MainPage();
}
    }
    if(str3.equals("B"))
    {
 Class.forName("com.mysql.jdbc.Driver");
System.out.println("driver loaded");

//Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
PreparedStatement ps=c.prepareStatement("insert into bharti3(name,class,section,father_name,mobile_number,house) values (?,?,?,?,?,?)");
ps.setString(1,str1);
ps.setInt(2,n);
ps.setString(3,str3);
ps.setString(4,str4);
ps.setLong(5,n1);
ps.setString(6,str6);
ps.executeUpdate();
Statement st1=c.createStatement();
c.close();
JOptionPane.showMessageDialog(f,"Data Inserted Successfully");
int done=JOptionPane.showConfirmDialog(f,"Do You Want To Add Another Data");
if(done==JOptionPane.YES_OPTION)
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
}
if(done==JOptionPane.NO_OPTION)
{
   new  MainPage();
}
    }
}   
}
catch(Exception ee)
{}
}
});
}
public static void main(String a[])
{
new DetailsDemo();
}
}