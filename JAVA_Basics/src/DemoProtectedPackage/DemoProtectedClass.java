package DemoProtectedPackage;

//3. Create a class with PROTECTED fields and methods. Access these fields and methods
//from any other class in the same package.
//Also, Access the PROTECTED fields and methods from child class located in a different
//package

import AccessModifiers.ProtectedClass;

public class DemoProtectedClass extends ProtectedClass {
    public static void main(String[] args) {
        System.out.println(bookName);
        System.out.println(bookPrice());
    }
}
