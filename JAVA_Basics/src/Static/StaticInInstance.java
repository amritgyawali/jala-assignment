package Static;

//3. Print static variables in Instance methods
//5. Call static methods in instance methods
//6. Print all the static, instance variables in main method
//7. Call static methods and instance methods in main method

public class StaticInInstance {
    public static String city = "Sambhaji Nagar";
    public String Address = "N6 Cidco";
    public static void main(String[] args) {
        String name = "Roshan";
//        we have to create the object of class to print the instance method in static method
        StaticInInstance st = new StaticInInstance();
        st.printName(name);
        getName(name);

        System.out.println(city);
        System.out.println(st.Address);
    }

    public void printName(String name){
        System.out.println("Static variable in Instance Method: "+city);
        System.out.println("My name is: "+getName(name)+" From Instance Method");
    }
     public static String getName(String name){
         System.out.println("From Static method: ");
        return name;
     }

}

