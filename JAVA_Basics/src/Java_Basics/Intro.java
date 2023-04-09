package Java_Basics;
// 1. How to create a class, object, method and its signature

// to create an class we have to make a .java file after that add access modifier add class,
// after that add class name of your java file
public class Intro {
    public static void main(String[] args) {
        System.out.println("hello");
        print();
    }

    //to create a method we have to give access modifier, static keyword and return type of the method
    // and after that give the method name
    public static void print(){
        System.out.println("Welcome to the JALA Academy");
//         to create an object of the class we need to use new keyword in the main method
        Intro obj = new Intro();
    }
}

//for example:
//public class Object{
//    public static void main(String[] args) {
//
//    }
//}
