import javax.swing.*;
import java.awt.*;
import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;
import java.awt.event.*;
import java.sql.*;
class DisplayClass extends JPanel implements ActionListener
{
public JFrame f;
JButton b1,b2,b3,b4;
Object kc;
int n;
String s;
DisplayClass(int n,String s)
{
 f=new JFrame("Bharti Software");
f.setSize(400,300);
f.setLayout(null);
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int sw=(int)d.getWidth();
int sh=(int)d.getHeight();
f.setResizable(false);
this.n=n;
this.s=s;
//f.isResizable(false);
f.setLocation((sw-500)/2,(sh-400)/2);
f.getContentPane().setBackground(Color.BLUE);
 b1=new JButton("PROFILE");
 b2=new JButton("CLASS TEST");
 b3=new JButton("SCHOOOL TEST");
  
b1.setFont(new Font("tahoma",Font.BOLD+Font.ITALIC,25));
b2.setFont(new Font("tahoma",Font.BOLD+Font.ITALIC,25));
b3.setFont(new Font("tahoma",Font.BOLD+Font.ITALIC,25));
//b4.setFont(new Font("tahoma",Font.BOLD+Font.ITALIC,25));
b1.setBounds(80,20,250,70);
b2.setBounds(80,100,250,70);
b3.setBounds(80,180,250,70);
//b4.setBounds(100,270,250,70);
f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
f.setVisible(true);
f.add(b1);
f.add(b2);
f.add(b3);
//f.add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

//b4.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent e)
    {
       Object kc;
       kc= e.getSource();
       if(kc==b1)
       {
           
           f.dispose();
        new LastDisplay(kc,n,s,b1,b2,b3);
       }
        if(kc==b2)
       {
           f.dispose();
        new LastDisplay(kc,n,s,b1,b2,b3);
       }
         if(kc==b3)
       {
           f.dispose();
        new LastDisplay(kc,n,s,b1,b2,b3);
       }
    }
    public static void main(String a[])
    {
        //new DisplayClass();
    }
}