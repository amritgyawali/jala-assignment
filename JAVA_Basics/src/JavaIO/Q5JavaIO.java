package JavaIO;

//5. Write a program to read text from .txt file using FileReader

import java.io.*;

public class Q5JavaIO {
    public static void main(String[] args) throws IOException {
        try{
            File file = new File("H:\\JAVA_Assignments\\demo.txt");
            FileReader fr = new FileReader(file);
            int i = fr.read();
            while(i != -1){
                System.out.print((char) i);
                i = fr.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
