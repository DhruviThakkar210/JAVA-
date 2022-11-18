package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;


public class Login {

    static Connection con;
  static PreparedStatement ps;
    static ResultSet rs;

    static void createConnection() throws ClassNotFoundException, SQLException {
     Class.forName("com.mysql.cj.jdbc.Driver");
     //System.out.println("drivers loaded ");
      //step 2
  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");

    }
    void login() throws SQLException,ClassNotFoundException
    {
      Scanner sc = new Scanner(System.in);
      Login a = new Login();
        System.out.println("ENTER THE USERNAME");
      String name = sc.next();
        System.out.println("ENTER THE PASS");
      String pass = sc.next();
        createConnection();
      String query = "SELECT *from login where name=? and  pass=?  "; 
      ps = con.prepareStatement(query);
         ps.setString(1, name);
        ps.setString(2, pass);
       
       rs=ps.executeQuery();
       if(rs.next())
       {
           System.out.println("login successful");
           
           
       }
       else 
            System.out.println("invalid ");
        
    }
    void insertRecord() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ,username,password,emailid and mno");
       
   
          
        String username = sc.nextLine();
        String pass = sc.nextLine();
        String email = sc.nextLine();
        String mno = sc.nextLine();
        createConnection();
        String query = "insert into login(name,pass,email,mno)values(?,?,?,?)";
        ps = con.prepareStatement(query);
        //step 4 execute query 
          
        ps.setString(1, username);
        ps.setString(2, pass);
        ps.setString(3, email);
        ps.setString(4, mno);
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println(i + "SIGN UP SUCCESSFUL");
        } else {
            System.out.println("PLEASE ENTER VALID DETAILS ");
        }
    }
    
    

    public static void main(String[] args) throws ClassNotFoundException {
         Login obj=new Login();
        Scanner sc=new Scanner(System.in);
          try {
            while (true) {
                System.out.println("1.login all\n2.signup \n3.exit\n");
                System.out.println("enter your choice ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                       obj.login();
                        break;
                    case 2:
                        obj.insertRecord();
                        break;
                   
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("wrong choice ");
                }

            }
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }
}
