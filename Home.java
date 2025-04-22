package Travel_Mgmt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


class home1 extends JFrame implements ActionListener {
    
    Container c;
    JPanel p1,p2;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;
    public home1()
    {
      c=getContentPane();
      c.setLayout(null);
      setDefaultCloseOperation(home1.DISPOSE_ON_CLOSE);
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

      l1=new JLabel("|| Welcome To Dreamy Destination ||");
      l1.setBounds(130, 70, 700, 80);
      Font f1=new Font("arial",Font.BOLD,30);
      l1.setFont(f1);
      p2.add(l1);

        String url="\"C:\\Users\\Hp\\OneDrive\\Desktop\\travel.vaishnavi\\Images\\bus.jfif\"";
        JLabel bus =new JLabel( new ImageIcon(url));
        bus.setBounds(10, 150, 300, 250); //500 , 300
        p2.add( bus);
       
        String url2="C:\\Users\\Hp\\OneDrive\\Desktop\\travel.vaishnavi\\Images\\train.jfif";
        JLabel train =new JLabel( new ImageIcon(url2));
        train.setBounds(320, 150, 300, 250); 
        p2.add( train);

        String url3="C:\\Users\\Hp\\OneDrive\\Desktop\\travel.vaishnavi\\Images\\plane.jfif";
        JLabel plain =new JLabel( new ImageIcon(url3));
        plain.setBounds(640, 150, 300, 250); 
        p2.add( plain);

        String url4="C:\\Users\\Hp\\OneDrive\\Desktop\\travel.vaishnavi\\Images\\all_vechicle.jfif";
        JLabel ser =new JLabel( new ImageIcon(url4));
        ser.setBounds(150, 370, 300, 250); 
        p2.add( ser);

        String url5="C:\\Users\\Hp\\OneDrive\\Desktop\\travel.vaishnavi\\Images\\car.jfif";
        JLabel car =new JLabel( new ImageIcon(url5));
        car.setBounds(500, 370, 300, 250); 
        p2.add( car);

      l2=new JLabel("|| Life Is Journey Travel It Well ||");
      l2.setBounds(200, 600, 700, 80);
      l2.setFont(f1);
      p2.add(l2);

        //panel 1
        Font f2=new Font("Arial", Font.BOLD, 20);
        b1=new JButton("P r o f i l e");
        b1.setBounds(5, 150, 190, 50);
        b1.setFont(f2);
        p1.add(b1);

        b2=new JButton("A b o u t");
        b2.setBounds(5, 250, 190, 50);
        b2.setFont(f2);
        p1.add(b2);

        b3=new JButton("Select Journey");
        b3.setBounds(5, 350, 190, 50);
        b3.setFont(f2);
        p1.add(b3);

        b4=new JButton("L o g  o u t");
        b4.setBounds(5, 450, 190, 50);
        b4.setFont(f2);
        p1.add(b4);


       

       
      b1.addActionListener(this);
      b2.addActionListener(this);
      b3.addActionListener(this);
      b4.addActionListener(this);
      setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
      
      if(e.getSource()==b1)
      {
        JOptionPane.showConfirmDialog(c, "Click OK to see your Profile", "Confirmation",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        new Profile1();
      }
      if(e.getSource()==b2)
      {
        JOptionPane.showConfirmDialog(c, "Click OK to See ABOUT", "Confirmation",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        new About1();
      }
      
      if(e.getSource()==b3)
      {
        JOptionPane.showConfirmDialog(c, "Click OK to Book Ticket", "Confirmation",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE); 
        new Booking1();
      }
      if(e.getSource()==b4)
      {
        JOptionPane.showConfirmDialog(c, "Are You Sure To LOGOUT", "Confirmation",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE);
        new Login1();
      }

    }
}

public class Home {
    public static void main(String[] args) {
      try{
        String str="javax.swing.plaf.nimbus.NimbusLookAndFeel";
        UIManager.setLookAndFeel(str);
    }catch(Exception e1){}
        new home1();
        
    }

}
