package AccessModifiers;

//3. Create a class with PROTECTED fields and methods. Access these fields and methods
//from any other class in the same package.
//Access the PROTECTED fields and methods from any class in different package
public class ProtectedBaseClass extends ProtectedClass{
    public static void main(String[] args) {
        System.out.println(bookName);
        System.out.println(bookPrice());
    }
}
