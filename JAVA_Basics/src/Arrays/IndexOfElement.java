package Arrays;

//3. Write a program to find the index of an array element

public class IndexOfElement {
    public static void main(String[] args) {
        int arr[] = {4,6,3,5,2,1};
        System.out.println(indexOfArraysElement(arr,3));
    }
    public static int indexOfArraysElement(int arr[], int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
