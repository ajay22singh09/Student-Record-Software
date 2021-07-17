import java.sql.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
class CheckClass
{
    JFrame f;
    public CheckClass()
    {
     f=new JFrame("Display");
        f.setSize(400,300);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int sw=(int)d.getWidth();
int sh=(int)d.getHeight();
f.setLayout(null);
Font ft=new Font("tahoma",Font.ITALIC+Font.BOLD,25);
f.getContentPane().setBackground(Color.GRAY);
f.setVisible(true);
f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
f.setLocation((sw-400)/2,(sh-300)/2);
JLabel l1=new JLabel("ENTER CLASS");
JLabel l2=new JLabel("ENTER SECTION");
JTextField t1=new JTextField(30);
JTextField t2=new JTextField(30);
JButton b1=new JButton("submit");
l1.setBounds(20,20,150,50);
l2.setBounds(20,80,150,50);
t1.setBounds(220,20,150,50);
t2.setBounds(220,80,150,50);
b1.setBounds(60,140,150,50);
//Font ft=new Font("tahoma",Font.ITALIC+Font.BOLD,30);
l1.setFont(ft);
t1.setFont(ft);
l2.setFont(ft);
t2.setFont(ft);
b1.setFont(ft);
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(b1);
        b1.addActionListener(new ActionListener()
        {
          //  int n=Integer.parseInt(t1.getText());
            public void actionPerformed(ActionEvent e)
            {
                try
                {
String str=t1.getText();
int n=Integer.parseInt(str);
String str2=t2.getText();
f.dispose();
               new DisplayClass(n,str2);
        }
                catch(Exception e1)
{
    
}
            }
                });
        
    }
    public static void main(String a[])
    {
        new CheckClass();
    }
}