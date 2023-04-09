package Exceptions;

//4. Write a program with multiple catch blocks
//5. Write a program to throw exception with your own message

public class Q4Exceptions {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        try{
            System.out.println(arr[4]);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }

        if(arr.length > 3){
            throw new ArrayIndexOutOfBoundsException("Arrays length is "+arr.length);
        }else{
            System.out.println("Good to go");
        }
    }
    public static void getMovie() throws Q6Exception{
        throw new Q6Exception("Movie is Illogical");
    }
}
