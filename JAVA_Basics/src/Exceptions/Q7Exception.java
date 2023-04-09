package Exceptions;
//7. Write a program with finally block
public class Q7Exception {
    public static void main(String[] args) {
        try{
            System.out.println(5/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("All is Good");
        }
    }
}
