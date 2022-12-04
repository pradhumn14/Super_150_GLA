package Lec4;

import java.util.Scanner;

public class Print_Prime {
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

//        int fact = 0;
//
//        for (int nl = 2; nl <= n; nl++) {
//            fact = 0;
//            for (int i = 2; i < nl; i++) {
//                if (nl % i == 0) {
//                    fact++;
//                    break;
//                }
//            }
//            if (fact == 0) {
//                System.out.println(nl);
//            }
//        }


