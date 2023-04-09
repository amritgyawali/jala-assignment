package Interfaces;

//1. Create an interface with only one method and implement it in a class. Call the method
//implemented.

//2. Create an interface with two methods, but implement only one in a class. Call the
//method implemented.

//3. Use Interface instances to call the implemented method in the implemented class

public class InterfaceClass implements CreateInterface{


    @Override
    public int getNumber() {
        return 0;
    }

    @Override
    public String printName(){
        return "JALA Academy";
    }

    CreateInterface in = new CreateInterface() {
        @Override
        public int getNumber() {
            return 0;
        }

        @Override
        public String printName() {
            return null;
        }
    };
}
