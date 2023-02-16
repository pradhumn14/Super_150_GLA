package Lec40;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 3;
        System.out.println(findKthLargest(arr, k));

    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max heap

        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (nums[i] > pq.peek()) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.poll();
    }
}
