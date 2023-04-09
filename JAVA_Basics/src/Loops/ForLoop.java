package Loops;
//1. Write a program to print “Bright IT Career” ten times using for loop
public class ForLoop {
    public static void main(String[] args) {
        printName();
        printNumber();
        equalOrNot(2,3);
    }
    public static void printName(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Bright IT Career");
        }
    }

    //2. Write a java program to print 1 to 20 numbers using the while loop.
    public static void printNumber(){
        int num =1;
        while (num<=20){
            System.out.println(num++);
        }
    }

    //3. Program to equal operator and not equal operator
    public static boolean equalOrNot(int num1, int num2){
        if(num1 != num2){
            return false;
        }else{
            return true;
        }
    }
}
