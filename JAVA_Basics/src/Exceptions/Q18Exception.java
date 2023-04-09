package Exceptions;

//18. Write a program to generate SQLException

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q18Exception {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/missing_database", "root", "password");
        } catch(SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
