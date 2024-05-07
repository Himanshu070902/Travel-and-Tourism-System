package travelmanagementsytem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnecton {

    Connection con=null;
    Statement s;
   DbConnecton() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully");
             con= DriverManager.getConnection("jdbc:mysql:///travelsystem","root","Himanshu@143");
             System.out.println("Connection succesfully added");
            s= con.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
   public static void main(String args[]) {
	   System.out.println("hello");
	   
   }
}