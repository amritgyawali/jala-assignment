package Strings;
import java.util.*;
//9. Trimming strings with trim()
//10. Replacing characters in strings with replace()
//11. Splitting strings with split()
public class TrimString {
    public static void main(String[] args) {
        String str = " JALA Academy ";
        str = str.trim();
        System.out.println("Trimmed the string : "+ str);
        str = str.replace('L','V');
        System.out.print("Replaced L with V: "+str);
        String arr[] = str.split("\\s+");
        System.out.println("\nsplited the string by space :"+Arrays.toString(arr));
    }

}
