package Constructors;

//2. Call the constructors(both default and argument constructors) of super class from a child
//class

public class Q2ConstructorChildClass extends  Q2Constructors{
    private String name;
    private int age;
    public Q2ConstructorChildClass(){
            super();
        }
        public  Q2ConstructorChildClass(String name, int age){
            super(name,age);
        }
}
