package Lec4;

import java.util.Scanner;

public class DecToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int mul = 1;

        while (n>0){
            int rem = n % 8;
            ans = ans + mul * rem;
            mul = mul * 10;
            n /= 8;
        }
        System.out.println(ans);
    }
}
