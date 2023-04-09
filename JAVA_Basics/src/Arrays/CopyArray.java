package Arrays;

//6. Write a function to copy an array to another array

public class CopyArray {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,2,4,8,7};
        int newArray[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
    }
}
