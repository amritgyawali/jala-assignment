package Loops;
//8. Write a program to find Armstrong number or not
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int pow = power(num);
        int sum = 0;
        do {
            int rem = num % 10;
            sum += calculatePower(rem, pow);
            num = num / 10;
        }while(num != 0);
        System.out.println(sum == temp ? "Armstrong" : "Not Armstrong");
    }
    public static int calculatePower(int num, int pow){
        int n = num;
        while(pow > 1){
            num *= n;
            pow--;
        }
        return num;
    }

    public static int power(int num){
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }
}
