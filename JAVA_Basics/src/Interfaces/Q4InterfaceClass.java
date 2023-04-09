package Interfaces;

//4. Create two interfaces with one method each. Implement these two interfaces in one
//class.

//5. Create two interfaces with the same method (same signature) in both the interfaces.
//        Implement these two interfaces in one class. Call the method

public class Q4InterfaceClass implements Q4Interface1, Q4Interface2 {
    @Override
    public String printName() {
        return "JALA";
    }

    @Override
    public String printCity() {
        return "Academy";
    }
}
