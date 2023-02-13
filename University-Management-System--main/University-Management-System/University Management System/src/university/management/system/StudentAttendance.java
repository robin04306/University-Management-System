
package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendance extends JFrame implements ActionListener{
    
    JLabel sl1,sl2,sl3,sl4,sl5,sl6,sl7;
    JTextField st1,st2,st3,st4,st5,st6,st7;
    JButton sb1,sb2;
    Choice sc2,sfh,ssh;
    
    StudentAttendance(){
       
        setLayout(new GridLayout(4,2,50,50));
        sc2 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                sc2.add(rs.getString("rollno")); //rollno   
            }
      
      
       }catch(Exception e){ }
       
        add(new JLabel("Select Student ID"));
        add(sc2);
      
        sl1 = new JLabel("First Half");
        sfh = new Choice();
        sfh.add("Present");
        sfh.add("Absent");
        sfh.add("Leave");
       
        add(sl1);
        add(sfh);
        
        sl2 = new JLabel("Second Half");
        ssh = new Choice();
        ssh.add("Present");
        ssh.add("Absent");
        ssh.add("Leave");
       
        add(sl2);
        add(ssh);
       
        sb1 =new JButton("Submit");
        sb1.setBackground(Color.BLACK);
        sb1.setForeground(Color.WHITE);
     
    
        
        add(sb1);
      
        
        sb1.addActionListener(this);
      
        
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
        setSize(400,450);
        setLocation(600,200);
       
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String f = sfh.getSelectedItem();
        String s = ssh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id=sc2.getSelectedItem();
        String qry = "insert into attendance_student values("+ id +",'"+dt+"','"+f+"','"+s+"')";
       
        try{
            conn c1 = new conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Attendance confirmed");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    
    public static void main(String s[]){
        new StudentAttendance();
    }
}
