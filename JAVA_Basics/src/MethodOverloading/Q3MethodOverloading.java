package MethodOverloading;

//3. Write two methods with the same name and same number of parameters of same type
//and call from main method

public class Q3MethodOverloading {
    public static void main(String[] args) {
        String city = "Aurangabad";
        printCity(city);
        printCity(city);
    }

    private static void printCity(String city) {
        System.out.println(city);
    }

//    if we create two methods with same number and parameter compiler will throw an error showing duplicate method
//    private static void printCity(String city) {
//        System.out.println(city);
//    }
}
