package AbstractClass;

//2. Create a sub class for an abstract class. Create an object in the child class for the
//abstract class and access the non-abstract methods

//3. Create an instance for the child class in child class and call abstract methods
//4. Create an instance for the child class in child class and call non-abstract methods
public abstract class AbsSubClass{

    public static void main(String[] args) {
        AbsClass obj = new AbsClass() {
            @Override
            public void printName() {

            }
        };
        obj.printNumber(5);
    }


}
