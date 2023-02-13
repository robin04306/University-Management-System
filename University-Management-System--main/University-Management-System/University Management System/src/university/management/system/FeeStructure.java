
package university.management.system;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame{
    
    JLabel sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sl10,sl11,sl12,sl13,sl14,sl15,sl16,sl17;
    JLabel si1;
    JLabel sb1,sb2,sb3,sb4,sb5,sb6,sb7,sb8;
    JLabel sbb1,sbb2,sbb3,sbb4,sbb5,sbb6,sbb7,sbb8,sbb9,sbb10,sbb11,sbb12,sbb13,sbb14,sbb15,sbb16,sbb17,sbb18;
    JLabel sm1,sm2,sm3,sm4,sm5,sm6,sm7,sm8,sm9,sm10,sm11,sm12;
    
    public FeeStructure(){
        
        setSize(1700,800);
        setLocation(100,100);
        setLayout(null);
        
        si1 = new JLabel("Fee Structure");
        si1.setFont(new Font("serif",Font.ITALIC,56));
        si1.setBounds(600,10,400,70);
        add(si1);
        
        sl1 = new JLabel("Course");
        sl1.setBounds(80,100,100,40);
        sl1.setFont(new Font("serif",Font.BOLD,16));
        add(sl1);
        
        sl2 = new JLabel("BEng");
        sl2.setBounds(280,100,100,40);
        sl2.setFont(new Font("serif",Font.BOLD,16));
        add(sl2);
        
        sl3 = new JLabel("MEng");
        sl3.setBounds(480,100,100,40);
        sl3.setFont(new Font("serif",Font.BOLD,16));
        add(sl3);
        
        sl4 = new JLabel("BBA");
        sl4.setBounds(680,100,100,40);
        sl4.setFont(new Font("serif",Font.BOLD,16));
        add(sl4);
        
        sbb5 = new JLabel("RMB 23000");
        sbb5.setBounds(680,170,150,40);
        sbb5.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb5);
        
        sbb6 = new JLabel("RMB 23000");
        sbb6.setBounds(680,240,150,40);
        sbb6.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb6);
        
        sbb7 = new JLabel("RMB 23000");
        sbb7.setBounds(680,310,150,40);
        sbb7.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb7);
        
        sbb8 = new JLabel("RMB 23000");
        sbb8.setBounds(680,380,150,40);
        sbb8.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb8);
        
        sbb13 = new JLabel("RMB 23000");
        sbb13.setBounds(680,450,150,40);
        sbb13.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb13);
        
        sbb14 = new JLabel("RMB 23000");
        sbb14.setBounds(680,520,150,40);
        sbb14.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb14);
        
        sl5 = new JLabel("Bsc");
        sl5.setBounds(880,100,100,40);
        sl5.setFont(new Font("serif",Font.BOLD,16));
        add(sl5);
        
        sbb9 = new JLabel("RMB 23000");
        sbb9.setBounds(880,170,150,40);
        sbb9.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb9);
        
        sbb10 = new JLabel("RMB 23000");
        sbb10.setBounds(880,240,150,40);
        sbb10.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb10);
        
        sbb11 = new JLabel("RMB 23000");
        sbb11.setBounds(880,310,150,40);
        sbb11.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb11);
        
        sbb12 = new JLabel("RMB 23000");
        sbb12.setBounds(880,380,150,40);
        sbb12.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb12);
        
        sbb15 = new JLabel("RMB 23000");
        sbb15.setBounds(880,450,150,40);
        sbb15.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb15);
        
        sbb16 = new JLabel("RMB 23000");
        sbb16.setBounds(880,520,150,40);
        sbb16.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb16);
        
        sl6 = new JLabel("MBA");
        sl6.setBounds(1080,100,100,40);
        sl6.setFont(new Font("serif",Font.BOLD,16));
        add(sl6);
        
        sm1 = new JLabel("RMB 23000");
        sm1.setBounds(1080,170,150,40);
        sm1.setFont(new Font("serif",Font.PLAIN,16));
        add(sm1);
        
        sm2 = new JLabel("RMB 23000");
        sm2.setBounds(1080,240,150,40);
        sm2.setFont(new Font("serif",Font.PLAIN,16));
        add(sm2);
        
        sm3 = new JLabel("RMB 23000");
        sm3.setBounds(1080,310,150,40);
        sm3.setFont(new Font("serif",Font.PLAIN,16));
        add(sm3);
        
        sm4 = new JLabel("RMB 23000");
        sm4.setBounds(1080,380,150,40);
        sm4.setFont(new Font("serif",Font.PLAIN,16));
        add(sm4);
        
        sl7 = new JLabel("PhD");
        sl7.setBounds(1280,100,100,40);
        sl7.setFont(new Font("serif",Font.BOLD,16));
        add(sl7);
        
        sm5 = new JLabel("RMB 23000");
        sm5.setBounds(1280,170,150,40);
        sm5.setFont(new Font("serif",Font.PLAIN,16));
        add(sm5);
        
        sm6 = new JLabel("RMB 23000");
        sm6.setBounds(1280,240,150,40);
        sm6.setFont(new Font("serif",Font.PLAIN,16));
        add(sm6);
        
        sm7 = new JLabel("RMB 23000");
        sm7.setBounds(1280,310,150,40);
        sm7.setFont(new Font("serif",Font.PLAIN,16));
        add(sm7);
        
        sm8 = new JLabel("RMB 23000");
        sm8.setBounds(1280,380,150,40);
        sm8.setFont(new Font("serif",Font.PLAIN,16));
        add(sm8);
        
        sl8 = new JLabel("MSC");
        sl8.setBounds(1430,100,100,40);
        sl8.setFont(new Font("serif",Font.BOLD,16));
        add(sl8);
        
        sm9 = new JLabel("Rs 23000");
        sm9.setBounds(1430,170,150,40);
        sm9.setFont(new Font("serif",Font.PLAIN,16));
        add(sm9);
        
        sm10 = new JLabel("RMB 23000");
        sm10.setBounds(1430,240,150,40);
        sm10.setFont(new Font("serif",Font.PLAIN,16));
        add(sm10);
        
        sm11 = new JLabel("RMB 23000");
        sm11.setBounds(1430,310,150,40);
        sm11.setFont(new Font("serif",Font.PLAIN,16));
        add(sm11);
        
        sm12 = new JLabel("RMB 23000");
        sm12.setBounds(1430,380,150,40);
        sm12.setFont(new Font("serif",Font.PLAIN,16));
        add(sm12);
        
        sl10 = new JLabel("Semester 1");
        sl10.setBounds(80,170,150,40);
        sl10.setFont(new Font("serif",Font.BOLD,16));
        add(sl10);
        
        sl11 = new JLabel("Semester 2");
        sl11.setBounds(80,240,150,40);
        sl11.setFont(new Font("serif",Font.BOLD,16));
        add(sl11);
        
        sl12 = new JLabel("Semester 3");
        sl12.setBounds(80,310,150,40);
        sl12.setFont(new Font("serif",Font.BOLD,16));
        add(sl12);
        
        sl13 = new JLabel("Semester 4");
        sl13.setBounds(80,380,150,40);
        sl13.setFont(new Font("serif",Font.BOLD,16));
        add(sl13);
        
        sl14 = new JLabel("Semester 5");
        sl14.setBounds(80,450,150,40);
        sl14.setFont(new Font("serif",Font.BOLD,16));
        add(sl14);
        
        sl15 = new JLabel("Semester 6");
        sl15.setBounds(80,520,150,40);
        sl15.setFont(new Font("serif",Font.BOLD,16));
        add(sl15);
        
        sl16 = new JLabel("Semester 7");
        sl16.setBounds(80,590,150,40);
        sl16.setFont(new Font("serif",Font.BOLD,16));
        add(sl16);
        
        sl17 = new JLabel("Semester 8");
        sl17.setBounds(80,660,150,40);
        sl17.setFont(new Font("serif",Font.BOLD,16));
        add(sl17);
        
        
        sb1 = new JLabel("RMB 23000");
        sb1.setBounds(280,170,100,40);
        sb1.setFont(new Font("serif",Font.PLAIN,16));
        add(sb1);
        
        sb2 = new JLabel("RMB 23000");
        sb2.setBounds(280,240,100,40);
        sb2.setFont(new Font("serif",Font.PLAIN,16));
        add(sb2);
        
        sb3 = new JLabel("RMB 23000");
        sb3.setBounds(280,310,100,40);
        sb3.setFont(new Font("serif",Font.PLAIN,16));
        add(sb3);
        
        sb4 = new JLabel("RMB 23000");
        sb4.setBounds(280,380,100,40);
        sb4.setFont(new Font("serif",Font.PLAIN,16));
        add(sb4);
        
        sb5 = new JLabel("RMB 23000");
        sb5.setBounds(280,450,100,40);
        sb5.setFont(new Font("serif",Font.PLAIN,16));
        add(sb5);
        
        sb6 = new JLabel("RMB 23000");
        sb6.setBounds(280,520,100,40);
        sb6.setFont(new Font("serif",Font.PLAIN,16));
        add(sb6);
        
        sb7 = new JLabel("RMB 23000");
        sb7.setBounds(280,590,100,40);
        sb7.setFont(new Font("serif",Font.PLAIN,16));
        add(sb7);
        
        sb8 = new JLabel("RMB 23000");
        sb8.setBounds(280,660,100,40);
        sb8.setFont(new Font("serif",Font.PLAIN,16));
        add(sb8);
        
        
        sbb1 = new JLabel("RMB 23000");
        sbb1.setBounds(480,170,100,40);
        sbb1.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb1);
        
        sbb2 = new JLabel("RMB 23000");
        sbb2.setBounds(480,240,100,40);
        sbb2.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb2);
        
        sbb3 = new JLabel("RMB 23000");
        sbb3.setBounds(480,310,100,40);
        sbb3.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb3);
        
        sbb4 = new JLabel("RMB 23000");
        sbb4.setBounds(480,380,100,40);
        sbb4.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb4);
        
        sbb17 = new JLabel("RMB 23000");
        sbb17.setBounds(480,450,100,40);
        sbb17.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb17);
        
        sbb18 = new JLabel("RMB 23000");
        sbb18.setBounds(480,520,100,40);
        sbb18.setFont(new Font("serif",Font.PLAIN,16));
        add(sbb18);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new FeeStructure().setVisible(true);
    }
}
