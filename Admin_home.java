package Travel_Mgmt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class Admin_home1 extends JFrame implements ActionListener
{
    Container c;
    JPanel p1,p2;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4,b5;
    public Admin_home1()
    {
        c=getContentPane();
        c.setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(150, 20,1200, 750);

        p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(2, 2, 200,746);
        p1.setBackground(Color.black);
        add(p1);
  
        p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(202, 2, 996,746); 
        p2.setBackground(Color.cyan);
        add(p2);

        l1=new JLabel("Hello Dear Admin ! Select Which Report You Want");
        l1.setBounds(100, 10, 900, 80);
        Font f1=new Font("arial",Font.BOLD,30);
        l1.setFont(f1);
        l1.setForeground(Color.black);
        p2.add(l1);

        Font f2=new Font("Arial", Font.BOLD, 20);
        b1=new JButton("L O G I N  D E T A I L S");
        b1.setBounds(100, 150, 300, 50);
        b1.setFont(f2);
        p2.add(b1);

        b2=new JButton("B O O K I N S   D E T A I L S");
        b2.setBounds(100, 250, 300, 50);
        b2.setFont(f2);
        p2.add(b2);


        b5=new JButton("L O G O U T");
        b5.setBounds(150, 400, 200, 40);
        b5.setFont(f2);
        p2.add(b5);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
      
        b5.addActionListener(this);
       

        
       setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
      if(e.getSource()==b1)
      {
        new Login_db1();
      }
      if(e.getSource()==b2)
      {
        new Booking_db1();
      }
      
      if(e.getSource()==b5)
      {
        new Login1();
      }
    }
  
}

public class Admin_home {
    public static void main(String[] args) {
        try{
            String str="javax.swing.plaf.nimbus.NimbusLookAndFeel";
            UIManager.setLookAndFeel(str);
        }catch(Exception e1){}
        new Admin_home1();

        
    }

}

