package JavaIO;

//1. Write a program to read text from .txt file using InputStream

import java.io.*;


public class Q1JavaIO {
    public static void main(String[] args) throws IOException {

        File fe = new File("H:\\JAVA_Assignments\\demo.txt");
        FileInputStream fis = new FileInputStream(fe);
        byte data[] = new byte[fis.available()];
        fis.read(data);
        fis.close();
        String str = new String(data);
        System.out.println(str);
    }
}
