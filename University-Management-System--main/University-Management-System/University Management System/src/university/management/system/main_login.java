
package university.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class main_login extends JFrame implements ActionListener{

    JFrame sf;
    JLabel sl1,sl2;
    JTextField st1;
    JPasswordField st2;
    JButton sb1,sb2 , sB2 ,sT2;

    main_login(){

        super("Login");

        setBackground(Color.white);
        setLayout(null);

       
        
        ImageIcon si1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/second.jpg"));
        Image si2 = si1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(si2);
        JLabel sl3 = new JLabel(i3);
        sl3.setBounds(350,20,150,150);
        add(sl3);


        sb1 = new JButton("Admin");
        sb1.setBounds(40,80,120,30);
        sb1.setFont(new Font("serif",Font.BOLD,15));
        sb1.addActionListener(this);
        sb1.setBackground(Color.BLACK);
        sb1.setForeground(Color.WHITE);
        add(sb1);

        
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(500,300);
        
        
          sB2 = new JButton("Student");
        sB2.setBounds(40, 130, 120, 30);
        sB2.setBackground(Color.white);
        sB2.setBackground(Color.BLACK);
        sB2.setForeground(Color.WHITE);
        sB2.addActionListener(this);
        add(sB2);

        setVisible(true);
        
          sT2 = new JButton("Teacher");
        sT2.setBounds(40, 180, 120, 30);
        sT2.setBackground(Color.white);
        sT2.setBackground(Color.BLACK);
        sT2.setForeground(Color.WHITE);
        sT2.addActionListener(this);
        add(sT2);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        
         if(ae.getSource()== sb1)
        {
            new Login().setVisible(true);
            this.setVisible(false);
            
        }else if(ae.getSource()== sB2)
        {
            new SLogin().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()== sb2)
                {
                    
                }
         else if(ae.getSource()== sT2)
        {
            new TLogin().setVisible(true);
            this.setVisible(false);
        }
        
         
         
         
        
         
         

        try{
            conn c1 = new conn();
            String u = st1.getText();
            String v = st2.getText();
            
            String sq = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(sq); 
            if(rs.next()){
                new Project().setVisible(true);
                setVisible(false);
            }else{
                //JOptionPane.showMessageDialog(null, "");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
 
    public static void main(String[] arg){
        Login sl = new Login();
    }
}