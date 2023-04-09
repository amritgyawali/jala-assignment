package this_and_super;

//1. Print the fields/instance members of the current class using this and without using object
//6. Use this() and super() in methods not in constructors

public class Q1ThisAndSuper {
    int num = 123;

//this() and super() can only be used in constructors, while this can be
// used in methods to refer to the current instance of the class.
    public void printNumber(){
        System.out.println(this.num);
    }

    public static void main(String[] args) {
        Q1ThisAndSuper obj = new Q1ThisAndSuper();
        obj.printNumber();
    }
}
