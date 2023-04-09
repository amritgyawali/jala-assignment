package Arrays;

//17. Write a method to verify if the array contains two specified elements(12,23)

public class ContainsElement {
    public static void main(String[] args) {
        int arr[] = {12, 2, 6, 8, 6, 7, 5, 2, 23};
        int num1 = 12, num2 = 23;
        System.out.println(areContains(arr, num1, num2));
    }

    private static Boolean areContains(int arr[],int num1, int num2) {
        boolean flag1 = false, flag2 = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1) {
                flag1 = true;
            } else if (arr[i] == num2) {
                flag2 = true;
            }

        }
        return flag1 == flag2;
    }
}
