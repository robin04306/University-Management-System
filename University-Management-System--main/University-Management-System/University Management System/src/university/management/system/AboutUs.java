package university.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us - University Name");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel al1 = new JLabel("New label");
            ImageIcon ai1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/nuaatop.jpg"));
            Image ai2 = ai1.getImage().getScaledInstance(250, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(ai2);
            al1 = new JLabel(i3);
            al1.setBounds(400, 40, 250, 100);
            contentPane.add(al1);


            JLabel al3 = new JLabel("University");
            al3.setForeground(new Color(0, 250, 154));
            al3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            al3.setBounds(140, 40, 200, 55);
            contentPane.add(al3);

            JLabel al4 = new JLabel("Mangement System");
            al4.setForeground(new Color(127, 255, 0));
            al4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            al4.setBounds(70, 90, 405, 40);
            contentPane.add(al4);

            JLabel al5 = new JLabel("v1.1");
            al5.setForeground(new Color(30, 144, 255));
            al5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            al5.setBounds(185, 140, 100, 21);
            contentPane.add(al5);


            JLabel al6 = new JLabel("Edit  By : CodeBrewer");
            al6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            al6.setBounds(70, 198, 600, 35);
            contentPane.add(al6);

            JLabel al7 = new JLabel("Student ID - ??");
            al7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            al7.setBounds(70, 260, 600, 34);
            contentPane.add(al7);

            JLabel al8 = new JLabel("Contact : codeforinterview01@gmail.com");
            al8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            al8.setBounds(70, 290, 600, 34);
            contentPane.add(al8);

            JLabel al9 = new JLabel("Education - B.Tech (Computer Science)");
            al9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            al9.setBounds(70, 320, 600, 34);
            contentPane.add(al9);


            JLabel al10 = new JLabel("Phone - +911");
            al10.setForeground(new Color(47, 79, 79));
            al10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            al10.setBounds(70, 400, 600, 34);
            contentPane.add(al10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}


