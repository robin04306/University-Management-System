
package university.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener{

   private JPanel contentPane;
   private JTable table;
   private JTextField search;
   private JButton sb1,sb2,sb3;

   
    public void Book() {
        try {
            conn con = new conn();
            String sql = "select * from student";
            PreparedStatement sst = con.c.prepareStatement(sql);
            ResultSet srs = sst.executeQuery();

           // table.setModel(DbUtils.resultSetToTableModel(rs));
            srs.close();
            sst.close();
            con.c.close();
        } catch (Exception e) {}

    }

   public ExaminationDetails() {

        setBounds(350, 200, 930, 475);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(79, 133, 1080, 282);
        contentPane.add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
               int row = table.getSelectedRow();
               search.setText(table.getModel().getValueAt(row, 10).toString());
            }
        });
       

        sb1 = new JButton("Result");
        sb1.addActionListener(this);
        sb1.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
        sb1.setForeground(new Color(199, 21, 133));
        sb1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        sb1.setBounds(564, 89, 138, 33);
        contentPane.add(sb1);

       
        JLabel sl1 = new JLabel("Check Result");
        sl1.setForeground(new Color(107, 142, 35));
        sl1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        sl1.setBounds(300, 15, 400, 47);
        contentPane.add(sl1);

       
        search = new JTextField();
        search.setBackground(new Color(255, 240, 245));
        search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(189, 89, 357, 33);
        contentPane.add(search);
        search.setColumns(10);

        JLabel sl3 = new JLabel("Back");
        sl3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
        sl3.setForeground(Color.GRAY);
        sl3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        sl3.setBounds(97, 89, 72, 33);
        contentPane.add(sl3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Book-Details",
        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(67, 54, 1100, 368);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        Book();
        setSize(1200,500);
    }
   
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == sb1){            
                new Marks(search.getText()).setVisible(true);
                this.setVisible(false);
            };
        }
        catch(Exception e){}
    }

    public static void main(String[] args){
        new ExaminationDetails().setVisible(true);
    }
}