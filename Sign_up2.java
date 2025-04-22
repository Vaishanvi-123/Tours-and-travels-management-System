package Travel_Mgmt;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

class Sign_up1 extends JFrame implements ActionListener
{
    Container c;
    JPanel p2,p3;
    JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField jt1,jt2,jt3,jt4,jt5,jt6;
    JPasswordField jp1,jp2,jp3;
    JButton b1,b2; 
    String name,mob,addr,mail,usr,passw;
    public Sign_up1()
    {
        c=getContentPane();
        c.setLayout(null);
        setBounds(150, 20,1200, 750);
        setDefaultCloseOperation(Sign_up1.EXIT_ON_CLOSE);
        Font f1=new Font("Arial",Font.BOLD, 20);
        Font f2=new Font("Arial",Font.ROMAN_BASELINE, 20);

      p2=new JPanel();
      p2.setLayout(null);
      p2.setBounds(2, 2, 100,746); //width-200
      p2.setBackground(Color.black);
      add(p2);

      p3=new JPanel();
      p3.setLayout(null);
      p3.setBounds(102, 2, 1096,746); //width-996
      p3.setBackground(Color.cyan);
      add(p3);

      l1=new JLabel("|| REGISTRATION INFO ||");
      l1.setBounds(200, 25, 350, 50); //700, 50, 350, 50
      l1.setFont(f2);
      p3.add(l1);

      l7=new JLabel("NAME : ");
      l7.setBounds(100, 100, 100, 40);
      l7.setFont(f1);
      p3.add(l7);
      jt3=new JTextField();
      jt3.setBounds(300, 100, 250, 40);
      jt3.setFont(f2);
      p3.add(jt3);

      //new 7
      l8=new JLabel("MOBILE : ");
      l8.setBounds(100, 180, 200, 40);
      l8.setFont(f1);
      jt4=new JTextField();
      jt4.setBounds(300, 180, 250, 40);
      jt4.setFont(f2);
      p3.add(jt4);
      p3.add(l8);

      //new 8
      l9=new JLabel("ADDRESS : ");
      l9.setBounds(100, 260, 200, 40);
      l9.setFont(f1);
      jt5=new JTextField();
      jt5.setBounds(300, 260, 250, 40);
      jt5.setFont(f2);
      p3.add(jt5);
      p3.add(l9);

      //new 9
      l10=new JLabel("E-Mail : ");
      l10.setBounds(100, 340, 200, 40);
      l10.setFont(f1);
      jt6=new JTextField();
      jt6.setBounds(300, 340, 250, 40);
      jt6.setFont(f2);
      p3.add(jt6);
      p3.add(l10);

      l4=new JLabel("CREATE_USERID : ");
      l4.setBounds(100, 420, 200, 40);
      l4.setFont(f1);
      p3.add(l4);
      jt2=new JTextField();
      jt2.setBounds(300, 420, 250, 40);
      jt2.setFont(f2);
      p3.add(jt2);
     //4
      l5=new JLabel("CREATE_PASS : ");
      l5.setBounds(100, 500, 200, 40);
      l5.setFont(f1);
      jp2=new JPasswordField();
      jp2.setBounds(300, 500, 250, 40);
      jp2.setFont(f2);
      p3.add(jp2);
      p3.add(l5);
      //5
      l6=new JLabel("CONFIRM_PASS : ");
      l6.setBounds(100, 580, 200, 40);
      l6.setFont(f1);
      jp3=new JPasswordField();
      jp3.setBounds(300, 580, 250, 40);
      jp3.setFont(f2);
      p3.add(jp3);
      p3.add(l6);

      b2=new JButton("Register");
      b2.setBounds(350, 650, 150, 50); //previous 550 y
      b2.setFont(f1);
      p3.add(b2);

      b2.addActionListener(this);




      setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b2)
        {
            if(jt2.getText().isEmpty() && jt3.getText().isEmpty() && jt4.getText().isEmpty() && jt5.getText().isEmpty() && jt6.getText().isEmpty() && jp2.getText().isEmpty() && jp3.getText().isEmpty())
            {
                JOptionPane.showConfirmDialog(c, "Please Fill The Information", "Error",JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                name=jt3.getText().toString();
                mob=jt4.getText().toString();
                addr=jt5.getText().toString();
                mail=jt6.getText().toString();
                usr=jt2.getText().toString();
                passw=jp3.getText().toString();
                try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/project";
                String user="root";
                String pass="Vaishnavi@25";
                Connection con=DriverManager.getConnection(url, user, pass);
                String q="insert into login(name,mobile,address,email,username,password)values(?,?,?,?,?,?)";
                PreparedStatement pstm=con.prepareStatement(q);
                pstm.setString(1, name);
                pstm.setString(2,mob);
                pstm.setString(3,addr);
                pstm.setString(4,mail);
                pstm.setString(5, usr);
                pstm.setString(6, passw);
                pstm.executeUpdate();
                jt2.setText(null);
                jt3.setText(null);
                jt4.setText(null);
                jt5.setText(null);
                jt6.setText(null);
                jp2.setText(null);
                jp3.setText(null);
                JOptionPane.showConfirmDialog(c, "Registration Succesfull", "Confirmation",JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE);
                new Login1();
                }catch(Exception e2)
                {
                  e2.printStackTrace();
                }
            }
        }

    }
}

public class Sign_up2 {
    public static void main(String[] args) {
        try{
            String str="javax.swing.plaf.nimbus.NimbusLookAndFeel";
            UIManager.setLookAndFeel(str);
        }catch(Exception e1){}
        new Sign_up1();
        
    }

}

