
package university.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class SLogin extends JFrame implements ActionListener{

    JFrame sf;
    JLabel sl1,sl2;
    JTextField st1;
    JPasswordField st2;
    JButton sb1,sb2;

    SLogin(){

        super("Student Login");

        setBackground(Color.white);
        setLayout(null);

        sl1 = new JLabel("Username");
        sl1.setBounds(40,20,100,30);
        add(sl1);
        
        sl2 = new JLabel("Password");
        sl2.setBounds(40,70,100,30);
        add(sl2);
 
        st1=new JTextField();
        st1.setBounds(150,20,150,30);
        add(st1);

        st2=new JPasswordField();
        st2.setBounds(150,70,150,30);
        add(st2);
        
        ImageIcon si1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/second.jpg"));
        Image si2 = si1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon si3 =  new ImageIcon(si2);
        JLabel sl3 = new JLabel(si3);
        sl3.setBounds(350,20,150,150);
        add(sl3);


        sb1 = new JButton("Login");
        sb1.setBounds(40,140,120,30);
        sb1.setFont(new Font("serif",Font.BOLD,15));
        sb1.addActionListener(this);
        sb1.setBackground(Color.BLACK);
        sb1.setForeground(Color.WHITE);
        add(sb1);

        sb2=new JButton("Cancel");
        sb2.setBounds(180,140,120,30);
        sb2.setFont(new Font("serif",Font.BOLD,15));
        sb2.setBackground(Color.BLACK);
        sb2.setForeground(Color.WHITE);
        add(sb2);

        sb2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(500,300);

    }

    public void actionPerformed(ActionEvent ae){
        
          if(ae.getSource()== sb2)
                {
             new main_login().setVisible(true);
            this.setVisible(false); 
                }

        try{
            conn c1 = new conn();
            String u = st1.getText();
            String v = st2.getText();
            
            String sq = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(sq); 
            if(rs.next()){
                new SProject().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
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