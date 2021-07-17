import javax.swing.*;
import java.awt.*;
import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;
import java.awt.event.*;
import java.sql.*;
public class MainPage extends WindowAdapter implements ActionListener
{
    public JFrame f;
JButton b1,b2,b3,b4,b5;
Object kc;
public MainPage()
{
     f=new JFrame("Software");
f.setSize(500,480);
f.setLayout(null);
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int sw=(int)d.getWidth();
int sh=(int)d.getHeight();
f.setResizable(false);
//f.isResizable(false);
f.setLocation((sw-500)/2,(sh-480)/2);
f.getContentPane().setBackground(Color.BLUE);
b1=new JButton("ADD STUDENT");
b2=new JButton("<html>UPDATE DETAILS<br> FOR CT</html>");
b3=new JButton("<html>UPDATE DETAILS<br> FOR ST</html>");
b4=new JButton("PERSONAL DETAILS ");
b5=new JButton("DISPLAY DETAILS");
b1.setFont(new Font("tahoma",Font.BOLD+Font.ITALIC,25));
b2.setFont(new Font("tahoma",Font.BOLD+Font.ITALIC,25));
b3.setFont(new Font("tahoma",Font.BOLD+Font.ITALIC,25));
b4.setFont(new Font("tahoma",Font.BOLD+Font.ITALIC,25));
b5.setFont(new Font("tahoma",Font.BOLD+Font.ITALIC,25));
b1.setBounds(100,20,300,70);
b2.setBounds(100,100,300,70);
b3.setBounds(100,180,300,70);
b4.setBounds(100,260,300,70);
f.addWindowListener(this);
b5.setBounds(100,340,300,70);
f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
f.setVisible(true);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
kc=e.getSource();
if(kc==b1)
{
   // f.dispose();
AdminDemo ad=new AdminDemo(kc,b1,b2,b3,b4,b5);
}
if(kc==b2)
{
    //f.dispose();
AdminDemo ad1=new AdminDemo(kc,b1,b2,b3,b4,b5);
}
if(kc==b3)
{
    
    
   // f.dispose();
AdminDemo ad2=new AdminDemo(kc,b1,b2,b3,b4,b5);
}
if(kc==b4)
{
    
    
   // f.dispose();
  new AdminDemo(kc,b1,b2,b3,b4,b5);
}
if(kc==b5)
{
    
    
    //f.dispose();
  new AdminDemo(kc,b1,b2,b3,b4,b5);
}
}
public void windowClosing(WindowEvent e)
{
int a=JOptionPane.showConfirmDialog(f,"are you sure");
if(a==JOptionPane.YES_OPTION)
{
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
if(a==JOptionPane.NO_OPTION)
{
    System.out.println("oh");
      f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
}
}
public static void main(String args[])
{
try
{
for(UIManager.LookAndFeelInfo info:UIManager.getInstalledLookAndFeels())
{
if("Nimbus".equals(info.getName()))
{
UIManager.setLookAndFeel(info.getClassName());
break;
}
}
}
catch(ClassNotFoundException e)
{}
catch(InstantiationException e)
{}
catch(IllegalAccessException e)
{}
catch(UnsupportedLookAndFeelException e)
{}
EventQueue.invokeLater(new Runnable()
{
public void run()
{
new MainPage();
}
});
}
}
