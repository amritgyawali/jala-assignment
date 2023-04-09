package Java_Basics;

//5. Define the local and Global variables with the same name and print both variables and
//understand the scope of the variables

public class Local_and_Global {
    // Global variables are the variables that can be accessed anywhere in the java program
    // and we have to declare it outside the function
    static int num = 1;

    public static void main(String[] args) {
        //Local variables are declared inside a function and their scope is limited to that function only.
        String str = "Hello";
    }
}
