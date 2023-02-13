package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SProject extends JFrame implements ActionListener{
    SProject(){
        super("University Management System");
        
        setSize(1920,1030);
        
        ImageIcon sic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/shan.jpg"));
        Image si3 = sic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(si3);
        JLabel sl1 = new JLabel(icc3);
        
        add(sl1);
        
        JMenuBar smb  = new JMenuBar();
       
//      
        JMenu suser = new JMenu("Details");
        JMenuItem su1 = new JMenuItem("Student Details");
        JMenuItem su2 = new JMenuItem("Teacher Details");
        suser.setForeground(Color.RED);
        
        su1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        su1.setIcon(new ImageIcon(image4));
        su1.setMnemonic('C');
        su1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        su1.setBackground(Color.WHITE);
        
        su2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon4.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        su2.setIcon(new ImageIcon(image5));
        su2.setMnemonic('D');
        su2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        su2.setBackground(Color.WHITE);
        
        su1.addActionListener(this);
        su2.addActionListener(this);
        
       
        
        
        JMenu sattendance_detail = new JMenu("Attendance Detail");
        JMenuItem sb1 = new JMenuItem("Student Attendance Detail");
        sattendance_detail.setForeground(Color.RED);
        
        sb1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon27 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon15.png"));
        Image image28 = icon27.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sb1.setIcon(new ImageIcon(image28));
        sb1.setMnemonic('O');
        sb1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        sb1.setBackground(Color.WHITE);
        sattendance_detail.add(sb1);
     

        sb1.addActionListener(this);
       
        
        
        JMenu sexam = new JMenu("Examination");
        JMenuItem sc1 = new JMenuItem("Examination Details");
       
        sexam.setForeground(Color.BLUE);
        
        sc1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon16.png"));
        Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sc1.setIcon(new ImageIcon(image31));
        sc1.setMnemonic('Q');
        sc1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        sc1.setBackground(Color.WHITE);
        sexam.add(sc1);
      
        sc1.addActionListener(this);
       
   
        
        JMenu sfee = new JMenu("Fee Details");
        JMenuItem ss1 = new JMenuItem("Fee Structure");
        JMenuItem ss2 = new JMenuItem("Student Fee Form");
        sfee.setForeground(Color.BLUE);
        
        ss1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon7.png"));
        Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ss1.setIcon(new ImageIcon(image15));
        ss1.setMnemonic('G');
        ss1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        ss1.setBackground(Color.WHITE);
        
        ss1.addActionListener(this);
        
        ss2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon8.png"));
        Image image17 = icon16.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        ss2.setIcon(new ImageIcon(image17));
        ss2.setMnemonic('H');
        ss2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        ss2.setBackground(Color.WHITE);
        
        ss2.addActionListener(this);
        

        JMenu sexit = new JMenu("Exit");
        JMenuItem sex = new JMenuItem("Exit");
        sexit.setForeground(Color.RED);
        

        sex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon12.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sex.setIcon(new ImageIcon(image11));
        sex.setMnemonic('Z');
        sex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        sex.setBackground(Color.WHITE);
        
        sex.addActionListener(this);
        
        

        suser.add(su1);
        suser.add(su2);

        
        sfee.add(ss1);
        sfee.add(ss2);

       
        
        sexit.add(sex);
         
       
        smb.add(suser);

        smb.add(sattendance_detail);
        smb.add(sexam);

        smb.add(sfee);


        smb.add(sexit);
        
        setJMenuBar(smb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            new AddStudent().sf.setVisible(true);
            
        }else if(msg.equals("New Faculty")){
            new AddTeacher().sf.setVisible(true);
            
        }else if(msg.equals("Student Details")){
            new StudentDetails().setVisible(true);
            
        }else if(msg.equals("Teacher Details")){
            new TeacherDetails().setVisible(true);
           
        }
        else if(msg.equals("Update Students")){
            new UpdateStudent().sf.setVisible(true);
           
        }
        else if(msg.equals("Update Teachers")){
            new UpdateTeacher().sf.setVisible(true);
           
        }
        else if(msg.equals("Fee Structure")){
            new FeeStructure().setVisible(true);
           
        }
        else if(msg.equals("Student Fee Form")){
            new StudentFeeForm().setVisible(true);
           
        }
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Web Browser")){
            
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Exit")){
            System.exit(0);
        }else if(msg.equals("About Us")){
            new AboutUs().setVisible(true);
        }else if(msg.equals("Student Attendance")){
            new StudentAttendance().setVisible(true);
        }else if(msg.equals("Teacher Attendance")){
            new TeacherAttendance().setVisible(true);
        }else if(msg.equals("Student Attendance Detail")){
            new StudentAttendanceDetail().setVisible(true);
        }else if(msg.equals("Teacher Attendance Detail")){
            new TeacherAttendanceDetail().setVisible(true);
        }else if(msg.equals("Examination Details")){
            new ExaminationDetails().setVisible(true);
        }else if(msg.equals("Enter Marks")){
            new EnterMarks().setVisible(true);
        }
        
    }
    
    
    public static void main(String[] args){
        new Project().setVisible(true);
    }
    
}
