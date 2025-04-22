package Travel_Mgmt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

class Profile1 extends JFrame implements ActionListener
{
    Container c;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8;
    JPasswordField jp1;
    JButton b1,b2;
   
    JPanel p1;
  public Profile1()
  {
      c=getContentPane();
      c.setLayout(null);
      setDefaultCloseOperation(Profile1.DISPOSE_ON_CLOSE);
      setBounds(150, 20,1200, 750);
      c.setBackground(Color.cyan);

      p1=new JPanel();
      p1.setBounds(550, 100, 600, 600);
      p1.setLayout(null);
      p1.setBackground(Color.white);
      p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
      c.add(p1);

      Font f1=new Font("arial",Font.BOLD,30);
      Font f2=new Font("arial",Font.BOLD,20);
      l1=new JLabel("P R O F I L E ");
      l1.setBounds(500, 20, 500,40);
      l1.setFont(f1);
      c.add(l1);

      l2=new JLabel("Enter Userid: ");
      l2.setBounds(100, 100, 150,40);
      l2.setFont(f2);
      c.add(l2);

      l3=new JLabel("Enter Password: ");
      l3.setBounds(100, 160, 200,40);
      l3.setFont(f2);
      c.add(l3);

      jt1=new JTextField();
      jt1.setBounds(300, 103, 200,40);
      jt1.setFont(f2);
      c.add(jt1);

      jp1=new JPasswordField();
      jp1.setBounds(300, 163, 200,40);
      jp1.setFont(f2);
      c.add(jp1);

      b1=new JButton("Submit");
      b1.setBounds(330, 220, 100,40);
      b1.setFont(f2);
      c.add(b1);

      l4=new JLabel("Id: ");
      l4.setBounds(50, 40, 100,40);
      l4.setFont(f2);
      p1.add(l4);
      jt2=new JTextField();
      jt2.setBounds(120, 43, 250,40);
      jt2.setFont(f2);
      p1.add(jt2);

      l5=new JLabel("Name: ");
      l5.setBounds(50, 110, 100,40);
      l5.setFont(f2);
      p1.add(l5);
      jt3=new JTextField();
      jt3.setBounds(120, 113, 250,40);
      jt3.setFont(f2);
      p1.add(jt3);

      l6=new JLabel("Mob: ");
      l6.setBounds(50, 180, 100,40);
      l6.setFont(f2);
      p1.add(l6);
      jt4=new JTextField();
      jt4.setBounds(120, 183, 250,40);
      jt4.setFont(f2);
      p1.add(jt4);

      l6=new JLabel("Addr: ");
      l6.setBounds(50, 250, 100,40);
      l6.setFont(f2);
      p1.add(l6);
      jt5=new JTextField();
      jt5.setBounds(120, 253, 250,40);
      jt5.setFont(f2);
      p1.add(jt5);

      l7=new JLabel("Email: ");
      l7.setBounds(50, 320, 100,40);
      l7.setFont(f2);
      p1.add(l7);
      jt6=new JTextField();
      jt6.setBounds(120, 323, 250,40);
      jt6.setFont(f2);
      p1.add(jt6);

      l8=new JLabel("Userid: ");
      l8.setBounds(50, 390, 100,40);
      l8.setFont(f2);
      p1.add(l8);
      jt7=new JTextField();
      jt7.setBounds(120, 393, 250,40);
      jt7.setFont(f2);
      p1.add(jt7);

      l9=new JLabel("Pass: ");
      l9.setBounds(50, 460, 100,40);
      l9.setFont(f2);
      p1.add(l9);
      jt8=new JTextField();
      jt8.setBounds(120, 463, 250,40);
      jt8.setFont(f2);
      p1.add(jt8);

      b2=new JButton("Back");
      b2.setBounds(20,20, 100, 40);
      b2.setFont(f2);
      c.add(b2);


      b1.addActionListener(this);
      b2.addActionListener(this);
      setVisible(true);
  }
   public void actionPerformed(ActionEvent e2)
   {
    
    if(e2.getSource()==b1)
    {
      String u_name=jt1.getText().toString();
       try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          String url="jdbc:mysql://localhost:3306/project";
          String user="root";
          String pass="Vaishnavi@25";
          Connection con1=DriverManager.getConnection(url, user, pass);
          String query="select id,name,mobile,address,email,username,password from login where username=?";
          PreparedStatement pstmt=con1.prepareStatement(query);
          pstmt.setString(1,u_name);
          ResultSet set=pstmt.executeQuery();
          if(set.next())
          {
            Font f3=new Font("Arial",Font.ITALIC, 15);
            String id=set.getString("id");
            String name=set.getString("name");
            String mob=set.getString("mobile");
            String adrres=set.getString("address");
            String email=set.getString("email");
            String userid=set.getString("username");
            String passw=set.getString("password");

        
            jt2.setText(id);
            jt2.setFont(f3);
            jt3.setText(name);
            jt3.setFont(f3);
            jt4.setText(mob);
            jt4.setFont(f3);
            jt5.setText(adrres);
            jt5.setFont(f3);
            jt6.setText(email);
            jt6.setFont(f3);
            jt7.setText(userid);
            jt7.setFont(f3);
            jt8.setText(passw);
            jt8.setFont(f3);
          }
          }catch(Exception e1)
          {
            e1.printStackTrace();
          }
    }
    if(e2.getSource()==b2)
    {
        JOptionPane.showConfirmDialog(c, "Are you sure to go back", "Confirmation",JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
         new home1();
    }
   
   }
}


public class Profile {
    public static void main(String[] args) {
        try{
            String str="javax.swing.plaf.nimbus.NimbusLookAndFeel";
            UIManager.setLookAndFeel(str);
        }catch(Exception e1){}
        new Profile1();
        
    }

}

