package Loops;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        oddOrEven(num);
        System.out.println(largeAmongThree(3,4,2));
    }

    //4. Write a program to print the odd and even numbers.
    public static void oddOrEven(int num){
        if (num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

    public static int largeAmongThree(int num1, int num2, int num3){
        if(num1 > num2){
            return Math.max(num1,num3);
        }else if(num2 > num1){
            return Math.max(num2,num3);
        }else{
            return Math.max(num1,num2);
        }

    }
}
