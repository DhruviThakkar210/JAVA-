package javaapplication1;

import java.sql.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackout?", "root", "");
            //System.out.println("connection found ");
            Statement st=con.createStatement();
            String sql = "SELECT * from userdetails";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+" "+rs.getString(3));
            }
          
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("error " + ex);

        }

    }
}
