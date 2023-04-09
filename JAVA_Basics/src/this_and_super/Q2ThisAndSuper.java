package this_and_super;

//2. Print the fields/instance members of the parent class using super

public class Q2ThisAndSuper {
    public String name;
    public int age;

    public Q2ThisAndSuper(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printFields() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
