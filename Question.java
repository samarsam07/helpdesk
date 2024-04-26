import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question extends JFrame  implements ActionListener{
    JPanel panel1;
    JLabel header;
    JLabel namelabel;
    JLabel usertypelabel;
    JLabel passLabel;
    JLabel ticketLabel;
    JTextField name;
    JTextField emailiField;
    JTextField questioField;

    JButton Ticketraised;
    JButton clear;
    public static void main(String[] args) {
        new Question();
    }

    Question(){
        this.setSize(500,500);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("HELP DESK");
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);

        panel1=new JPanel();
        panel1.setPreferredSize(new Dimension(500,500));
        panel1.setBounds(0,0,500,500);
        panel1.setBackground(Color.WHITE);
        panel1.setOpaque(true);
        panel1.setLayout(null);

        header=new JLabel();
        header.setPreferredSize(new Dimension(500,75));
        header.setText("HELP DESK MANAGEMENT SYSTEM");
        // header.setVerticalAlignment(JLabel.TOP);
        header.setHorizontalAlignment(JLabel.CENTER);
        header.setForeground(Color.white);
        header.setBackground(Color.GRAY);
        header.setOpaque(true);
        header.setFont(new Font("ROBOTO",Font.BOLD,20));
        header.setBorder(BorderFactory.createLineBorder(Color.black));
        header.setBounds(0,0,500,50);
        header.setHorizontalTextPosition(JLabel.CENTER);
        panel1.add(header);


        name=new JTextField();
        emailiField=new JTextField();
        questioField=new JTextField();
        Ticketraised=new JButton("Raise Ticket");
    
        name.setSize(350,50);
        name.setBounds(50,100,350,35);
      
      
        emailiField.setSize(350,50);
        emailiField.setBounds(50,175,350,35);
      
      
        questioField.setSize(350,50);
        questioField.setBounds(50,250,350,35);
      
      
      
      
        Ticketraised.setSize(100,50);
        Ticketraised.setBounds(350,375,100,50);
        Ticketraised.setFocusable(false);
        Ticketraised.addActionListener(this);
        Ticketraised.setBorder(BorderFactory.createLineBorder(Color.black));
      
      
      
        clear=new JButton("Clear");
        clear.setSize(100,50);
        clear.setBounds(50,375,100,50);
        clear.setFocusable(false);
        clear.addActionListener(this);
        clear.setBorder(BorderFactory.createLineBorder(Color.black));
      
      
      
        namelabel=new JLabel();
        namelabel.setSize(350,25);
        namelabel.setText("Name");
        namelabel.setVerticalAlignment(JLabel.TOP);
        namelabel.setFont(new Font("ROBOTO",Font.BOLD,15));
        namelabel.setBounds(50,75,350,25);
   
        
        usertypelabel=new JLabel();
        usertypelabel.setSize(350,25);
        usertypelabel.setText("Email ID");
        usertypelabel.setBounds(50,150,350,25);
        usertypelabel.setVerticalAlignment(JLabel.TOP);
        usertypelabel.setFont(new Font("ROBOTO",Font.BOLD,15));

        passLabel=new JLabel();
        passLabel.setText("Enter your Question");
        passLabel.setSize(350,25);
        passLabel.setBounds(50,225,350,25);
        passLabel.setVerticalAlignment(JLabel.TOP);
        passLabel.setFont(new Font("ROBOTO",Font.BOLD,15));

        panel1.add(passLabel);
        panel1.add(usertypelabel);
        panel1.add(namelabel);
        panel1.add(clear);
        panel1.add(Ticketraised);
        panel1.add(name);
        panel1.add(emailiField);
        panel1.add(questioField);
        this.add(panel1);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==Ticketraised) {
        new userdatabase(name.getText(),emailiField.getText(), questioField.getText());
        // this.dispose();
       }
       if (e.getSource()==clear) {
        System.out.println("clearing");
        name.setText("");
        emailiField.setText("");
        questioField.setText("");
       }
    }
}