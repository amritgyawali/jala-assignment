package Exceptions;

//10. Write a program to generate ClassNotFoundException

public class Q10Exception {
    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

    public static void main(String[]  args) throws Exception{
        System.out.println("Trying to load MySQL JDBC driver");
        Class.forName(DRIVER_CLASS);
    }
}
