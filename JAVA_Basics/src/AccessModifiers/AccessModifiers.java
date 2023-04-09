package AccessModifiers;

//1. Create a class with PRIVATE fields, private method and a main method. Print the fields
//in main method. Call the private method in main method

public class AccessModifiers {

    private static int num = 123;

    private static String printName(String str){
            return "Hi "+str;
    }

    public static void main(String[] args) {
        System.out.println(num);
        System.out.println(printName("Roshan"));
    }
}
