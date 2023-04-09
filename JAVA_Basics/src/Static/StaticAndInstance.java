package Static;

//1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
//methods and a main method.

public class StaticAndInstance {
    public static void main(String[] args) {
//        static method
        Book.name("vaibhav");
//        static variable
        System.out.println(Book.bookName);

//        to get the instance variable and method to static method we have to create the object of that class first
        Book obj = new Book();
//        instance method
        obj.getWriter("mohit");
//        instance variable
        System.out.println(obj.writer);
    }
}
class Book {

    String writer;
    public void getWriter(String writer) {
        this.writer = writer;
    }
    public static String bookName;
    public static void name(String name)
    {
        bookName = name;
    }
}


