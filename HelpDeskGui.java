import javax.swing.*;
import java.awt.*;

public class HelpDeskGui extends JFrame{
    JPanel panel1;
    JLabel header;
    JLabel namelabel;
    JLabel usertypelabel;
    JLabel passLabel;
    JLabel ticketLabel;
    JTextField name;
    JTextField usertype;
    JTextField password;
    JTextField ticket;
    JButton submit;
    JButton clear;

    HelpDeskGui(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);

        panel1=new JPanel();
        panel1.setPreferredSize(new Dimension(500,500));
        panel1.setBounds(0,0,500,500);
        panel1.setBackground(Color.WHITE);
        panel1.setLayout(null);

        header=new JLabel();
        header.setPreferredSize(new Dimension(500,75));
        header.setText("HELP DESK MANAGEMENT SYSTEM");
        // header.setVerticalAlignment(JLabel.TOP);
        header.setHorizontalAlignment(JLabel.CENTER);
        header.setBackground(Color.GRAY);
        header.setOpaque(true);
        header.setFont(new Font("ROBOTO",Font.BOLD,20));
        header.setBounds(0,0,500,50);
        header.setHorizontalTextPosition(JLabel.CENTER);
        panel1.add(header);


        name=new JTextField();
        usertype=new JTextField();
        password=new JTextField();
        ticket=new JTextField();
        submit=new JButton("Submit");
    
        name.setSize(350,50);
        name.setBounds(50,100,350,35);
      
      
        usertype.setSize(350,50);
        usertype.setBounds(50,175,350,35);
      
      
        password.setSize(350,50);
        password.setBounds(50,250,350,35);
      
      
        ticket.setSize(350,50);
        ticket.setBounds(50,325,350,35);
      
      
      
        submit.setSize(100,50);
        submit.setBounds(350,375,100,50);
      
      
      
        clear=new JButton("Clear");
        clear.setSize(100,50);
        clear.setBounds(50,375,100,50);
      
      
      
        namelabel=new JLabel();
        namelabel.setSize(350,100);
        namelabel.setText("NAME");
        namelabel.setVerticalAlignment(JLabel.TOP);
        namelabel.setFont(new Font("ROBOTO",Font.PLAIN,15));
        namelabel.setLayout(null);
        namelabel.setBounds(50,70,350,25);
   
        
        usertypelabel=new JLabel();

        panel1.add(namelabel);
        panel1.add(clear);
        panel1.add(submit);
        panel1.add(name);
        panel1.add(usertype);
        panel1.add(password);
        panel1.add(ticket);
        this.add(panel1);
        this.setVisible(true);
    }
}