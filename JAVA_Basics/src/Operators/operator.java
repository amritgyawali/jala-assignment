package Operators;

public class operator {
    public static void main(String[] args) {
        int num1 = 4, num2 = 3;
        boolean flag1 = true, flag2 = false;
        arthOperator(num1,num2);
        incrementDecrement(num1,num2);
        equalNotEqual(num1,num2);
        logicalAND_OR_NOT(flag1,flag2);
    }

    //1. Write a function for arithmetic operators(+,-,*,/)
    public static void arthOperator(int num1, int num2){
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }

    //2. Write a method for increment and decrement operators(++, --)
    public static void incrementDecrement(int num1, int num2){
        System.out.println(num1++);
        System.out.println(num2--);
    }

    //3. Program to equal operator and not equal operators
    //4. Write a program to find the two numbers equal or not
    public static void equalNotEqual(int num1, int num2){
        System.out.println(num1 == num2);
    }

    //5. Programs on Logical AND,OR operator and Logical NOT
    public static boolean logicalAND_OR_NOT(boolean num1, boolean num2){
        if(num1 && num2){
            return true;
        }
        if(num1 || num2){
            return true;
        }
        if(num1 != num2){
            return false;
        }
        return true;
    }
}
