package Loops;
//6. Write a program to print even number between 10 and 100 using while
public class EvenBetweenRange {
    public static void main(String[] args) {
        int num = 10;
        while(num <= 100){
            if(num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
