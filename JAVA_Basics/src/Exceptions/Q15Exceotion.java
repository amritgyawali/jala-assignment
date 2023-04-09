package Exceptions;

//15. Write a program to generate NullPointerException

public class Q15Exceotion {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
