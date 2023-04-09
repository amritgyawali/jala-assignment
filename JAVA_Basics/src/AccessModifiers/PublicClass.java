package AccessModifiers;

//4. Create a class with PUBLIC fields and methods.
//Access the public methods and fields from any class in the same package or different
//package.

public class PublicClass {
    public static String movieName = "Tanhaji";

    public static String getMovieName() {
        return movieName+" The Unsung Warrior";
    }
}
