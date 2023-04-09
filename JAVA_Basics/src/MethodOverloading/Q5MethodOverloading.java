package MethodOverloading;

//5. Write two methods with the same name, number of parameters and data type but
//different return Type

public class Q5MethodOverloading {
    public static void main(String[] args) {
        printNumber(123);
    }

    private static int printNumber(int i) {
        return i;
    }

//    In method overloding we cannot create same name and same parameter, we have to make something different
//    private static String printNumber(int i) {
//        return Integer.toString(i);
//    }
}
