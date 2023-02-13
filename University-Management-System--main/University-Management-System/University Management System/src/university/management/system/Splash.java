package university.management.system;

import java.awt.*;
import javax.swing.*;

public class Splash{
    public static void main(String s[]){
        Frame sf = new Frame("Nanjing University of Aeronautics and Astronautics"); 
        sf.setVisible(true); 
        int i;
        int x=1;
        for(i=2;i<=600;i+=4,x+=1){
            sf.setLocation((800-((i+x)/2) ),500-(i/2));
            sf.setSize(i+3*x,i+x/2);
            
            try{
                Thread.sleep(10);
            }catch(Exception e) { }
        }
    }
}
class Frame extends JFrame implements Runnable{
    Thread st1;
    Frame(String s){
        super(s);
        setLayout(new FlowLayout());
        ImageIcon sc1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/nuaa.jpg"));
        Image si1 = sc1.getImage().getScaledInstance(1000, 700,Image.SCALE_DEFAULT);
        ImageIcon si2 = new ImageIcon(si1);
        
        JLabel m1 = new JLabel(si2);
        add(m1);
        st1 = new Thread(this);
        st1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            main_login sf1 = new main_login();
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
}