package Arrays;

// 8. Write a function to find the minimum and maximum value of an array

public class MinMaxOfArray {
    public static void main(String[] args) {
        int arr[] = {6,7,3,1,8,2,9,0,5};
        minMaxOfArray(arr);
    }

    private static void minMaxOfArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i<=min){
                min = i;
            } else if (i>=max) {
                max = i;
            }
        }
        System.out.println("min: "+min+"\n"+"max: "+max);
    }
}
