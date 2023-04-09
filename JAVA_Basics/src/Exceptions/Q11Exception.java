package Exceptions;

//11. Write a program to generate FileNotFoundException

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q11Exception {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("file.txt");

        BufferedReader br = new BufferedReader(reader);

        String data =null;

        while ((data = br.readLine()) != null)
        {
            System.out.println(data);
        }

        br.close();
    }

}


