package Travel_Mgmt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;


class Login1 extends JFrame implements ActionListener {
        Container c;
        JPanel p2,p3;
        JLabel l0,l1,l2,l3,l4,l5,l6;
        JTextField jt1,jt2;
        JPasswordField jp1,jp2;
        JButton b1,b2,b3,b4; 
     
        
    public Login1()
    {
      c=getContentPane();
      c.setLayout(null);
      setBounds(150, 20,1200, 750);
      setDefaultCloseOperation(Login1.EXIT_ON_CLOSE);
      Font f1=new Font("Arial",Font.BOLD, 20);
      Font f2=new Font("Arial",Font.ROMAN_BASELINE, 20);
      p2=new JPanel();
      p2.setLayout(null);
      p2.setBounds(2, 2, 100,746); 
      p2.setBackground(Color.black);
      add(p2);

      p3=new JPanel();
      p3.setLayout(null);
      p3.setBounds(102, 2, 1096,746); 
      p3.setBackground(Color.CYAN);
      add(p3);
      //0
      l0=new JLabel("|| LOGIN INFO ||");
      l0.setBounds(150, 50, 350, 50);
      l0.setFont(f2);
      p3.add(l0);
      //0.1
      l1=new JLabel("|| LOGIN AS ADMIN ||");
      l1.setBounds(700, 50, 350, 50); 
      l1.setFont(f2);
      p3.add(l1);
      //1
      l2=new JLabel("USERID : ");
      l2.setBounds(10, 150, 100, 50);
      l2.setFont(f1);
      p3.add(l2);
      jt1=new JTextField();
      jt1.setBounds(150, 150, 250, 50);
      jt1.setFont(f2);
      p3.add(jt1);
      //2
      l3=new JLabel("PASSWORD : ");
      l3.setBounds(10, 250, 150, 50);
      l3.setFont(f1);
      jp1=new JPasswordField();
      jp1.setBounds(150, 250, 250, 50);
      jp1.setFont(f2);
      p3.add(jp1);
      p3.add(l3);

      l4=new JLabel("ADMIN ID : ");
      l4.setBounds(600, 150, 150, 50);
      l4.setFont(f1);
      p3.add(l4);
      jt2=new JTextField();
      jt2.setBounds(750, 150, 250, 50);
      jt2.setFont(f2);
      p3.add(jt2);
      
      l5=new JLabel("ADMIN PASS : ");
      l5.setBounds(600, 250, 150, 50);
      l5.setFont(f1);
      jp2=new JPasswordField();
      jp2.setBounds(750, 250, 250, 50);
      jp2.setFont(f2);
      p3.add(jp2);
      p3.add(l5);

    

      b1=new JButton("Login");
      b1.setBounds(150, 350, 100, 50);
      b1.setFont(f1);
      p3.add(b1);
    

      b3=new JButton("SignUp");
      b3.setBounds(280, 350, 100, 50); 
      b3.setFont(f1);
      p3.add(b3);

      b2=new JButton("ADMIN-LOGIN");
      b2.setBounds(750, 350, 200, 50); 
      b2.setFont(f1);
      p3.add(b2);

      b2.addActionListener(this);
      b1.addActionListener(this);
      b3.addActionListener(this);
      setVisible(true); 

    }
    public void actionPerformed(ActionEvent e)
    {
       
        if(e.getSource()==b1)
        {
            if(jt1.getText().isEmpty() && jp1.getText().isEmpty())
            {
                JOptionPane.showConfirmDialog(c, "Please Fill The Information", "Error",JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            } 
            else
            {
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/project";
                    String user="root";
                    String pass="Vaishnavi@25";
                    Connection con1=DriverManager.getConnection(url, user, pass);
                    String q1="select * from login";
                    PreparedStatement pstmt2=con1.prepareStatement(q1);
                
                    ResultSet set=pstmt2.executeQuery(q1);
                    boolean dataexits=false;
                    while(set.next())
                    {
                        String user1=set.getString("username");
                        String pass1=set.getString("password");

                        if(user1.equals(jt1.getText().toString()) && pass1.equals(jp1.getText().toString()))
                        {
                            dataexits=true;
                            break;
                            
                        }
                    }
                    if(dataexits)
                    {
                        JOptionPane.showConfirmDialog(c, "Data Matched...You can Login", "Login",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        new home1();
                    }
                    else
                    {
                        JOptionPane.showConfirmDialog(c, "Error...Please Register Before Login", "Error",JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
                        jt1.setText(null);
                        jp1.setText(null);
                    }
                        
                }catch(Exception e3){}
            }
        }

        if(e.getSource()==b3)
        {
            JOptionPane.showConfirmDialog(c, "Are You Sure To Sign Up With New User", "CONFIRMATION",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
            new Sign_up1();
        }
        if(e.getSource()==b2)
        {
          if(jt2.getText().isEmpty() && jp2.getText().isEmpty())
          {
            JOptionPane.showConfirmDialog(c, "Please Fill The Information", "Error",JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
          } 
          else
           {
             try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/project";
                String user="root";
                String pass="Vaishnavi@25";
                Connection con1=DriverManager.getConnection(url, user, pass);
                String q1="select * from admin";
                PreparedStatement pstmt2=con1.prepareStatement(q1);
            
                ResultSet set=pstmt2.executeQuery(q1);
                boolean dataexits2=false;
                while(set.next())
                {
                    String ad_user=set.getString("username");
                    String ad_pass=set.getString("password");

                    if(ad_user.equals(jt2.getText().toString()) && ad_pass.equals(jp2.getText().toString()))
                    {
                        dataexits2=true;
                        break;
                        
                    }
                }
                if(dataexits2)
                {
                    JOptionPane.showConfirmDialog(c, "Thank You Admin", "Login",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    new Admin_home1();
                }
                else
                {
                    JOptionPane.showConfirmDialog(c, "YOU ARE NOT A ADMIN ...U CANT LOGIN HERE ", "Error",JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
                    jt2.setText(null);
                    jp2.setText(null);
                }
                    
              }catch(Exception e3){}  
            }
        }
    }
 
     
}

public class Login {
    public static void main(String[] args) {
        try{
            String str="javax.swing.plaf.nimbus.NimbusLookAndFeel";
            UIManager.setLookAndFeel(str);
        }catch(Exception e1){}
        
        new Login1();
        
        
        
    }

    

}


