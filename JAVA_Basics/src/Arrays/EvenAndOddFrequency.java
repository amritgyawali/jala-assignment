package Arrays;

//15. Write a method to find number of even number and odd numbers in an array

import java.util.ArrayList;

public class EvenAndOddFrequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 8, 6, 7, 5, 2, 3};
        frequencyOfEvenAndOdd(arr);
    }

    private static void frequencyOfEvenAndOdd(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                even.add(arr[i]);
            }else {
                odd.add(arr[i]);
            }
        }
        System.out.println("Even Numbers from array:");
        for (int i : even) {
            System.out.print(i + " ");
        }
        System.out.println("\nTotal Even Number: "+even.size());

        System.out.println("\nOdd Numbers from array:");
        for (int i : odd) {
            System.out.print(i + " ");
        }
        System.out.println("\nTotal odd Number: "+odd.size());
    }
}
