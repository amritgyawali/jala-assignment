package Loops;

//9. Write a program to find the prime or not

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(primeOrNot(num));
    }

    private static Boolean primeOrNot(int num) {
        int count=2;
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
