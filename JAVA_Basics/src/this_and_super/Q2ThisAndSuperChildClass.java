package this_and_super;

//2. Print the fields/instance members of the parent class using super
//5. Call constructor of the parent class using super()

public class Q2ThisAndSuperChildClass extends Q2ThisAndSuper{
    public String breed;

    public Q2ThisAndSuperChildClass(String name, int age) {
        super(name, age);
        this.breed = breed;
    }


    public void printFields() {
        super.printFields();
        System.out.println("Breed: " + this.breed);
    }

    public static void main(String[] args) {
        Q2ThisAndSuper obj = new Q2ThisAndSuper("BullDog", 33);
        obj.printFields();
    }
}
