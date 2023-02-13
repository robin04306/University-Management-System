
package university.management.system;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class StudentDetails extends JFrame implements ActionListener{
 
    JLabel sl1,sl2,sl3;
    JTable st1;
    JButton sb1,sb2,sb3;
    JTextField st2;
    String sx[] = {"Name","Surname","Age","Date of Birth","Address","Phone","Email","HSK Level", "TOEFL", "Passport ID","Student ID","Course","Branch"};
    String sy[][] = new String[20][13];
    int i=0, j=0;
    StudentDetails(){
        super("Student Details");
        setSize(1260,650);
        setLocation(200,200);
        setLayout(null);
        
        sl1 = new JLabel("Enter Student ID to delete Student : ");
        sl1.setBounds(50,360,400,30);
        sl1.setFont(new Font("serif",Font.BOLD,20));
        add(sl1);
        
        st2 = new JTextField();
        st2.setBounds(400,360,200,30);
        add(st2);
        
        sb1 = new JButton("Delete");
        sb1.setBackground(Color.BLACK);
        sb1.setForeground(Color.WHITE);
        sb1.setBounds(620, 360, 100 ,30);
        add(sb1);
            
        sl2 = new JLabel("Add New Student");
        sl2.setBounds(50,450,400,30);
        sl2.setFont(new Font("serif",Font.BOLD,20));
        add(sl2);
        
        sb2 = new JButton("Add Student");
        sb2.setBackground(Color.BLACK);
        sb2.setForeground(Color.WHITE);
        sb2.setBounds(300, 450, 150 ,30);
        add(sb2);
        
        sl3 = new JLabel("Update Student Details");
        sl3.setBounds(50,490,400,30);
        sl3.setFont(new Font("serif",Font.BOLD,20));
        add(sl3);
        
        sb3 = new JButton("Update Student");
        sb3.setBackground(Color.BLACK);
        sb3.setForeground(Color.WHITE);
        sb3.setBounds(300, 490, 150 ,30);
        add(sb3);
        
        sb1.addActionListener(this);
        sb2.addActionListener(this);
        sb3.addActionListener(this);
        
        
        try{
            conn c1  = new conn();
            String s1 = "select * from student";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                sy[i][j++]=rs.getString("name");
                sy[i][j++]=rs.getString("fathers_name");
                sy[i][j++]=rs.getString("age");
                sy[i][j++]=rs.getString("dob");
                sy[i][j++]=rs.getString("address");
                sy[i][j++]=rs.getString("phone");
                sy[i][j++]=rs.getString("email");
                sy[i][j++]=rs.getString("class_x");
                sy[i][j++]=rs.getString("class_xii");
                sy[i][j++]=rs.getString("aadhar");
                sy[i][j++]=rs.getString("rollno");
                sy[i][j++]=rs.getString("course");
                sy[i][j++]=rs.getString("branch");
                i++;
                j=0;
            }
            st1 = new JTable(sy,sx);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        JScrollPane sp = new JScrollPane(st1);
        sp.setBounds(20,20,1200,330);
        add(sp);
        
        getContentPane().setBackground(Color.WHITE);
        
        sb1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
        conn c1 = new conn();
    
        if(ae.getSource() == sb1){
            try{
                String sa = st2.getText();
                String sq = "delete from student where Student ID = '"+sa+"'";
                c1.s.executeUpdate(sq);
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            }catch(Exception e){}
    
        }else if(ae.getSource() == sb2){
            new AddStudent().sf.setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource() == sb3){
            new UpdateStudent().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new StudentDetails().setVisible(true);
    }
    
}
