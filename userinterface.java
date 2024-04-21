import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userinterface extends JFrame implements ActionListener{
    JLabel h1Label;
    JPanel userloginPanel;
    JButton post;
    JButton getques;
    public static void main(String[] args) {
        new userinterface();
    }
    userinterface(){
        this.setSize(500,500);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("help desk");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        userloginPanel =new JPanel();
        userloginPanel.setSize(500,500);
        userloginPanel.setBounds(0,0,500,500);
        userloginPanel.setLayout(null);



        h1Label=new JLabel("Help Desk");
        h1Label.setSize(500,50);
        h1Label.setBounds(0,0,500,50);
        h1Label.setHorizontalAlignment(JLabel.CENTER);
        h1Label.setBackground(new Color(0x456789));
        h1Label.setOpaque(true);
        h1Label.setForeground(Color.WHITE);
        h1Label.setFont(new Font("ROBOTO",Font.BOLD,20));
        h1Label.setBorder(BorderFactory.createLineBorder(Color.black));

        post=new JButton("post your Question");
        getques =new JButton("Get your answer");

        post.setSize(250,40);
        post.setBounds(125,200,250,40);
        getques.setSize(250,40);
        getques.setBounds(125,250,250,40);
        post.setFocusable(false);
        getques.setFocusable(false);
        post.addActionListener(this);
        getques.addActionListener(this);




        userloginPanel.add(getques);
        userloginPanel.add(post);
        userloginPanel.add(h1Label);
        this.add(userloginPanel);
        this.setVisible(true);
     
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==post) {
            new Question();
        
        }
        if (e.getSource()==getques) {
            new Getanswer();
           
        }
    }   
}
