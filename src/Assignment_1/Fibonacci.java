package Assignment_1;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev = -1;
        int next = 1;

        for (int i = 1; i <= n; i++) {

            int num = prev + next;
            prev = next;
            next = num;

            System.out.println(num);
        }
//        System.out.println(next);
    }
}
