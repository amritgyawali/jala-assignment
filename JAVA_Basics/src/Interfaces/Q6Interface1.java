package Interfaces;

//6. Create an interface with a default method and implement it in a class. Do not provide
//implementation to the default method and call the method

public interface Q6Interface1 {
    default int getNumber(){
        return 0;
    }
}
