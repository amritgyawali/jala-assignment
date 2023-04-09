package Strings;

//4. Extract a string using Substring
//5. Searching in strings using indexOf()
//6. Matching a String Against a Regular Expression With matches()

public class ExtractString {
    public static void main(String[] args) {
        String str = "JALA Academy";
        System.out.println(str.substring(5));
        System.out.println(str.indexOf("Academy"));
        System.out.println(str.matches("(.*)JALA(.*)"));
    }
}
