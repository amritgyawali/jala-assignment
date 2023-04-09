package Operators;

//6. Program for relational operators (<,<==, >, >==)
//7. Print the smaller and larger number

public class Relational {
    public static void main(String[] args) {
        int num1 = 4, num2 = 3;
        relational(num1,num2);
    }
    public static void relational(int num1, int num2){
        if(num1 < num2){
            System.out.println(num2+" is greater");
            System.out.println(num1+" is smaller");
        } else if(num1 > num2){
            System.out.println(num1+" is greater");
            System.out.println(num2+" is smaller");
        } else if (num1 <= num2 || num1 >= num2) {
            System.out.println(num1+" and "+num2+" are equal");
        }else{
            System.out.println("Exception");
        }

    }
}
