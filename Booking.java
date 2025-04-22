package Travel_Mgmt;
import net.sourceforge.jdatepicker.*;
import net.sourceforge.jdatepicker.JDateComponentFactory;
import javax.swing.*;


import Travel_Mgmt.home1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Booking1 extends JFrame implements ActionListener
{
    Container c;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,one,two,three,four,five,six;
    JTextField jt1,jt2,jt3,jt4;
    JComboBox cb1,cb2,cb3;
    JDatePicker jpc1;
    JPanel p1,p2;
    JButton b1,b2,b3,b4;
    Font f2=new Font("Arial",Font.ROMAN_BASELINE, 20);
    Font f1=new Font("Arial",Font.ITALIC, 30);
    JTextArea ta1;
    
 public Booking1()
 { 
      c=getContentPane();
      c.setLayout(null);
      setBounds(100, 10,1250, 800); //original
     // setBounds(150, 20,1200, 750);
     c.setBackground(Color.CYAN);
      setDefaultCloseOperation(Login1.DISPOSE_ON_CLOSE);
      
      l1=new JLabel("|| WELCOME TO BUS BOOKING SYSTEM ||");
      l1.setBounds(300, 20, 1000, 50);
      l1.setFont(f1);
      c.add(l1);

      l2=new JLabel("Name : ");
      l2.setBounds(100, 90, 100, 50);
      l2.setFont(f2);
      c.add(l2);

      jt1=new JTextField();
      jt1.setBounds(200, 90, 250, 40);
      jt1.setFont(f2);
      c.add(jt1);

      l3=new JLabel("Source : ");
      l3.setBounds(100, 150, 100, 50);
      l3.setFont(f2);
      c.add(l3);
      Object values[]={"Sangamner","Pune","Mumbai","Nashik"};
      cb1=new JComboBox<>(values);
      cb1.setBounds(200, 150, 150, 40);
      cb1.setFont(f2);
      c.add(cb1);

      l4=new JLabel("Destination : ");
      l4.setBounds(450, 150, 150, 50);
      l4.setFont(f2);
      c.add(l4);
      String values2[]={"Sangamner","Pune","Mumbai","Nashik"};
      cb2=new JComboBox<>(values2);
      cb2.setBounds(580, 150, 150, 40);
      cb2.setFont(f2);
      c.add(cb2);

      l3=new JLabel("No. of Passengers : ");
      l3.setBounds(100, 230, 200, 50);
      l3.setFont(f2);
      c.add(l3);

      jt2=new JTextField();
      jt2.setBounds(300, 230, 100, 40);
      jt2.setFont(f2);
      c.add(jt2);

      l5=new JLabel("Time : ");
      l5.setBounds(480, 230, 100, 50);
      l5.setFont(f2);
      c.add(l5);
      String values3[]={"8:00 pm","9:00 pm","10:00 pm","11:00 pm"};
      cb3=new JComboBox<>(values3);
      cb3.setBounds(580, 230, 150, 40);
      cb3.setFont(f2);
      c.add(cb3);

      l6=new JLabel("Select Date : ");
      l6.setBounds(300, 290, 150, 50);
      l6.setFont(f2);
      c.add(l6);
      
      p1=new JPanel();
      p1.setBounds(100, 350, 500, 150); //215
      p1.setBackground(Color.white);
      c.add(p1);
      jpc1=JDateComponentFactory.createJDatePicker();
      p1.add((JComponent) jpc1);
      getContentPane().add(p1,BorderLayout.CENTER);

      l10=new JLabel("Re-Enter Date : ");
      l10.setBounds(100, 520, 200, 50);
      l10.setFont(f2);
      c.add(l10);
      jt4=new JTextField();
      jt4.setBounds(260, 520, 200, 40);
      jt4.setFont(f2);
      c.add(jt4);

      b1=new JButton("SUBMIT");
      b1.setBounds(260,590, 150, 50);
      b1.setFont(f2);
      c.add(b1);

      l7=new JLabel("Payble Amount : ");
      l7.setBounds(100, 660, 200, 50);
      l7.setFont(f2);
      c.add(l7);
      jt3=new JTextField();
      jt3.setBounds(260, 660, 200, 40);
      jt3.setFont(f2);
      c.add(jt3);

     

      ta1=new JTextArea();
      ta1.setBounds(770, 150, 400, 450);
      c.add(ta1);


      b2=new JButton("RESET");
      b2.setBounds(800,630, 150, 50);
      b2.setFont(f2);
      c.add(b2);

      b3=new JButton("BOOK");
      b3.setBounds(980,630, 150, 50);
      b3.setFont(f2);
      c.add(b3);

      l8=new JLabel("T I C K E T  S U M M A R Y");
      l8.setBounds(55, 10, 250, 50);
      l8.setFont(f2);
      ta1.add(l8);

      l9=new JLabel("-------------------------------------------------------------------");
      l9.setBounds(5, 30, 390, 50);
      l9.setFont(f2);
      ta1.add(l9);

      b4=new JButton("Back");
      b4.setBounds(30,30, 100, 40);
      b4.setFont(f2);
      c.add(b4);
      
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);


      setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
    String name1=jt1.getText().toString();
    Object src=cb1.getSelectedItem();
    Object dest=cb2.getSelectedItem();
  //  int passenger=Integer.parseInt(jt2.getText());
   String passenger=jt2.getText().toString();
    Object time1=cb3.getSelectedItem();
    String date2=jt4.getText().toString();
   // int amt=400;
   // String amtt=Integer.toString(amt);
  //  String price=jt2.getText();
  //  int price1=Integer.parseInt(price)*400;
   // Object date1=jpc1.getI18nStrings();
    if(e.getSource()==b1)
    {
        String price=jt2.getText();
       // String price1=price*amt;
      int price1=Integer.parseInt(price)*400;
        if(jt1.getText().isEmpty() && jt2.getText().isEmpty() && jt4.getText().isEmpty())
        {
            JOptionPane.showConfirmDialog(c, "Please Fill The Information", "Error",JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);   
        }
        else
        {
           ta1.setText("\n\n\nNAME : "+name1+"\n\n"+"SOURCE : "+src+"\n\n"+"DEST : "+dest+"\n\n"+
           "No.Of PASSENGER : "+passenger+"\n\n"+"TIME : "+time1+"\n\n"+"DATE : "+date2);
           ta1.setFont(f2);
           jt3.setText(Integer.toString(price1));

        }
    }
    
    if(e.getSource()==b2)
    {
        if(jt1.getText().isEmpty() && jt2.getText().isEmpty() && jt3.getText().isEmpty() && jt4.getText().isEmpty())
        {
            JOptionPane.showConfirmDialog(c, "All Fields Are Already Empty !", "MESSAGE",JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);   
        } 
        else
        {
            jt1.setText(null);
            jt2.setText(null);
            jt3.setText(null);
            jt4.setText(null);
            ta1.setText(null);
        }  
    }
    if(e.getSource()==b3)
    {
        String price=jt2.getText();
        int price1=Integer.parseInt(price)*400;
        if(ta1.getText().isEmpty())
        {
            JOptionPane.showConfirmDialog(c, "Please Submit Your Booking Details First", "ERROR",JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);   
        }
        else
        {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/project";
                String user="root";
                String pass="Vaishnavi@25";
                Connection con=DriverManager.getConnection(url, user, pass);
                String query="insert into booking(name,source,destination,no_of_passengers,time,date,amount)values(?,?,?,?,?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(query);
                pstmt.setString(1, name1);
                pstmt.setObject(2, src);
                pstmt.setObject(3, dest);
                pstmt.setString(4, passenger);
                pstmt.setObject(5, time1);
                pstmt.setString(6, date2);
                pstmt.setInt(7, price1);
                JOptionPane.showConfirmDialog(c, "Congratulations ...Your Ticket is Booked", "Confirmation",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);   
                pstmt.executeUpdate();

        }
        catch(Exception e1)
        {
            
        }
    }
    if(e.getSource()==b4)
    {
        JOptionPane.showConfirmDialog(c, "Are You Sure To Go Back", "Confirmation",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);   
        new home1();
    }
    
 }
}
}

public class Booking {
    public static void main(String[] args) {
        try{
            String str="javax.swing.plaf.nimbus.NimbusLookAndFeel";
            UIManager.setLookAndFeel(str);
        }catch(Exception e1){}
        new Booking1();
    }

}