package Interfaces;

//9. Create a PRIVATE or PROTECTED interface and print the values as above scenario
//10. Create an interface with private, public and protected fields.
//11. Create an interface with static final variable

interface Q9Interface {
    public static int num = 23;

    private int printNumber() {
        return num;
    }
    default String printName(){
        return "Roshan";
    }

}
