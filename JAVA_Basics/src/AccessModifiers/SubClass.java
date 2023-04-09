package AccessModifiers;

//Create a sub class and try to access the private fields and methods from sub class.

public class SubClass extends DefaultClass{
    public static void main(String[] args) {

//        we cannot access private variable outside the class, this will throw the error,
//        if we want to access that private variable then we have to create getters and setters
/*        System.out.println(num);       */

//        Here we accessed default variable and method from SubClass
        System.out.println(name);
        getCity();

    }
}
