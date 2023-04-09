package Arrays;

//16. Write a function to get the difference of largest and smallest value

public class DifferenceOfLargestAndSmallest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 8, 6, 7, 5, 2, 3};
        System.out.println(defOfLargeAndSmall(arr));
    }

    private static int defOfLargeAndSmall(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return largest - smallest;
    }
}
