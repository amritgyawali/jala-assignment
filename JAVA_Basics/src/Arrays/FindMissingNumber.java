package Arrays;

//19. Write a function to find the missing number of sorted array of 1 to 100

public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = new int[100];
        for (int i = 0; i < 100; i++) {
            if(i%8 == 0) continue;
            arr[i] = i+1;
        }
        for(int j=0; j<arr.length-1; j++){
            if(arr[j+1] != arr[j]+1){
                System.out.println(arr[j]);
            }
        }
    }
}
