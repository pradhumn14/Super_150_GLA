package GFG;

import java.util.Arrays;

public class Minimum_Product {
    public static void main(String[] args) {
        int a[]={ 1, 1, 1 };
        int n=a.length;
        System.out.println(printMinimumProduct(a,n));
    }

    public static int printMinimumProduct(int arr[], int n)
    {

        // Sort the array
        Arrays.sort(arr);

        // Returning the product of first two numbers
        return arr[0]*arr[1];
    }

}
