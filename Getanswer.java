import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Getanswer extends JFrame implements ActionListener {
JTextField emailfField;
JButton submit;
JPanel panelJPanel;
JLabel ansJLabel;
JLabel label1;
JLabel header;
JTextArea jt;
public static void main(String[] args) {
    new Getanswer();
}
Getanswer(){
    this.setSize(500,500);
    // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setResizable(false);
    this.setTitle("HELP DESK");
    this.getContentPane().setBackground(Color.BLACK);
    this.setLocationRelativeTo(null);
    
    panelJPanel=new JPanel();
    panelJPanel.setPreferredSize(new Dimension(500,500));
    panelJPanel.setBounds(0,0,500,500);
    panelJPanel.setBackground(Color.WHITE);
    panelJPanel.setOpaque(true);
    panelJPanel.setLayout(null);

    header=new JLabel();
    header.setSize(500,50);
    header.setBounds(0,0,500,50);
    header.setText("HELP DESK");
    header.setBackground(new Color(0x345678));
    header.setOpaque(true);
    header.setForeground(Color.WHITE);
    header.setFont(new Font("ROBOTO",Font.BOLD,20));
    header.setBorder(BorderFactory.createLineBorder(Color.black));
    header.setHorizontalAlignment(JLabel.CENTER);


    label1=new JLabel();
    label1.setText("Enter Email ID");
    label1.setSize(350,35);
    label1.setBounds(25,125,350,35);
    
    
    emailfField=new JTextField();
    emailfField.setSize(350,50);
    emailfField.setBounds(25,150,350,35);

    submit=new JButton("Submit");
    submit.setSize(100,35);
    submit.setBounds(375,150,100,35);
    submit.setFocusable(false);
    submit.addActionListener(this);

    jt=new JTextArea();
    jt.setSize(400,400);
    jt.setBounds(25,250,400,200);
    jt.setBorder(BorderFactory.createLineBorder(Color.black));
    jt.setFont(new Font("ROBOTO",Font.PLAIN,15));
    jt.setLineWrap(true);
    this.add(jt);
    

    ansJLabel=new JLabel();
    ansJLabel.setSize(400,200);
    ansJLabel.setVerticalAlignment(JLabel.TOP);
    // ansJLabel.setOpaque(true);
    // ansJLabel.add(jt);
    panelJPanel.add(label1);
    panelJPanel.add(ansJLabel);
    panelJPanel.add(emailfField);
    panelJPanel.add(submit);
    panelJPanel.add(header);
    this.add(panelJPanel);
    this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource()==submit) {
        String temp=getanswer();
        if (temp=="") {
            JOptionPane.showMessageDialog(null, "invalid");
        }
        jt.setText("Answer   :"+temp);

    }
}
String getanswer(){
    String ans=answer();
    return ans;  
}
String answer(){
    String value="";
    String emString=emailfField.getText();
    try {
            
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/helpdesk";
        String user="root";
        String Password="Samarenter@12";
        Connection con=DriverManager.getConnection(url, user, Password);

        String query = "select answer from user where Emailid='"+emString+"';";
        Statement st = con.createStatement();
        ResultSet set=st.executeQuery(query);
        while(set.next()){
         value=set.getString("answer");
        }
        con.close();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e,"", JOptionPane.PLAIN_MESSAGE);
    }
    return value;
}
}
