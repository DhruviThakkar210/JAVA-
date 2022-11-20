package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;

public class Bank {

    static Connection con;
    static PreparedStatement ps;
    static ResultSet rs;

    static void createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java2", "root", "");
    }

    void login() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
        String uname = sc.next();
        System.out.println("please enter your pass");
        String pass = sc.next();
        createConnection();
        String query = "insert into register(id,username,password,emailid)values(?,?,?,?)";
        ps = con.prepareStatement(query);
        //step 4 execute query 
        ps.setString(1, uname);
        ps.setString(2, pass);

        rs = ps.executeQuery();
        if (rs.next()) {
            System.out.println("login successful");

        } else {
            System.out.println("invalid ");
        }

    }



void insertRecord() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter uname,pass,acc and balance ");
        
        String uname = sc.nextLine();
        String pass = sc.nextLine();
        String accno = sc.nextLine();
         int balance = sc.nextInt();
        createConnection();
        String query = "insert into bank(uname,pass,accno,balance)values(?,?,?,?)";
        ps = con.prepareStatement(query);
        //step 4 execute query 
       
        ps.setString(1, uname);
        ps.setString(2, pass);
        ps.setString(3, accno);
        ps.setInt(4, balance);
        
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println(i + "record inserted ");
        } else {
            System.out.println("record not inserted ");
        }
    }
    
    
     void updateRecord() throws SQLException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username ");
        String uname = sc.nextLine();
        System.out.println("enter password ");
        String pass = sc.nextLine();
        System.out.println("enter accno  ");
        String accno = sc.nextLine();
          System.out.println("enter balance  ");
        int balance = sc.nextInt();
        System.out.println("enter id u want to update  ");
        int x = sc.nextInt();
        String query = "update register set uname=?,pass=?,accno=?,balance=? where id=?";
        createConnection();
        ps = con.prepareStatement(query);
        //step 4 execute query
        ps.setString(1, uname);
        ps.setString(2, pass);
        ps.setString(3, accno);
         ps.setInt(4, balance);
        ps.setInt(5, x);
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println(i + "record updated  ");
        } else {
            System.out.println("record not updated  ");
        }
    }
     
      void deleteRecord() throws SQLException, ClassNotFoundException {
        //step 3 
        Scanner sc = new Scanner(System.in);

        System.out.println("enter id u want to delete  ");
        int x = sc.nextInt();
        String query = "delete from register where id=?";

        createConnection();
        ps = con.prepareStatement(query);
        //step 4 execute query

        ps.setInt(1, x);
        int i = ps.executeUpdate();
        if (i > 0) {
            System.out.println(i + "record deleted  ");
        } else {
            System.out.println("record not updated  ");
        }
    }


     public static void main(String[] args) {
        Bank obj=new Bank();
        Scanner sc=new Scanner(System.in);
          try {
            while (true) {
                System.out.println("1.signup\n2.login \n3.Update record\n4.Delete Record\n5.exit\n");
                System.out.println("enter your choice ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        obj.insertRecord();
                        break;
                    case 2:
                        obj.login();
                        break;
                    case 3:
                        obj.updateRecord();
                        break;
                    case 4:
                        obj.deleteRecord();
                        ;
                        break;
                    case 5:
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
