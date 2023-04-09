package Loops;

//13. Program for multiple if else statement(Largest number in 10,20 and 30)

public class LargestAmongThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if(a > b && a > c){
            System.out.println(a);
        }else if(b > c && b > a){
            System.out.println(b);
        }else{
            System.out.println(c);
        }

    }
}
