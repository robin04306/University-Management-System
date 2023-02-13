/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;


import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class UpdateStudent implements ActionListener{

    JFrame sf;
    JLabel sid,sid1,sid2,sid3,sid4,sid5,sid6,sid7,sid8,sid9,sid10,sid11,sid12,sid15,slab,slab1,slab2;
    JTextField st,st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12,st13,st14;
    JButton sb,sb1,sb2; 
    String id_emp;

    UpdateStudent(){;
        sf=new JFrame("Update Student details");
        sf.setSize(900,650);
        sf.setLocation(450,150);
        sf.setBackground(Color.white);
        sf.setLayout(null);

        JLabel sl1 = new JLabel("Enter Student ID to update the data of student");
        sl1.setBounds(50,100,500,30);
        sl1.setFont(new Font("serif",Font.ITALIC,20));
        sf.add(sl1);
        
        st12 = new JTextField();
        st12.setBounds(500,100,200,30);
        sf.add(st12);
        
        sb2 = new JButton("Update");
        sb2.setBackground(Color.BLACK);
        sb2.setForeground(Color.WHITE);
        sb2.setBounds(720,100,100,30);
        sf.add(sb2);
        sb2.addActionListener(this);

        
        sid8 = new JLabel("Update Student Details:");
        sid8.setBounds(50,10,500,50);
        sid8.setFont(new Font("serif",Font.ITALIC,40));
        sid8.setForeground(Color.black);
        sf.add(sid8);


        sid1 = new JLabel("Name");
        sid1.setBounds(50,170,100,30);
        sid1.setFont(new Font("serif",Font.BOLD,20));
        sf.add(sid1);

        st1=new JTextField();
        st1.setBounds(200,170,150,30);
        sf.add(st1);

        sid2 = new JLabel("Surname");
        sid2.setBounds(400,170,200,30);
        sid2.setFont(new Font("serif",Font.BOLD,20));
        sf.add(sid2);

        st2=new JTextField();
        st2.setBounds(600,170,150,30);
        sf.add(st2);

        sid3= new JLabel("Age");
        sid3.setBounds(50,220,100,30);
        sid3.setFont(new Font("serif",Font.BOLD,20));
        sf.add(sid3);

        st3=new JTextField();
        st3.setBounds(200,220,150,30);
        sf.add(st3);

        sid4= new JLabel("DOB (dd/mm/yyyy)");  
        sid4.setBounds(400,220,200,30);
        sid4.setFont(new Font("serif",Font.BOLD,20));
        sf.add(sid4);

        st4=new JTextField();
        st4.setBounds(600,220,150,30);
        sf.add(st4);

        sid5= new JLabel("Address");
        sid5.setBounds(50,270,100,30);
        sid5.setFont(new Font("serif",Font.BOLD,20));
        sf.add(sid5);

        st5=new JTextField();
        st5.setBounds(200,270,150,30);
        sf.add(st5);

        sid6= new JLabel("Phone");
        sid6.setBounds(400,270,100,30);
        sid6.setFont(new Font("serif",Font.BOLD,20));
        sf.add(sid6);

        st6=new JTextField();
        st6.setBounds(600,270,150,30);
        sf.add(st6);

        sid7= new JLabel("Email Id");
        sid7.setBounds(50,320,100,30);
        sid7.setFont(new Font("serif",Font.BOLD,20));
        sf.add(sid7);

        st7=new JTextField();
        st7.setBounds(200,320,150,30);
        sf.add(st7);

        sid9= new JLabel("HSK Level");
        sid9.setBounds(400,320,130,30);
        sid9.setFont(new Font("serif",Font.BOLD,20));    
        sf.add(sid9);

        st8=new JTextField();
        st8.setBounds(600,320,150,30);
        sf.add(st8);

        sid10= new JLabel("TOEFL");
        sid10.setBounds(50,370,130,30);
        sid10.setFont(new Font("serif",Font.BOLD,20));
        sf.add(sid10);

        st9=new JTextField();
        st9.setBounds(200,370,150,30);
        sf.add(st9);


        sid11= new JLabel("Passport ID");
        sid11.setBounds(400,370,100,30);
        sid11.setFont(new Font("serif",Font.BOLD,20));
        sf.add(sid11);

        st10=new JTextField();
        st10.setBounds(600,370,150,30);
        sf.add(st10);

        sid12= new JLabel("Student ID");
        sid12.setBounds(50,420,150,30);
        sid12.setFont(new Font("serif",Font.BOLD,20));
        sf.add(sid12);

       st11=new JTextField();   
        st11.setBounds(200,420,150,30);
        sf.add(st11);


        slab=new JLabel("Course");
        slab.setBounds(400,420,150,30);
	slab.setFont(new Font("serif",Font.BOLD,20));
        sf.add(slab);
            
        st13=new JTextField();   
        st13.setBounds(600,420,150,30);
        sf.add(st13);
        
        slab2=new JLabel("Branch");
        slab2.setBounds(50,470,150,30);
	slab2.setFont(new Font("serif",Font.BOLD,20));
        sf.add(slab2);
            
        st14=new JTextField();   
        st14.setBounds(200,470,150,30);
        sf.add(st14);
        
        sb = new JButton("Submit");
        sb.setBackground(Color.BLACK);
        sb.setForeground(Color.WHITE);
        sb.setBounds(250,520,150,40);
        
        sf.add(sb);

        sb1=new JButton("Cancel");   
        sb1.setBackground(Color.BLACK);
        sb1.setForeground(Color.WHITE);
        sb1.setBounds(450,520,150,40);
        
        sf.add(sb1);
        
        sb.addActionListener(this);
        sb1.addActionListener(this);
        
        sf.setVisible(true);
    }



    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==sb){
            try{
                conn con = new conn();
                String str = "update student set name='"+st1.getText()+"',fathers_name='"+st2.getText()+"',age='"+st3.getText()+"', dob='"+st4.getText()+"',address='"+st5.getText()+"',phone='"+st6.getText()+"',email='"+st7.getText()+"',class_x='"+st8.getText()+"',class_xii='"+st9.getText()+"',aadhar='"+st10.getText()+"',course='"+st13.getText()+"',branch='"+st14.getText()+"' where rollno='"+st12.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                sf.setVisible(false);
                new StudentDetails();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==sb1){
            sf.setVisible(false);
            new Project().setVisible(true);
        }
        if(ae.getSource() == sb2){
            try{
                conn con = new conn();
                String str = "select * from student where rollno = '"+st12.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);

                if(rs.next()){
                    sf.setVisible(true);
             

                    st1.setText(rs.getString(1));
                    st2.setText(rs.getString(2));
                    st3.setText(rs.getString(3));
                    st4.setText(rs.getString(4));
                    st5.setText(rs.getString(5));
                    st6.setText(rs.getString(6));
                    st7.setText(rs.getString(7));
                    st8.setText(rs.getString(8));
                    st9.setText(rs.getString(9));
                    st10.setText(rs.getString(10));
                    st11.setText(rs.getString(11));
                    st13.setText(rs.getString(12));
                    st14.setText(rs.getString(13));
                }

                
            }catch(Exception ex){}
        
            sf.setVisible(true);
            sf.setSize(900,650);
            sf.setLocation(450,250);
        }
    }

    public static void main(String[] arg){
        new UpdateStudent().sf.setVisible(true);
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}