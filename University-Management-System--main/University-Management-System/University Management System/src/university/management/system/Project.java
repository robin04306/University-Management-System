package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        super("University Management System");
        
        setSize(1920,1030);
        
        ImageIcon sic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/shan.jpg"));
        Image si3 = sic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon sicc3 = new ImageIcon(si3);
        JLabel sl1 = new JLabel(sicc3);
        
        add(sl1);
        
        JMenuBar smb  = new JMenuBar();
        JMenu smaster = new JMenu("Master");
        JMenuItem sm1 = new JMenuItem("New Faculty");
        JMenuItem sm2 = new JMenuItem("New Student Admission");
        smaster.setForeground(Color.BLUE);
        
        
        sm1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sm1.setIcon(new ImageIcon(image1));
        sm1.setMnemonic('A');
        sm1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        sm1.setBackground(Color.WHITE);
        
        sm2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        sm2.setIcon(new ImageIcon(image2));
        sm2.setMnemonic('B');
        sm2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        sm2.setBackground(Color.WHITE);
    
        
        sm1.addActionListener(this);
        sm2.addActionListener(this);
        

  
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
        
        JMenu sattendance = new JMenu("Attendance");
        JMenuItem sa1 = new JMenuItem("Student Attendance");
        JMenuItem sa2 = new JMenuItem("Teacher Attendance");
        sattendance.setForeground(Color.BLUE);
        
        sa1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon23 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon14.jpg"));
        Image image24 = icon23.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sa1.setIcon(new ImageIcon(image24));
        sa1.setMnemonic('M');
        sa1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        sa1.setBackground(Color.WHITE);
        sattendance.add(sa1);
        
        sa2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon25 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon15.png"));
        Image image26 = icon25.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sa2.setIcon(new ImageIcon(image26));
        sa2.setMnemonic('N');
        sa2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        sa2.setBackground(Color.WHITE);
        sattendance.add(sa2);

        sa1.addActionListener(this);
        sa2.addActionListener(this);
        
        
        
        JMenu sattendance_detail = new JMenu("Attendance Detail");
        JMenuItem sb1 = new JMenuItem("Student Attendance Detail");
        JMenuItem sb2 = new JMenuItem("Teacher Attendance Detail");
        sattendance_detail.setForeground(Color.RED);
        
        sb1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon27 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon15.png"));
        Image image28 = icon27.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sb1.setIcon(new ImageIcon(image28));
        sb1.setMnemonic('O');
        sb1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        sb1.setBackground(Color.WHITE);
        sattendance_detail.add(sb1);
        
        sb2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon29 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon14.jpg"));
        Image image30 = icon29.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sb2.setIcon(new ImageIcon(image30));
        sb2.setMnemonic('P');
        sb2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        sb2.setBackground(Color.WHITE);
        sattendance_detail.add(sb2);

        sb1.addActionListener(this);
        sb2.addActionListener(this);
        
        
        JMenu sexam = new JMenu("Examination");
        JMenuItem sc1 = new JMenuItem("Examination Details");
        JMenuItem sc2 = new JMenuItem("Enter Marks");
        sexam.setForeground(Color.BLUE);
        
        sc1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon16.png"));
        Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sc1.setIcon(new ImageIcon(image31));
        sc1.setMnemonic('Q');
        sc1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        sc1.setBackground(Color.WHITE);
        sexam.add(sc1);
        
        sc2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon17.png"));
        Image image33 = icon32.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sc2.setIcon(new ImageIcon(image33));
        sc2.setMnemonic('R');
        sc2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        sc2.setBackground(Color.WHITE);
        sexam.add(sc2);

        sc1.addActionListener(this);
        sc2.addActionListener(this);
        
        JMenu sreport = new JMenu("Update Details");
        JMenuItem sr1 = new JMenuItem("Update Students");
        JMenuItem sr2 = new JMenuItem("Update Teachers");
        sreport.setForeground(Color.RED);
        
        sr1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sr1.setIcon(new ImageIcon(image7));
        sr1.setMnemonic('E');
        sr1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        sr1.setBackground(Color.WHITE);
        
        sr1.addActionListener(this);
        
        sr2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon6.png"));
        Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        sr2.setIcon(new ImageIcon(imagee));
        sr2.setMnemonic('F');
        sr2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        sr2.setBackground(Color.WHITE);
        
        sr2.addActionListener(this);
        
        
        
        
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
        
        

        smaster.add(sm1);
        smaster.add(sm2);
        
        suser.add(su1);
        suser.add(su2);
        
        sreport.add(sr1);
        sreport.add(sr2);
        
        sfee.add(ss1);
        sfee.add(ss2);
  
        
        
        sexit.add(sex);
         
        smb.add(smaster);
        smb.add(suser);
        smb.add(sattendance);
        smb.add(sattendance_detail);
        smb.add(sexam);
        smb.add(sreport);
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
