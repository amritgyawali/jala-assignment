package MethodOverloading;

//1. Write two methods with the same name but different number of parameters of same type
//and call the methods from main method

//2. Write two methods with the same name but different number of parameters of different
//data type and call the methods from main method

public class Q1MethodOverloading {
    public static void main(String[] args) {
        String name = "JALA Academy";
        printName();
        printName(name);
        printName(23);
    }
    public static void printName(){
        System.out.println("Roshan");
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void printName(int age){
        System.out.println(age);
    }
}
