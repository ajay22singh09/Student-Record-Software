import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
class LastDisplay
{
   JFrame f;
    LastDisplay(Object kc,int n,String s,Object b1,Object b2,Object b3)
    {
        f=new JFrame("Details");
        f.setSize(700,500);
        f.setVisible(true);
       // f.setLayout(null);
         Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
int sw=(int)d.getWidth();
int sh=(int)d.getHeight();
f.getContentPane().setBackground(Color.WHITE);
f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
f.setLocation((sw-600)/2,(sh-500)/2);
        if(kc==b1)
        {
            if(n==11)
            {       
                if(s.equals("A"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from   bharti2");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
          model.addColumn("Section");
         model.addColumn("Fat-Name");
          model.addColumn("Mobile No");
         model.addColumn("House");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
        System.out.println("ok");
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
              // f.dispose();
              // new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
             //  f.dispose();
              // new CheckDetails();
           }
         
       }
       else
       {
     while(rs.next())
     { 
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6)});
    System.out.println("done");
     }
       
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckClass();
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
                                if(s.equals("B"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from   bharti3");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
          model.addColumn("Section");
         model.addColumn("Fat-Name");
          model.addColumn("Mobile No");
         model.addColumn("House");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
               //f.dispose();
               //new CheckClass();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
              // f.dispose();
             //  new CheckDetails();
           }   
       }
       else
       {
     while(rs.next())
     { 
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6)});
     }
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckClass();
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
                if(s.equals("A"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from bharti");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
          model.addColumn("Section");
         model.addColumn("Fat_Name");
          model.addColumn("Mobile No");
         model.addColumn("House");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
             new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
              // f.dispose();
              // new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
              // f.dispose();
           //    new CheckDetails();
           }
         
       }
       else
       {
     while(rs.next())
     { 
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6)});
     }
       
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckClass();
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
                                if(s.equals("B"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from  bharti1");
     System.out.println("working");
     DefaultTableModel model=new DefaultTableModel();
        JTable t=new JTable(model);
       // t.setFont(ft);
        model.addColumn("Name");
         model.addColumn("Class");
          model.addColumn("Section");
         model.addColumn("Fat-Name");
          model.addColumn("Phone No");
         model.addColumn("House");
           JScrollPane p=new JScrollPane(t);
        f.add(p); 
       if(!rs.isBeforeFirst())
       {
           int   x1= JOptionPane.showConfirmDialog(f,"no record found");
           if(x1==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
            //   f.dispose();
             //  new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
            //   f.dispose();
           //    new CheckDetails();
           }   
       }
       else
       {
     while(rs.next())
     { 
         model.addRow(new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6)});
     }
           int   x2= JOptionPane.showConfirmDialog(f,"Check Another Record");
           if(x2==JOptionPane.YES_OPTION)
           {
               f.dispose();
               new CheckClass();
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
          if(kc==b2)
        {
            if(n==11)
            {       
                if(s.equals("A"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from  marks1");
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
               new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
              // f.dispose();
              // new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
             //  f.dispose();
             //  new CheckDetails();
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
               new CheckClass();
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
                                if(s.equals("B"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from  marks2");
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
               new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
              // f.dispose();
              // new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
             //  f.dispose();
             //  new CheckDetails();
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
               new CheckClass();
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
                if(s.equals("A"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from marks3");
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
               new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
              // f.dispose();
              // new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
             //  f.dispose();
           //    new CheckDetails();
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
               new CheckClass();
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
                                if(s.equals("B"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from  marks4");
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
               new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
            //   f.dispose();
            //   new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
              // f.dispose();
             //  new CheckDetails();
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
               new CheckClass();
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
            if(kc==b3)
        {
            if(n==11)
            {       
                if(s.equals("A"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from   marks5");
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
               new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
              // f.dispose();
            // new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
            //   f.dispose();
           //    new CheckDetails();
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
               new CheckClass();
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
                                if(s.equals("B"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from    marks6");
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
               new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
              // f.dispose();
              // new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
              // f.dispose();
              // new CheckDetails();
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
                if(s.equals("A"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from marks7");
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
               new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
              // f.dispose();
              // new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
           //    f.dispose();
             //  new CheckDetails();
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
               new CheckClass();
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
                                if(s.equals("B"))
                {
                   try{
          Class.forName("com.mysql.jdbc.Driver");
         System.out.println("driver loaded");
      Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/d_b?useSSL=false","root","root123");
        System.out.println("connection established");
     Statement st1=c.createStatement();
     System.out.println("working");
     ResultSet rs=st1.executeQuery("select * from  marks8");
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
               new CheckClass();
           }
           if(x1==JOptionPane.NO_OPTION)
           {
           //    f.dispose();
             //  new CheckDetails();
           }
            if(x1==JOptionPane.CANCEL_OPTION)
           {
             //  f.dispose();
               //new CheckDetails();
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
               new CheckClass();
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