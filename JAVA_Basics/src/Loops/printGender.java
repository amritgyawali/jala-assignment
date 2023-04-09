package Loops;

//12. Print gender (Male/Female) program according to given M/F using switch

import java.util.Scanner;

public class printGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gender");
        String str = sc.nextLine();
        str = str.toUpperCase();
        switch (str.charAt(0)){
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
            default:
                System.out.println("Error");
        }
    }
}
