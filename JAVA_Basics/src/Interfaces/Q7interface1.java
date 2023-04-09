package Interfaces;

//7. Create an interface and inherit it from the other interface.

public interface Q7interface1 extends Q7Interface2{
    public default String printName(){
        return "Roshan";
    }
}
