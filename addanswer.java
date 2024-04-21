import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class addanswer extends JFrame implements ActionListener {
    JPanel Panel;
    JButton addButton;
    JLabel header1;
    JLabel em;
    JLabel ansJLabel;
    JTextField emField;
    JTextField jTextField;
    public static void main(String[] args) {
        new addanswer();
    }
    addanswer(){
        this.setSize(500,500);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("help desk");
        this.setLayout(null);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        Panel =new JPanel();
        Panel.setSize(500,500);
        Panel.setBounds(0,0,500,500);
        Panel.setLayout(null);

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
        em=new JLabel("Email Id:");
        em.setSize(350,40);
        em.setBounds(25,100,350,40);

        
        emField=new JTextField();
        emField.setSize(350,50);
        emField.setBounds(25,150,350,35);


        ansJLabel=new JLabel("Add Answer");
        ansJLabel.setBounds(25,200,350,40);

        jTextField =new JTextField();
        jTextField.setSize(350,50);
        jTextField.setBounds(25,250,350,50);

        addButton=new JButton("Add");
        addButton.setBounds(25,300,100,40);
        addButton.setFocusable(false);
        addButton.addActionListener(this);;

        Panel.add(jTextField);
        Panel.add(ansJLabel);
        Panel.add(em);
        Panel.add(emField);
        Panel.add(header1);
        Panel.add(addButton);
        this.add(Panel);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()==addButton) {
        Answerfunction();
        this.dispose();
       }
    }
    void Answerfunction(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/helpdesk";
        String user="root";
        String Password="Samarenter@12";
        Connection con=DriverManager.getConnection(url, user, Password);

        String query = "update user set answer=? where Emailid=? ;";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1,jTextField.getText());
        st.setString(2,emField.getText());

        st.executeUpdate();

        JOptionPane.showMessageDialog(null, "DONE", "DONE",JOptionPane.OK_OPTION);
        con.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e, "error",JOptionPane.OK_OPTION);
        }
    }
}
