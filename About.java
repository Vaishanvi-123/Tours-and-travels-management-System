package Travel_Mgmt;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;

import Travel_Mgmt.home1;

class About1 implements ActionListener{
    JPanel p1;
    JButton b1;
    final JWindow w;
    public About1()
    {
        w=new JWindow();
        w.setBounds(150, 20, 1200, 750); 
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(10, 10, 1180, 730);
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JLabel l1=new JLabel("||  A B O U T   O U R S E L F  ||");
        l1.setBounds(350, 50, 700, 50);
        Font f1=new Font("arial", Font.BOLD, 30);
        Font f2=new Font("arial", Font.ITALIC,20);
        l1.setFont(f1);
        p1.add(l1);
        JTextArea ta1=new JTextArea();
        ta1.setBounds(50,150,1100, 550);
       
        ta1.setText("                                                                                           \r\n" +//
                 " Founded in the year 2005 as RAMDUTA.com, an online travel platform, the company boosted as a \r\n" + //
                " private limited in the year 2013 and has emerged as the “Best Upcoming Inbound Tour Operators in India”.\r\n" + //
                " It has been awarded in the category of “Excellence in the Tourism Industry” by World Tourism Brand\r\n" + //
                " Academy.\r\n" + //
                " The SANGAMNER based company, with a strong presence in inbound travel trade and corporate segment,\r\n" + //
                " today has excelled its branches over Sangamner,Pune,Mumbai,Delhi,Mumbai, Agra, Jaipur, Haridwar. \r\n" + //
                " The company with its professionally managed travel engine specializes mainly in organizing Adventure,\r\n" + //
                " Cultural, Religious, hill station & wildlife tours in India through a sprawling network.\r\n" + //
                " It offers 24 X 7 hours services that include travel planning, itinerary design, hotel bookings,\r\n" + //
                " ticket reservations and transport facilities. It also provides holiday packages,\r\n" + //
                " customized as per client’s need and budget.\r\n" + //
                "\r\n" + //
                " Our Motto:\r\n" + //
                " Customer satisfaction: It’s the prime motto of our business, which has helped us to build a good network\r\n" + //
                " with travellers from the farthest corners of the world. The company today holds more than 100,000 \r\n" + //
                " satisfied travellers and is still framing the travel diaries of fresh clients.\r\n" + //
                "\r\n" + //
                " Now you can have a comfortable and hassle free holiday in India where in you leave all the worries\r\n" + //
                " to us. Right from the arrival at the airport to personalized assistance of departure, we take care \r\n" + //
                " of all the needs of the travellers. Our guests just sit back and enjoy their holidays with all the \r\n" + //
                " value for the money they have spent.");
                 ta1.setFont(f2);
      
         
         p1.add(ta1);
         w.add(p1); 
        b1=new JButton("Back");
        b1.setBounds(30, 50, 100, 40);
        b1.setFont(f2);
        p1.add(b1);
        b1.addActionListener(this);
        w.revalidate();
        w.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
          JOptionPane.showConfirmDialog(w, "Are you sure to go back", "Confirmation",JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
          w.dispose();
          new home1();
        }
    }
}

public class About {
    public static void main(String[] args) {
        try{
             String str="javax.swing.plaf.nimbus.NimbusLookAndFeel";
        UIManager.setLookAndFeel(str);

        }catch(Exception e){}
        new About1();
        
    }

}
