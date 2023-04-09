package JavaIO;

//3. Read text from a .txt file using BufferedInputStream

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Q3JavaIO {
    public static void main(String[] args) {
        try {

            FileInputStream file = new FileInputStream("H:\\JAVA_Assignments\\demo.txt");

            BufferedInputStream input = new BufferedInputStream(file);

            int i = input .read();

            while (i != -1) {
                System.out.print((char) i);

                i = input.read();
            }
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
