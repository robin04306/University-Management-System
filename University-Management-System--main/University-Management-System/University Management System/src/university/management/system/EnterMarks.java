package university.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class EnterMarks extends JFrame implements ActionListener{

    JLabel sl1,sl2,sl3,sl4;
    JTextField st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11;
    JButton sb1;

    EnterMarks(){

        setSize(500,550);
        setLocation(400,200);
        setLayout(null);

        sl1 = new JLabel("Enter marks of Student");
        sl1.setFont(new Font("serif", Font.BOLD, 30));
        sl1.setBounds(50,0,500,80);
        add(sl1);

        sl2 = new JLabel("Enter Student ID");
        sl2.setBounds(50,70,200,40);
        add(sl2);

        st1 = new JTextField();
        st1.setBounds(180,80,200,20);
        add(st1);

        sl3 = new JLabel("Enter Subject");
        sl3.setBounds(50,150,200,40);
        add(sl3);

        sl4 = new JLabel("Enter Marks");
        sl4.setBounds(250,150,200,40);
        add(sl4);

        st2 = new JTextField();
        st2.setBounds(50,200,200,20);
        add(st2);

        st3 = new JTextField();
        st3.setBounds(250,200,200,20);
        add(st3);

        st4 = new JTextField();
        st4.setBounds(50,230,200,20);
        add(st4);

        st5 = new JTextField();
        st5.setBounds(250,230,200,20);
        add(st5);

        st6 = new JTextField();
        st6.setBounds(50,260,200,20);
        add(st6);

        st7 = new JTextField();
        st7.setBounds(250,260,200,20);
        add(st7);

        st8 = new JTextField();
        st8.setBounds(50,290,200,20);
        add(st8);

        st9 = new JTextField();
        st9.setBounds(250,290,200,20);
        add(st9);

        st10 = new JTextField();
        st10.setBounds(50,320,200,20);
        add(st10);

        st11 = new JTextField();
        st11.setBounds(250,320,200,20);
        add(st11);

        sb1 = new JButton("Submit");
        sb1.setBounds(50,360,100,30);
        sb1.setBackground(Color.BLACK);
        sb1.setForeground(Color.WHITE);
        add(sb1);

        sb1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == sb1){
                conn sc1 = new conn();

                String s1 = "insert into subject values('"+st1.getText()+"','"+st2.getText()+"','"+st4.getText()+"','"+st6.getText()+"','"+st8.getText()+"','"+st10.getText()+"')";
                String s2 = "insert into marks values('"+st1.getText()+"','"+st3.getText()+"','"+st5.getText()+"','"+st7.getText()+"','"+st9.getText()+"','"+st11.getText()+"')";

                sc1.s.executeUpdate(s1);
                sc1.s.executeUpdate(s2);
                
                JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
                this.setVisible(false);

            }
        }catch(Exception e){}
    }

    public static void main(String[] args){
        new EnterMarks().setVisible(true);
    }
}