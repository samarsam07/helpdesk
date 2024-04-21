import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class seequestion extends JFrame {
    JPanel Panel;
    JLabel h1Label;
    JTextArea jTextArea;
    public static void main(String[] args) {
        new seequestion();
    }

    seequestion(){
        this.setSize(500,500);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("help desk");
        this.setLayout(null);
        this.setResizable(false);
        // this.setLocationRelativeTo(null);

        Panel =new JPanel();
        Panel.setSize(500,500);
        Panel.setBounds(0,0,500,500);
        Panel.setLayout(null);



        h1Label=new JLabel("Help Desk");
        h1Label.setSize(500,50);
        h1Label.setBounds(0,0,500,50);
        h1Label.setHorizontalAlignment(JLabel.CENTER);
        h1Label.setBackground(new Color(0x456789));
        h1Label.setOpaque(true);
        h1Label.setForeground(Color.WHITE);
        h1Label.setFont(new Font("ROBOTO",Font.BOLD,20));
        h1Label.setBorder(BorderFactory.createLineBorder(Color.black));
      
        jTextArea=new JTextArea();
        jTextArea.setSize(400,400);
        jTextArea.setBounds(25,75,400,400);
        jTextArea.setBorder(BorderFactory.createLineBorder(Color.black));
        jTextArea.setFont(new Font("ROBOTO",Font.PLAIN,15));
        jTextArea.setLineWrap(true);
        this.add(jTextArea);
        Panel.add(h1Label);
        this.add(Panel);
        this.setVisible(true);
        SeeQuestions();
    }
    void SeeQuestions(){
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          String url="jdbc:mysql://localhost:3306/helpdesk";
          String user="root";
          String Password="Samarenter@12";
          Connection con=DriverManager.getConnection(url, user, Password);
  
          String query = "select Emailid,question from user ;";
          Statement st = con.createStatement();
          ResultSet set=st.executeQuery(query);
          while(set.next()){
            jTextArea.append("Emailid:    " + set.getString("Emailid"));
            jTextArea.append("\n");
            jTextArea.append("Question:   "+ set.getString("question"));
            jTextArea.append("\n");
        }
          con.close();
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e,"", JOptionPane.CLOSED_OPTION);
        }
    }
}
