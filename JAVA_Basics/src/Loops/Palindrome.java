package Loops;

// 10. Write a program to palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pallindromeOrNot(num);
    }

    private static void pallindromeOrNot(int num) {
        int n = num;
        int rem = 0;
        do{
            int mod = num % 10;
            rem = (rem*10) + mod;
            num = num / 10;
        }while(num != 0);
        System.out.println(rem == n ? "Pallindrome" : "Not Pallindrome");
    }
}
