package Exceptions;

//14. Write a program to generate NoSuchMethodException

import java.lang.reflect.Method;

public class Q14Exception {
    public static void main(String[] args) {
        try {
            Class myClass = Q13Exception.class;
            Method myMethod = myClass.getMethod("printName", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
