import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
public class helpdeskmain implements MouseListener {
    JFrame frame;
    JPanel panel2;
    JLabel header1;
    JLabel question1;
    JLabel question2;
    JLabel question3;
    JLabel question4;
    JLabel question5;


    helpdeskmain(){
        frame=new JFrame();
        frame.setSize(500,500);
        frame.setTitle("HELP DESK");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        // frame.getContentPane().setBackground(Color.white);

        panel2=new JPanel();
        panel2.setSize(500,500);
        panel2.setBounds(0,0,500,500);
        // panel2.setBackground(new Color(0x123456));
        panel2.setOpaque(true);
        panel2.setLayout(null);
        
        header1=new JLabel();
        header1.setSize(500,50);
        header1.setBounds(0,0,500,50);
        header1.setText("HELP DESK");
        header1.setBackground(new Color(0x345678));
        header1.setOpaque(true);
        header1.setForeground(Color.WHITE);
        header1.setFont(new Font("ROBOTO",Font.BOLD,20));
        header1.setBorder(BorderFactory.createLineBorder(Color.black));
        header1.setHorizontalAlignment(JLabel.CENTER);

        question1=new JLabel();
        question1.setSize(350,50);
        question1.setText("");
        question1.setBounds(25,100,350,40);
        question1.setFont(new Font("ROBOTO",Font.BOLD,15));
        question1.setBorder(BorderFactory.createLineBorder(Color.black));
        question1.addMouseListener(this);

        question2=new JLabel();
        question2.setSize(350,50);
        question2.setText("Question 2");
        question2.setBounds(25,150,350,40);
        question2.setFont(new Font("ROBOTO",Font.BOLD,15));
        question2.setBorder(BorderFactory.createLineBorder(Color.black));
        question2.addMouseListener(this);

        question3=new JLabel();
        question3.setSize(350,50);
        question3.setText("Question 3");
        question3.setBounds(25,200,350,40);
        question3.setFont(new Font("ROBOTO",Font.BOLD,15));
        question3.setBorder(BorderFactory.createLineBorder(Color.black));
        question3.addMouseListener(this);

        question4=new JLabel();
        question4.setSize(350,50);
        question4.setText("Question 4");
        question4.setBounds(25,250,350,40);
        question4.setFont(new Font("ROBOTO",Font.BOLD,15));
        question4.setBorder(BorderFactory.createLineBorder(Color.black));
        question4.addMouseListener(this);

        question5=new JLabel();
        question5.setSize(350,50);
        question5.setText("Question 5");
        question5.setBounds(25,300,350,40);
        question5.setFont(new Font("ROBOTO",Font.BOLD,15));
        question5.setBorder(BorderFactory.createLineBorder(Color.black));
        question5.addMouseListener(this);

      
        panel2.add(question1);
        panel2.add(question2);
        panel2.add(question3);
        panel2.add(question4);
        panel2.add(question5);
        panel2.add(header1);
        frame.add(panel2);
        frame.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==question1) {
            System.out.println("question 1");
        }
        if (e.getSource()==question2) {
            System.out.println("question 2");
        }
        if (e.getSource()==question3) {
            System.out.println("question 3");
        }
        if (e.getSource()==question4) {
            System.out.println("question 4");
        }
        if (e.getSource()==question5) {
            System.out.println("question 5");
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {
       
    }


    @Override
    public void mouseReleased(MouseEvent e) {
       
    }


    @Override
    public void mouseEntered(MouseEvent e) {
    
    }


    @Override
    public void mouseExited(MouseEvent e) {
      
    }
}
