package this_and_super;

//3. Call constructor of the current class using this()
//4. Call argument constructor of current class using this()
public class Q3ThisAndSuper {
    private String address;
    private String name;
    private int age;
    public Q3ThisAndSuper(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Q3ThisAndSuper(String address){
        this("Roshan",21);
        this.address = address;
    }
}
