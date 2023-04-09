package JavaIO;

//4. Write text to a .txt file using BufferedOutputStream

import java.io.*;

public class Q4JavaIO {
    public static void main(String[] args) {
        String st = "Changes by bufferedOutputstream";
        try {

            FileOutputStream file = new FileOutputStream("H:\\JAVA_Assignments\\demo.txt");

            BufferedOutputStream output = new BufferedOutputStream(file);

            char ch[] = st.toCharArray();
            for (int i = 0; i < st.length(); i++) {
                output.write(ch[i]);
            }
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
