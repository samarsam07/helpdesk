import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener{
    JLabel h1Label;
    JPanel adloginPanel;
    JButton seeButton;
    JButton getans;
    public static void main(String[] args) {
        new admin();
    }


    admin(){
        this.setSize(500,500);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("help desk");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        adloginPanel =new JPanel();
        adloginPanel.setSize(500,500);
        adloginPanel.setBounds(0,0,500,500);
        adloginPanel.setLayout(null);



        h1Label=new JLabel("Help Desk");
        h1Label.setSize(500,50);
        h1Label.setBounds(0,0,500,50);
        h1Label.setHorizontalAlignment(JLabel.CENTER);
        h1Label.setBackground(new Color(0x456789));
        h1Label.setOpaque(true);
        h1Label.setForeground(Color.WHITE);
        h1Label.setFont(new Font("ROBOTO",Font.BOLD,20));
        h1Label.setBorder(BorderFactory.createLineBorder(Color.black));

        seeButton=new JButton("see  Question");
        getans =new JButton("post answer");

        seeButton.setSize(250,40);
        seeButton.setBounds(125,200,250,40);
        getans.setSize(250,40);
        getans.setBounds(125,250,250,40);
        seeButton.setFocusable(false);
        getans.setFocusable(false);
        seeButton.addActionListener(this);
        getans.addActionListener(this);




        adloginPanel.add(getans);
        adloginPanel.add(seeButton);
        adloginPanel.add(h1Label);
        this.add(adloginPanel);
        this.setVisible(true);



    }



    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==getans) {
        new addanswer();
       }
       if (e.getSource()==seeButton) {
        new seequestion();
       }
    }
}
