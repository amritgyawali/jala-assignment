package Arrays;

//4. Write a function to test if array contains a specific value

public class ContainsValue {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,6,5,8,7};
        System.out.println(containsValue(arr,3));
    }

    public static boolean containsValue(int[] arr, int num) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
