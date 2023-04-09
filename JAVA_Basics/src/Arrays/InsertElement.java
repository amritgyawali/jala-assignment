package Arrays;

//7. Write a function to insert an element at a specific position in the array

import java.util.*;
public class InsertElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to insert in the array");
        int n = sc.nextInt();
        System.out.println("Enter the position where you want to add this element in the array");
        int p = sc.nextInt();

        int myArr[] = insertElement(arr, n, p-1);
        for (int it : myArr) {
            System.out.println(it);
        }
    }

    private static int[] insertElement(int[] arr, int n, int p) {
        int newArray[] = new int[arr.length+1];
        boolean flag = false;
        for (int i = 0,j=0; i < arr.length; i++,j++) {
            if (i == p && flag == false){
                newArray[j] = n;
                flag = true;
                i--;
            }else {
                newArray[j] = arr[i];
            }
        }

        return newArray;
    }

}
