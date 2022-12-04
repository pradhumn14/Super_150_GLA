package Assignment_1;

import java.util.Scanner;

public class Print_Primes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            int c = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 0) {
                System.out.println(i);
            }

        }
    }
}
