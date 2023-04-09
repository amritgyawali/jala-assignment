package Inheritance;

//Create a class with main method. Create an object for each class A, B and C in main
//method and call every method of each class using its own object/instance.
//Call an overridden method with super class reference to B and C class’s objects

//Runtime Polymorphism with Data Members/Instance variables, Repeat the above
//process only for data members
public class BaseClass {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.sayHi();

        B obj2 = new B();
        obj2.printHello();

        C obj3 = new C();
        obj3.printName();

        A obj = new B();
        obj.printName();
//        even I created the object of class B with refrence to class A
//        it will execute the class A's variable because
//        Variables are not polymorphic in Java, they do not override one another
        System.out.println(obj.city);

        A ob = new C();
        ob.printName();
    }
}
