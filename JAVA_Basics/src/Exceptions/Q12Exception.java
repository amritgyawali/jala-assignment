package Exceptions;

//

import java.io.FileInputStream;
import java.io.IOException;

//12. Write a program to generate IOException

public class Q12Exception {
    public static void main(String[] argv) throws Exception {

        try {
            FileInputStream file = new FileInputStream("file.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
