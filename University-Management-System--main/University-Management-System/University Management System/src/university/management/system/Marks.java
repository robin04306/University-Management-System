
package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame{

   JTextArea st1;
   JPanel sp1;
   
   Marks(){}
   Marks(String sstr){
       setSize(500,600);
       setLayout(new BorderLayout());
       
       sp1 = new JPanel();

       st1 = new JTextArea(50,15);
       JScrollPane sjsp = new JScrollPane(st1);
       st1.setFont(new Font("Senserif",Font.ITALIC,18));
       
       add(sp1,"North");
       
       add(sjsp,"Center");
       
       setLocation(450,200);
       mark(sstr);
   }
   
   public void mark(String s){
    try{
           conn sc = new conn();
           
           st1.setText("\tResult of Examination\n\nSubject\n");
           
           ResultSet rs1 = sc.s.executeQuery("select * from subject where rollno="+s);
           
           if(rs1.next()){
               st1.append("\n\t"+rs1.getString("subject1"));
               st1.append("\n\t"+rs1.getString("subject2"));
               st1.append("\n\t"+rs1.getString("subject3"));
               st1.append("\n\t"+rs1.getString("subject4"));
               st1.append("\n\t"+rs1.getString("subject5"));
               st1.append("\n-----------------------------------------");
               st1.append("\n");
           }
           
           ResultSet rs2 = sc.s.executeQuery("select * from marks where rollno="+s);
           
           if(rs2.next()){
               st1.append("\nMarks\n\n\t"+rs2.getString("marks1"));
               st1.append("\n\t"+rs2.getString("marks2"));
               st1.append("\n\t"+rs2.getString("marks3"));
               st1.append("\n\t"+rs2.getString("marks4"));
               st1.append("\n\t"+rs2.getString("marks5"));
               st1.append("\n-----------------------------------------");
               st1.append("\n");
           }
         
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   public static void main(String[] args){
       new Marks().setVisible(true);
   }
}