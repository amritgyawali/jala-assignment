package Exceptions;

//1. Write a program to generate Arithmetic Exception without exception handling
//2. Handle the Arithmetic exception using try-catch block
//3. Write a method which throws exception, Call that method in main class without try block

public class Q1Exception {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }catch (ArithmeticException e){
            System.out.println("Error: "+e);
        }
//        printName("Roshan");
    }
    public static void printName(String name) throws Exception{
        System.out.println(name);
    }
}
