
package university.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class StudentFeeForm extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField st1,st2,st3;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton sb1,sb2;
    Choice sc1;

    public static void main(String[] args) {
        new StudentFeeForm().setVisible(true);
    }


    public StudentFeeForm() {
        super("Student Fee Form");
	setBounds(700, 200, 550, 450);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
	sc1 = new Choice();
        sc1.setForeground(new Color(47, 79, 79));
	sc1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	
        
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
                sc1.add(rs.getString("rollno"));
            }
        }catch(Exception e) { }
        
	JLabel sl1 = new JLabel("Select Roll No");
	sl1.setForeground(new Color(25, 25, 112));
	sl1.setFont(new Font("Tahoma", Font.BOLD, 14));
	sl1.setBounds(64, 63, 102, 22);
	contentPane.add(sl1);

	JLabel sl2 = new JLabel("Name");
	sl2.setForeground(new Color(25, 25, 112));
	sl2.setFont(new Font("Tahoma", Font.BOLD, 14));
	sl2.setBounds(64, 97, 102, 22);
	contentPane.add(sl2);

	JLabel sl3 = new JLabel("Father's Name");
	sl3.setForeground(new Color(25, 25, 112));
	sl3.setFont(new Font("Tahoma", Font.BOLD, 14));
	sl3.setBounds(64, 130, 102, 22);
	contentPane.add(sl3);

	JLabel sl4 = new JLabel("Branch");
	sl4.setForeground(new Color(25, 25, 112));
	sl4.setFont(new Font("Tahoma", Font.BOLD, 14));
	sl4.setBounds(64, 209, 102, 22);
	contentPane.add(sl4);

        JLabel sl5 = new JLabel("Semester");
	sl5.setForeground(new Color(25, 25, 112));
	sl5.setFont(new Font("Tahoma", Font.BOLD, 14));
	sl5.setBounds(64, 242, 102, 22);
	contentPane.add(sl5);

	JLabel sl6 = new JLabel("Total Payable");
	sl6.setForeground(new Color(25, 25, 112));
	sl6.setFont(new Font("Tahoma", Font.BOLD, 14));
	sl6.setBounds(64, 275, 102, 22);
	contentPane.add(sl6);

	sc1.setBounds(174, 66, 156, 20);
	contentPane.add(sc1);

	st2 = new JTextField();
	st2.setForeground(new Color(47, 79, 79));
	st2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	st2.setColumns(10);
	st2.setBounds(174, 100, 156, 20);
	contentPane.add(st2);

	st3 = new JTextField();
	st3.setForeground(new Color(47, 79, 79));
	st3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	st3.setColumns(10);
	st3.setBounds(174, 133, 156, 20);
	contentPane.add(st3);
        
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student where rollno = '"+sc1.getSelectedItem()+"'");
            while(rs.next()){
                st2.setText(rs.getString("name"));
                st3.setText(rs.getString("fathers_name"));
            }
        }catch(Exception e){}

	comboBox = new JComboBox();
	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Computer Science","Business","Electrical","Mechanical","Aeronatic" }));
	comboBox.setForeground(new Color(47, 79, 79));
	comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox.setBounds(176, 211, 154, 20);
	contentPane.add(comboBox);

	comboBox_2 = new JComboBox();
	comboBox_2.setModel(
			new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
	comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox_2.setForeground(new Color(47, 79, 79));
	comboBox_2.setBounds(176, 244, 154, 20);
	contentPane.add(comboBox_2);
        
        st1 = new JTextField();
	st1.setForeground(new Color(47, 79, 79));
	st1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	st1.setColumns(10);
	st1.setBounds(176, 275, 154, 20);
        add(st1);
        
	sb1 = new JButton("Pay");
	sb1.addActionListener(this);
	sb1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	sb1.setBounds(64, 321, 111, 33);
        sb1.setBackground(Color.BLACK);
        sb1.setForeground(Color.WHITE);
	contentPane.add(sb1);

	sb2 = new JButton("Back");
	sb2.addActionListener(this);
	sb2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	sb2.setBounds(198, 321, 111, 33);
        sb2.setBackground(Color.BLACK);
        sb2.setForeground(Color.WHITE);
	contentPane.add(sb2);

	JLabel sl7 = new JLabel("Course");
	sl7.setForeground(new Color(25, 25, 112));
	sl7.setFont(new Font("Tahoma", Font.BOLD, 14));
	sl7.setBounds(64, 173, 102, 22);
	contentPane.add(sl7);

	comboBox_3 = new JComboBox();
	comboBox_3.setModel(new DefaultComboBoxModel(
			new String[] { "BEng","BBA","MEng","Bsc","Msc","MBA","PhD" }));
	comboBox_3.setForeground(new Color(47, 79, 79));
	comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	comboBox_3.setBounds(176, 176, 154, 20);
	contentPane.add(comboBox_3);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Fee-Form",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
	panel.setBackground(new Color(211, 211, 211));
	panel.setBounds(10, 38, 358, 348);
        
        contentPane.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);
        
	contentPane.add(panel);

    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == sb1){
                try{
                conn con = new conn();
                String sql = "insert into fee(rollno, name, fathers_name, course, branch, semester, fee_paid) values(?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, sc1.getSelectedItem());
		st.setString(2, st2.getText());
		st.setString(3, st3.getText());
		st.setString(4, (String) comboBox_3.getSelectedItem());
		st.setString(5, (String) comboBox.getSelectedItem());
		st.setString(6, (String) comboBox_2.getSelectedItem());
		st.setString(7, st1.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Successfully Paid");
                    this.setVisible(false);
                }
		else
                    JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if(ae.getSource() == sb2){
                this.setVisible(false);
            }
        }catch(Exception e){
            
        }
    }
}

