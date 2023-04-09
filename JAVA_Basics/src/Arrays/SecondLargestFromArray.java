package Arrays;

//13. Write a method to find the second largest number in an array
//14. Write a method to find the second largest number in an array
public class SecondLargestFromArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 8, 6, 7, 5, 2, 3};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int large = 0;
        int secondLarge = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] > large){
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }
}
