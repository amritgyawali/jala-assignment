package Arrays;

//11. Write a program to find the common values between two arrays

import java.util.ArrayList;

public class CommonBetweenTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,4,3,65,7,8,9};
        int arr2[] = {10,8,12,0,5,65,2};
        commonBetweenTwoArray(arr1, arr2);
    }

    private static void commonBetweenTwoArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j] && !list.contains(arr1[i])){
                    list.add(arr1[i]);
                }
            }
        }
        list.forEach(System.out::println);
    }
}
