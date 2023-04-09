package Constructors;

//3. Apply private, public, protected and default access modifiers to the constructor
//4. Write constructors with return type int and String

public class Q3Constructor {
    private String name;
    private int age;
    public Q3Constructor(){
    }
    protected String Q3Constructor(String name){
        return name;
    }
    private int Q3Constructor(String name, int age){
        return age;
    }
}
