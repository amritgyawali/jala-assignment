package Strings;

//7. Comparing strings using the methods equals()
//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
public class StringEquals {
    public static void main(String[] args) {
        String s1 = "JALA";
        String s2 = "Academy";
        String str = new String("Jala Academy");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(str.startsWith("Jala"));
        System.out.println(str.endsWith("Academy"));
        System.out.println(s1.compareTo(s2));
    }
}
