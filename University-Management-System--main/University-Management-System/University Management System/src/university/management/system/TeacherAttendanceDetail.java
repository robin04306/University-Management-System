/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherAttendanceDetail extends JFrame implements ActionListener{
  
    JTable sj1;
    JButton sb1;
    String sh[]={"Teacher ID","Date Time","First Half","Second Half"};
    String sd[][]=new String[15][4];  
    int i=0,j=0;
    
    TeacherAttendanceDetail(){
        super("View Teachers Attendance");
        setSize(800,300);
        setLocation(450,150);

        try{
            String sq="select * from attendance_teacher";
            conn sc1=new conn();
            ResultSet srs=sc1.s.executeQuery(sq);
            while(srs.next()){
                sd[i][j++]=srs.getString("emp_id");
                sd[i][j++]=srs.getString("Date");
                sd[i][j++]=srs.getString("first");
                sd[i][j++]=srs.getString("second");
                i++;
                j=0;
            }
        
            sj1=new JTable(sd,sh);

        }catch(Exception e){}
        
        sb1=new JButton("Print");
        add(sb1,"South");
        JScrollPane s1=new JScrollPane(sj1);
        add(s1);
        
        sb1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            sj1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new TeacherAttendanceDetail().setVisible(true);
    }
}