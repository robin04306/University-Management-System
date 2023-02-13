package university.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class AddStudent implements ActionListener{

    JFrame sf;
    JLabel sid,sid1,sid2,sid3,sid4,sid5,sid6,sid7,sid8,sid9,sid10,sid11,sid12,sid15,sid16,sid17,slab,slab1,slab2;
    JTextField st,st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12,st13;
    JButton sb,sb1,sb2,sb3;
    JComboBox sc1,sc2;
    
      
    Random sran = new Random();
    long sfirst4 = (sran.nextLong() % 9000L) + 1000L;
    long sfirst = Math.abs(sfirst4);
    
    

    public AddStudent(){
        sf = new JFrame("Add Student");
        sf.setBackground(Color.white);
        sf.setLayout(null);

        sid15=new JLabel();
        sid15.setBounds(0,0,900,700);
        sid15.setLayout(null);
      

        sid8 = new JLabel("New Student Details");
        sid8.setBounds(320,30,500,50);
        sid8.setFont(new Font("serif",Font.ITALIC,25));
        sid8.setForeground(Color.black);
        sid15.add(sid8);
        sf.add(sid15);

 
        sid1 = new JLabel("Name");
        sid1.setBounds(50,150,100,30);
        sid1.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(sid1);

        st1=new JTextField();
        st1.setBounds(200,150,150,30);
        sid15.add(st1);

        sid2 = new JLabel("Surname");
        sid2.setBounds(400,150,200,30);
        sid2.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(sid2);

        st2=new JTextField();
        st2.setBounds(600,150,150,30);
        sid15.add(st2);

        sid3= new JLabel("Age");
        sid3.setBounds(50,200,100,30);
        sid3.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(sid3);

        st3=new JTextField();
        st3.setBounds(200,200,150,30);
        sid15.add(st3);

        sid4= new JLabel("DOB (dd/mm/yyyy)");  
        sid4.setBounds(400,200,200,30);
        sid4.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(sid4);

        st4=new JTextField();
        st4.setBounds(600,200,150,30);
        sid15.add(st4);

        sid5= new JLabel("Address");
        sid5.setBounds(50,250,100,30);
        sid5.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(sid5);

        st5=new JTextField();
        st5.setBounds(200,250,150,30);
        sid15.add(st5);

        sid6= new JLabel("Phone");
        sid6.setBounds(400,250,100,30);
        sid6.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(sid6);

        st6=new JTextField();
        st6.setBounds(600,250,150,30);
        sid15.add(st6);

        sid7= new JLabel("Email Id");
        sid7.setBounds(50,300,100,30);
        sid7.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(sid7);

        st7=new JTextField();
        st7.setBounds(200,300,150,30);
        sid15.add(st7);

        sid9= new JLabel("HSK Level");
        sid9.setBounds(400,300,130,30);
        sid9.setFont(new Font("serif",Font.BOLD,20));    
        sid15.add(sid9);

        st8=new JTextField();
        st8.setBounds(600,300,150,30);
        sid15.add(st8);

        sid10= new JLabel("TOEFL");
        sid10.setBounds(50,350,130,30);
        sid10.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(sid10);

        st9=new JTextField();
        st9.setBounds(200,350,150,30);
        sid15.add(st9);


        sid11= new JLabel("Passport ID  ");
        sid11.setBounds(400,350,100,30);
        sid11.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(sid11);

        st10=new JTextField();
        st10.setBounds(600,350,150,30);
        sid15.add(st10);

        sid12= new JLabel("Student ID");
        sid12.setBounds(50,400,150,30);
        sid12.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(sid12);

        st11=new JTextField();   
        st11.setBounds(200,400,150,30);
        st11.setText("1533"+sfirst);
        sid15.add(st11);


        slab=new JLabel("Course");
        slab.setBounds(400,400,150,30);
	slab.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(slab);
            
        String course[] = {"BEng","BBA","MEng","Bsc","Msc","MBA","PhD"};
        sc1 = new JComboBox(course);
        sc1.setBackground(Color.WHITE);
        sc1.setBounds(600,400,150,30);
        sid15.add(sc1);
        
        slab2=new JLabel("Branch");
        slab2.setBounds(50,450,150,30);
	slab2.setFont(new Font("serif",Font.BOLD,20));
        sid15.add(slab2);
        
        String branch[] = {"Computer Science","Business","Electrical","Mechanical","Aeronatic"};
        sc2 = new JComboBox(branch);
        sc2.setBackground(Color.WHITE);
        sc2.setBounds(200,450,150,30);
        sid15.add(sc2);
        
        sb = new JButton("Submit");
        sb.setBackground(Color.BLACK);
        sb.setForeground(Color.WHITE);
        sb.setBounds(250,550,150,40);
        
        sid15.add(sb);

        sb1=new JButton("Cancel");   
        sb1.setBackground(Color.BLACK);
        sb1.setForeground(Color.WHITE);
        sb1.setBounds(450,550,150,40);
        
        sid15.add(sb1);
        
        sb.addActionListener(this);
        sb1.addActionListener(this);
        
        sf.setVisible(true);
        sf.setSize(900,700);
        sf.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){
        
        String a = st1.getText();
        String bb = st2.getText();
        String c = st3.getText();
        String d = st4.getText();
        String e = st5.getText();
        String ff = st6.getText();
        String g = st7.getText();
        String h = st8.getText();
        String i = st9.getText();
        String j = st10.getText();
        String k = st11.getText();
        String l = (String)sc1.getSelectedItem();
        String m = (String)sc2.getSelectedItem();
        
        if(ae.getSource() == sb){
            try{
                conn scc = new conn();
                String sq = "insert into student values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"')";
                scc.s.executeUpdate(sq);
                JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully");
                sf.setVisible(false);
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == sb1){
            sf.setVisible(false);
            new Project().setVisible(true);
            
        }
    }
    public static void main(String[ ] arg){
        new AddStudent().sf.setVisible(true);
    }
}