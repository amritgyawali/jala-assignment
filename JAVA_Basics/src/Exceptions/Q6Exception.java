package Exceptions;

//6. Write a program to create your own exception

public class Q6Exception extends Exception{
    public Q6Exception(String messege){
        super(messege);
    }

    public static void main(String[] args) throws Q6Exception {
        printNumber(3);
    }

    private static void printNumber(int i) throws Q6Exception {
        throw new Q6Exception(i+" is invalid");
    }
}
