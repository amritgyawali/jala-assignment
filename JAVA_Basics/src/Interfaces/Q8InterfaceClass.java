package Interfaces;

//8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
//Implement this interface to some class and print the values of the interface fields and
//call the interface methods

public class Q8InterfaceClass implements Q8Interface{

    @Override
    public int printNumber() {
        return 23;
    }

    public static void main(String[] args) {
        System.out.println(num);
    }
}
