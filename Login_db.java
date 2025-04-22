package Travel_Mgmt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class Login_db1 extends JFrame implements ActionListener
{
    Container c;
    JLabel l1;
    DefaultTableModel dfm;
    JTable t1;
    JButton b1;
    public Login_db1()
    {
        c=getContentPane();
        c.setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(150, 20,1200, 750);
        Font f2=new Font("Arial",Font.ROMAN_BASELINE, 25);
        Font f1=new Font("Arial",Font.ROMAN_BASELINE, 19);
        l1=new JLabel("||  L O G I N  D E T A I L S  ||");
        l1.setBounds(450, 5, 1000, 50);
        l1.setFont(f2);
        l1.setForeground(Color.black);
        c.add(l1);
        b1=new JButton("Back");
        b1.setBounds(20,10, 100, 40);
        b1.setFont(f1);
        c.add(b1);
        dfm=new DefaultTableModel();
        t1=new JTable(dfm);
        JScrollPane sp=new JScrollPane(t1);
        sp.setBounds(10, 60, 1160, 680);
        c.add(sp);
        c.setBackground(Color.cyan);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/project";
            String user="root";
            String pass="Vaishnavi@25";
            Connection con1=DriverManager.getConnection(url, user, pass);
            String q1="select * from login";
            Statement stmt=con1.createStatement();
            ResultSet set=stmt.executeQuery(q1);
            ResultSetMetaData metaData=set.getMetaData();
            int columncnt=metaData.getColumnCount();
            for(int clmindex=1;clmindex<=columncnt;clmindex++)
            {
                dfm.addColumn(metaData.getColumnName(clmindex));
            }
            while(set.next())
            {
                Object rowdata[]=new Object[columncnt];
                for(int i=0;i<columncnt;i++)
                {
                    rowdata[i]=set.getObject(i+1);
                }
                dfm.addRow(rowdata);
            }
        }
        catch(Exception e1)
        {
           e1.printStackTrace();
        }
         b1.addActionListener(this);
         setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new Admin_home1();
        }
    }
}

public class Login_db {
    public static void main(String[] args) {
        try{
            String str="javax.swing.plaf.nimbus.NimbusLookAndFeel";
            UIManager.setLookAndFeel(str);
        }catch(Exception e1){}
        new Login_db1();
        
    }

}
