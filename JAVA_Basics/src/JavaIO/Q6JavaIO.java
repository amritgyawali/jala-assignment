package JavaIO;

//6. Write a program to write text to .txt file using FileWriter

import java.io.*;

public class Q6JavaIO {
    public static void main(String[] args) {
        String st = "Changes by FileWriter";
        try {

            File file = new File("H:\\JAVA_Assignments\\demo.txt");

            FileWriter writer = new FileWriter(file);

            char ch[] = st.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                writer.write(ch[i]);
            }
            writer.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }finally {
            System.out.println("Done");
        }
    }
}
