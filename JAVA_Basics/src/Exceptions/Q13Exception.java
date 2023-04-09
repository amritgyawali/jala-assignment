package Exceptions;

//13. Write a program to generate NoSuchFieldException

import java.lang.reflect.*;

public class Q13Exception {
    public static void main(String[] args) {

    try{
        Class myClass = Q12Exception.class;
        Field field = myClass.getField("Roshan");
    }catch (NoSuchFieldException e){
        e.printStackTrace();
    }

    }
}
