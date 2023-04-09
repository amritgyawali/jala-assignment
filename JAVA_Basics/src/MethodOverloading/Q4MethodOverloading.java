package MethodOverloading;

//4. Write two methods with the same name and same number of parameters of different
//type and call from main method

public class Q4MethodOverloading {
    public static void main(String[] args) {
        String city = "Aurangabad";
        printCity(city,1);
        printCity(city,"India");
    }

    private static void printCity(String city, int rank) {
        System.out.println(city);
    }

    private static void printCity(String city, String Country) {
        System.out.println(city);
    }
}
