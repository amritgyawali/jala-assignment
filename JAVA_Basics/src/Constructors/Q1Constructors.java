package Constructors;

//1. Write a class with a default constructor, one argument constructor and two argument
//constructors. Instantiate the class to call all the constructors of that class from a main
//class

//5. Try to call the constructor multiple times with the same object

public class Q1Constructors {

    private String name;
    private int age;

    public Q1Constructors() {
    }

    public Q1Constructors(String name) {
        this.name = name;
    }

    public Q1Constructors(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Q1Constructors obj1 = new Q1Constructors();
        Q1Constructors obj2 = new Q1Constructors("Roshan");
        obj1.name = "JALA Academy";
        Q1Constructors obj3 = new Q1Constructors("Roshan",21);
        obj3.name = "Prajwal";
        obj3.age = 23;
    }
}
