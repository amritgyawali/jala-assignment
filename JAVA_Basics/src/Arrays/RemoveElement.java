package Arrays;

// 5. Write a function to remove a specific element from an array

import java.util.Arrays;
import Arrays.ContainsValue;

import static Arrays.ContainsValue.containsValue;
import static Arrays.IndexOfElement.indexOfArraysElement;

public class RemoveElement {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,9,8};
        removeElement(arr,9);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void removeElement(int[] arr, int num) {
        if(containsValue(arr,num)){
            int index = indexOfArraysElement(arr,num);
            for (int i = index; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
        }else {
            System.out.println("Element is not in the array");
        }

    }
}
