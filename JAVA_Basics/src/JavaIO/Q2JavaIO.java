package JavaIO;

//2. Write a program to write text to .txt file using OutputStream

import java.io.*;

public class Q2JavaIO {
    public static void main(String[] args) {
        String st = "Made some changes";
        try {
            FileOutputStream fw = new FileOutputStream("H:\\JAVA_Assignments\\demo.txt", true);
            char ch[] = st.toCharArray();
            for (int i = 0; i < st.length(); i++) {
                fw.write(ch[i]);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("Done");
        }
    }
}
