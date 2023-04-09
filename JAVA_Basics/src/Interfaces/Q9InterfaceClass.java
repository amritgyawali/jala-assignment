package Interfaces;

//9. Create a PRIVATE or PROTECTED interface and print the values as above scenario
//10. Create an interface with private, public and protected fields.
public class Q9InterfaceClass implements Q9Interface {


    @Override
    public String printName() {
        return "Roshan";
    }
    private int printNumber(){
        return 1;
    }
}
