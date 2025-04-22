package Travel_Mgmt;
import javax.swing.*;

import Travel_Mgmt.Login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome_window {
    public static void main(String[] args) throws Exception{
        String str="javax.swing.plaf.nimbus.NimbusLookAndFeel";
        UIManager.setLookAndFeel(str);

        JPanel p1;
        final JWindow w=new JWindow();
        w.setBounds(150, 20, 1200, 750); 
        w.setVisible(true);
    
        w.revalidate();
        p1=new JPanel();
      
        p1.setBounds(10, 10, 1180, 730);
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        w.add(p1);

        String url="C:\\Users\\91801\\Downloads\\amhi_travelkar.png";
        JLabel imageLabel=new JLabel( new ImageIcon(url));
        imageLabel.setBounds(350, 50, 600, 400); //500 , 300
        p1.add(imageLabel);
        p1.setBackground(Color.white);

        JLabel title=new JLabel("|| RAMADUTA "); 
        JLabel title2=new JLabel(" - DREAMY DESTINATION ||");
        JLabel title3=new JLabel("|| Tours And Travels ||");
        title.setBounds(300, 400, 300, 80);
        title2.setBounds(500, 400, 700, 80);
        title3.setBounds(450, 500, 700, 80);
        Font f1=new Font("arial", Font.BOLD, 30);
        title.setFont(f1);
        title.setForeground(Color.ORANGE);
        title2.setFont(f1);
        title3.setFont(f1);
        title3.setForeground(Color.red);
        p1.add(title);
        p1.add(title2);
        p1.add(title3);
        
      
        JProgressBar pb=new JProgressBar(JProgressBar.HORIZONTAL,0, 100);
        pb.setBounds(1, 700, 1178, 30); 
        pb.setStringPainted(true);
        p1.add(pb);
        pb.setBackground(Color.DARK_GRAY);
        int i=0;
        while(i<=100)
        {
            pb.setValue(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            i=i+10;
        }
        
         if(pb.getValue()==100)
        {
          w.dispose();
          new Login1();
        }
    }
        
        
}



