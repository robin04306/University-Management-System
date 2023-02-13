
package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendanceDetail extends JFrame implements ActionListener{
  
    JTable sj1;
    JButton sb1;
    String sh[]={"Student ID","Date Time","First Half","Second Half"};
    String sd[][]=new String[15][4];  
    int i=0,j=0;
    
    StudentAttendanceDetail(){
        super("View Students Attendence");
        setSize(800,300);
        setLocation(450,150);

        try{
            String q="select * from attendance_student";
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                sd[i][j++]=rs.getString("rollno");
                sd[i][j++]=rs.getString("Date");
                sd[i][j++]=rs.getString("first");
                sd[i][j++]=rs.getString("second");
                i++;
                j=0;
            }
        
            sj1=new JTable(sd,sh);

        }catch(Exception e){}
        
        sb1=new JButton("Print");
        add(sb1,"South");
        JScrollPane ss1=new JScrollPane(sj1);
        add(ss1);
        
        sb1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            sj1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new StudentAttendanceDetail().setVisible(true);
    }
}