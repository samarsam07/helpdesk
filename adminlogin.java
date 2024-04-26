import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class adminlogin extends JFrame implements ActionListener {
JPanel admiPanel2;
JLabel h2Label;    
JTextField adminname;
JPasswordField passField;
JButton login;
JLabel namelabel;
JLabel passJLabel;
protected char[] passString;
    public static void main(String[] args) {
        new adminlogin();
    }

    adminlogin(){
        this.setSize(500,500);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("HELP DESK");
        this.getContentPane().setBackground(Color.BLACK);
        this.setLocationRelativeTo(null);

        admiPanel2=new JPanel();
        admiPanel2.setPreferredSize(new Dimension(500,500));
        admiPanel2.setBounds(0,0,500,500);
        admiPanel2.setBackground(Color.WHITE);
        admiPanel2.setOpaque(true);
        admiPanel2.setLayout(null);

        h2Label=new JLabel();
        h2Label=new JLabel("Help Desk");
        h2Label.setSize(500,50);
        h2Label.setBounds(0,0,500,50);
        h2Label.setHorizontalAlignment(JLabel.CENTER);
        h2Label.setBackground(new Color(0x456789));
        h2Label.setOpaque(true);
        h2Label.setForeground(Color.WHITE);
        h2Label.setFont(new Font("ROBOTO",Font.BOLD,20));
        h2Label.setBorder(BorderFactory.createLineBorder(Color.black));

        passField=new JPasswordField();
        adminname=new JTextField();
        login=new JButton("Login");

        adminname.setSize(350,50);
        adminname.setBounds(50,100,350,35);

        passField.setSize(350,50);
        passField.setBounds(50,200,350,35);
        
        login.setSize(100,50);
        login.setBounds(175,300,100,50);
        login.setFocusable(false);
        login.addActionListener(this);

        namelabel=new JLabel();
        namelabel.setSize(350,25);
        namelabel.setText("Name");
        namelabel.setVerticalAlignment(JLabel.TOP);
        namelabel.setFont(new Font("ROBOTO",Font.BOLD,15));
        namelabel.setBounds(50,75,350,25);

        passJLabel=new JLabel();
        passJLabel.setSize(350,25);
        passJLabel.setText("Name");
        passJLabel.setVerticalAlignment(JLabel.TOP);
        passJLabel.setFont(new Font("ROBOTO",Font.BOLD,15));
        passJLabel.setBounds(50,75,350,25);



        admiPanel2.add(namelabel);
        admiPanel2.add(adminname);
        admiPanel2.add(passJLabel);
        admiPanel2.add(passField);
        admiPanel2.add(login);
        admiPanel2.add(h2Label);
        this.add(admiPanel2);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       passString=passField.getPassword();
       if (e.getSource()==login) {
        if (checkpassword()) {
           System.out.println("correct");
           new admin();
        }
        else{
            System.out.println("wrong");
        }
       }
    }
    boolean checkpassword(){
        String pass=getpassword();
        char[] Pass=pass.toCharArray();
        try{
        for (int i=0;i<Pass.length;i++) {
            if(Pass[i]!=passString[i]){
                return false;
                
            }
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, "invalid input","error",JOptionPane.PLAIN_MESSAGE );
        return false;
    }
        return true;
    }


    String getpassword(){
        String n=adminname.getText();
        String pass="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/helpdesk";
            String user="root";
            String Password="Samarenter@12";
            Connection con=DriverManager.getConnection(url, user, Password);
    
            String query = "select password from admin where name='"+n+"';";
            Statement st = con.createStatement();
            ResultSet set=st.executeQuery(query);
            while(set.next()){
                pass=set.getString("password");
            }

        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e, "error", JOptionPane.CANCEL_OPTION);
        }
        return pass;
    }
}
