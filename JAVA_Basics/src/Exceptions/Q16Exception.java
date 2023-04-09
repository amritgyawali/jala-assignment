package Exceptions;

//16. Write a program to generate NumberFormatException
//17. Write a program to generate StringIndexOutOfBoundsException
public class Q16Exception {
    public static void main(String[] args) {
        String str = "abc123";
        int num = Integer.parseInt(str);
        System.out.println("Parsed number: " + num);
        System.out.println(str.charAt(6));
    }

}
