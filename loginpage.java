import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class loginpage extends JFrame implements ActionListener{
    JLabel hLabel;
    JPanel loginPanel;
    JButton admiButton;
    JButton userButton;
    public static void main(String[] args) {
        new loginpage();
    }
    loginpage(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("help desk");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        loginPanel =new JPanel();
        loginPanel.setSize(500,500);
        loginPanel.setBounds(0,0,500,500);
        loginPanel.setLayout(null);



        hLabel=new JLabel("Help Desk");
        hLabel.setSize(500,50);
        hLabel.setBounds(0,0,500,50);
        hLabel.setHorizontalAlignment(JLabel.CENTER);
        hLabel.setBackground(new Color(0x456789));
        hLabel.setOpaque(true);
        hLabel.setForeground(Color.WHITE);
        hLabel.setFont(new Font("ROBOTO",Font.BOLD,20));
        hLabel.setBorder(BorderFactory.createLineBorder(Color.black));

        admiButton=new JButton("Admin ");
        userButton =new JButton("User");

        admiButton.setSize(100,40);
        admiButton.setBounds(200,200,100,40);
        userButton.setSize(100,40);
        userButton.setBounds(200,250,100,40);
        admiButton.setFocusable(false);
        userButton.setFocusable(false);
        admiButton.addActionListener(this);
        userButton.addActionListener(this);




        loginPanel.add(userButton);
        loginPanel.add(admiButton);
        loginPanel.add(hLabel);
        this.add(loginPanel);
        this.setVisible(true);
     
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==admiButton) {
            new adminlogin();
        }
        if (e.getSource()==userButton) {
         new userinterface();
        }
    }
}
