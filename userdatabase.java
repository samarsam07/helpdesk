import java.sql.*;
import javax.swing.*;
public class userdatabase {
    // JOptionPane option;
    userdatabase(String name,String email,String question){
        try
        {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/helpdesk";
        String user="root";
        String Password="Samarenter@12";
        Connection con=DriverManager.getConnection(url, user, Password);

        String query = "insert into user values(?,?,?,?)";
        PreparedStatement pdst = con.prepareStatement(query);

        pdst.setString(1, name);
        pdst.setString(2, email);
        pdst.setString(3, question);
        pdst.setString(4, "");
    


        //Statement stmt = con.createStatement();
        pdst.executeUpdate();
        // option=new JOptionPane();
        JOptionPane.showConfirmDialog(null, "Done","?", JOptionPane.OK_OPTION);
        // option.showMessageDialog(null,"Done","helpdesk",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        // System.out.println("done");
        con.close();
        

        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error","", JOptionPane.OK_OPTION);
        }
    }
}


