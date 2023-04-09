package Arrays;

//10. Write a function to find the duplicate values of an array

public class DuplicateInArray {
    public static void main(String[] args) {
        int arr[] = {1,4,2,7,1,2,3,4};
        findDuplicate(arr);
    }

    private static void findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
