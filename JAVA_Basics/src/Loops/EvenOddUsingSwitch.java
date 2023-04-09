package Loops;

//11. Program to check whether a number is EVEN or ODD using switch

import java.util.Scanner;

public class EvenOddUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num % 2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("Error");
        }
    }
}
