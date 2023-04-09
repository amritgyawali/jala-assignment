package Strings;

//      1. Different ways creating a string
//      2. Concatenating two strings using + operator
public class CreateStrings {

    public static void main(String[] args) {
        createStrings();
        System.out.println(concatenate("JALA","Academy"));
    }

    public static void createStrings() {
        String s1 = "JALA Academy";
        String s2 = new String("JALA Academy");
    }

    public static String concatenate(String s1, String s2){
        return s1 + s2;
    }
}


