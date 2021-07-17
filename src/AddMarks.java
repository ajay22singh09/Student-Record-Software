import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class AddMarks 
{
    public JFrame f;
Connection c=null;
    public AddMarks()
    {
      f=new JFrame("Update Details");
f.setSize(600,470);
f.setLayout(null);
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int sw=(int)d.getWidth();
int sh=(int)d.getHeight();
f.getContentPane().setBackground(Color.GRAY);
f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
f.setLocation((sw-600)/2,(sh-450)/2);
f.setVisible(true);
JLabel l1=new JLabel("NAME");
JLabel l2=new JLabel("Class");
JLabel l3=new JLabel("SECTION");
JLabel l4=new JLabel("MARKS");
JLabel l5=new JLabel("TEST-TYPE");
JLabel l6=new JLabel("TOTAL MARKS");

//JLabel l6=new JLabel("TEST-TYPE");
JTextField t1=new JTextField(30);
JTextField t2=new JTextField(30);
JTextField t3=new JTextField(30);
JTextField t4=new JTextField(30);
JTextField t5=new JTextField(30);
JTextField t6=new JTextField(30);
JButton b1=new JButton("submit");
//Button b2=new Button("MORE INFORMATION");
Font ft=new Font("tahoma",Font.ITALIC+Font.BOLD,30);
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
b1.setFont(ft);
l1.setBounds(100,20,150,50);
l2.setBounds(100,80,150,50);
l3.setBounds(100,140,150,50);
l4.setBounds(100,200,150,50);
l5.setBounds(100,260,150,50);
l6.setBounds(100,320,150,50);
t1.setBounds(280,20,150,50);
t2.setBounds(280,80,150,50);
t3.setBounds(280,140,150,50);
t4.setBounds(280,200,150,50);
t5.setBounds(280,260,150,50);
t6.setBounds(280,320,150,50);


b1.setBounds(200,380,150,50);
//b2.setBounds(340,320,150,50);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l6);
f.add(l5);
f.add(t4);
f.add(t5);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(t6);
f.add(b1);  
b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
    try{
String str1=t1.getText();
String str2=t2.getText();
String str3=t3.getText();
String str4=t4.getText();
String str5=t5.getText();
String str6=t6.getText();
//int n1=Integer.parseInt(str1);
int n=Integer.parseInt(str2);

int n1=Integer.parseInt(str4);
int n2=Integer.parseInt(str6);
if(n==11)
{
    if(str3.equals("A"))
    {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("driver loaded");
Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
PreparedStatement ps=c.prepareStatement("insert into marks1(name,class,section,marks,test_type,total_marks) values (?,?,?,?,?,?)");
System.out.println("prepare statement working");
ps.setString(1,str1);
ps.setInt(2,n);
ps.setString(3,str3);
ps.setInt(4,n1);
ps.setString(5,str5);
ps.setInt(6,n2);
System.out.println("working");
ps.executeUpdate();
//ps.executeUpdate();
System.out.println("working");
Statement st=c.createStatement();
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
    f.dispose();
    new MainPage();
}
    }
     if(str3.equals("B"))
    {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("driver loaded");
Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
PreparedStatement ps=c.prepareStatement("insert into marks2(name,class,section,marks,test_type,total_marks) values (?,?,?,?,?,?)");
System.out.println("prepare statement working");
ps.setString(1,str1);
ps.setInt(2,n);
ps.setString(3,str3);
ps.setInt(4,n1);
ps.setString(5,str5);
ps.setInt(6,n2);
System.out.println("working");
ps.executeUpdate();
//ps.executeUpdate();
System.out.println("working");
Statement st=c.createStatement();
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
    f.dispose();
    new MainPage();
}
    }
}
if(n==12)
{
    if(str3.equals("A"))
    {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("driver loaded");
Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
PreparedStatement ps=c.prepareStatement("insert into marks3(name,class,section,marks,test_type,total_marks) values (?,?,?,?,?,?)");
System.out.println("prepare statement working");
ps.setString(1,str1);
ps.setInt(2,n);
ps.setString(3,str3);
ps.setInt(4,n1);
ps.setString(5,str5);
ps.setInt(6,n2);
System.out.println("working");
ps.executeUpdate();
//ps.executeUpdate();
System.out.println("working");
Statement st=c.createStatement();
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
    f.dispose();
    new MainPage();
}
    }
     if(str3.equals("B"))
    {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("driver loaded");
Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
PreparedStatement ps=c.prepareStatement("insert into marks4(name,class,section,marks,test_type,total_marks) values (?,?,?,?,?,?)");
System.out.println("prepare statement working");
ps.setString(1,str1);
ps.setInt(2,n);
ps.setString(3,str3);
ps.setInt(4,n1);
ps.setString(5,str5);
ps.setInt(6,n2);
System.out.println("working");
ps.executeUpdate();
//ps.executeUpdate();
System.out.println("working");
Statement st=c.createStatement();
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
    f.dispose();
    new MainPage();
}
    }
}
}
catch(Exception e1)
{}
}
});
    }
    public static void main(String a[])
    {
        new AddMarks();
    }
}