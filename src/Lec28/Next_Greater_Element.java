package Lec28;

import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int[] arr = {10, 2, 1, 3, 5, 4, 8, 7};


    }

    public static void NGE(int[] arr){

        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]){

            }
            st.push(i);

        }

    }

}
