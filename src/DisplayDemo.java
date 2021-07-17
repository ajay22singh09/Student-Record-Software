import java.sql.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
class DisplayDemo 
{
    JFrame f;
    String ss1,ss3,ss4,ss5;
    boolean b=false;
    int ss2;
    public DisplayDemo(String s1,int n,String s3,boolean b1,boolean b2)
    {
         f=new JFrame("Display");
        f.setSize(500,400);
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int sw=(int)d.getWidth();
int sh=(int)d.getHeight();
Font ft=new Font("tahoma",Font.ITALIC+Font.BOLD,30);
f.getContentPane().setBackground(Color.GRAY);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
f.setLocation((sw-500)/2,(sh-400)/2);
        f.setVisible(true);
        if(b1)
        {
        if(n==11)
        {
            if(s3.equals("A"))
            {
        try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from marks1 where name='"+s1+"'");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
         model.addColumn("Section");
         model.addColumn("Marks");
          model.addColumn("Test_Type");
          model.addColumn("total_marks");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
         
       }
       else
       {
     while(rs.next())
     { 
      model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6)});
     }
       
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x2==JOptionPane.NO_OPTION)
           {
           }
            if(x2==JOptionPane.CANCEL_OPTION)
           {
              
           }
       }  
        }          
        catch(Exception e)
        {
            
        }
            }
              if(s3.equals("B"))
            {
        try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from marks2 where name='"+s1+"'");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
         int a=f.getWidth();
         int b=f.getHeight();
         
         model.addColumn("Section");
         model.addColumn("Marks");
          model.addColumn("Test_Type");
       model.addColumn("total_marks");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
         
       }
       else
       {
     while(rs.next())
     { 
         
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6)});
       
     }
       
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x2==JOptionPane.NO_OPTION)
           {
           }
            if(x2==JOptionPane.CANCEL_OPTION)
           {
              
           }
       }  
         
     
        }
           
        catch(Exception e)
        {
            
        }
            }
        }
          if(n==12)
        {
            if(s3.equals("A"))
            {
        try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from marks3 where name='"+s1+"'");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
         model.addColumn("Section");
         model.addColumn("Marks");
        model.addColumn("Test_Type");
     model.addColumn("Total_Marks");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
         
       }
       else
       {
     while(rs.next())
     { 
         
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6)});
       
     }
       
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x2==JOptionPane.NO_OPTION)
           {
           }
            if(x2==JOptionPane.CANCEL_OPTION)
           {
              
           }
       }  
         
     
        }
           
        catch(Exception e)
        {
            
        }
            }
              if(s3.equals("B"))
            {
        try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from marks4 where name='"+s1+"'");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
         model.addColumn("Section");
         model.addColumn("Marks");
          model.addColumn("Test_Type");
          model.addColumn("Total_Marks");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
         
       }
       else
       {
     while(rs.next())
     { 
         
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6)});
       
     }
       
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x2==JOptionPane.NO_OPTION)
           {
           }
            if(x2==JOptionPane.CANCEL_OPTION)
           {
              
           }
       }  
         
     
        }
           
        catch(Exception e)
        {
            
        }
            }
        }
        }
         
        if(b2)
        {
        if(n==11)
        {
            if(s3.equals("A"))
            {
        try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from marks5 where name='"+s1+"'");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
         model.addColumn("Section");
         model.addColumn("Marks");
          model.addColumn("Test_Type");
      model.addColumn("Total_Marks");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
         
       }
       else
       {
     while(rs.next())
     { 
         
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6)});
       
     }
       
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x2==JOptionPane.NO_OPTION)
           {
           }
            if(x2==JOptionPane.CANCEL_OPTION)
           {
              
           }
       }  
         
     
        }
           
        catch(Exception e)
        {
            
        }
            }
              if(s3.equals("B"))
            {
        try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from marks6 where name='"+s1+"'");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
         model.addColumn("Section");
         model.addColumn("Marks");
          model.addColumn("Test_Type");
      model.addColumn("Test_Type");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
         
       }
       else
       {
     while(rs.next())
     { 
         
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6)});
       
     }
       
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x2==JOptionPane.NO_OPTION)
           {
           }
            if(x2==JOptionPane.CANCEL_OPTION)
           {
              
           }
       }  
         
     
        }
           
        catch(Exception e)
        {
            
        }
            }
        }
          if(n==12)
        {
            if(s3.equals("A"))
            {
        try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from marks7 where name='"+s1+"'");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
         model.addColumn("Section");
         model.addColumn("Marks");
          model.addColumn("Test_Type");
       model.addColumn("Total_Marks");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
         
       }
       else
       {
     while(rs.next())
     { 
         
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6)});
       
     }
       
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x2==JOptionPane.NO_OPTION)
           {
           }
            if(x2==JOptionPane.CANCEL_OPTION)
           {
              
           }
       }  
         
     
        }
           
        catch(Exception e)
        {
            
        }
            }
              if(s3.equals("B"))
            {
        try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from marks8 where name='"+s1+"'");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
         model.addColumn("Section");
         model.addColumn("Marks");
          model.addColumn("Test_Type");
       model.addColumn("Total_Marks");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
         
       }
       else
       {
     while(rs.next())
     { 
         
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6)});
       
     }
       
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckDetails();
           }
           if(x2==JOptionPane.NO_OPTION)
           {
           }
            if(x2==JOptionPane.CANCEL_OPTION)
           {
              
           }
       }  
         
     
        }
           
        catch(Exception e)
        {
            
        }
            }
        }
        }
    }
  
}