package Arrays;

//1. Write a function to add integer values of an array

public class AddValues {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(addValues(arr));
    }
    public static int addValues(int arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
