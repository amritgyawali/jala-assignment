package Arrays;

//9. Write a function to reverse an array of integer values

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        reverseArray(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void reverseArray(int[] arr) {
        int first = 0, last = arr.length-1;
        while (first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
