package Arrays;

// 12. Write a method to remove duplicate elements from an array
// 18. Write a program to remove the duplicate elements and return the new array
public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 8, 6, 7, 5, 2, 3};
        int n = arr.length;

        int m = 0;

        for (int i = 0; i < n; i++) {
            m = Math.max(m, arr[i]);
        }

        int[] frq = new int[m + 1];

        for (int i = 0; i < n; i++) {
            frq[arr[i]]++;
        }

        for (int i = 0; i < m + 1; i++) {

            if (frq[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }
}
