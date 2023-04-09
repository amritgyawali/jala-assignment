package Java_Basics;

//6. Write a function to print your name and call the function from main method

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        printName();
    }
    public static void printName(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
