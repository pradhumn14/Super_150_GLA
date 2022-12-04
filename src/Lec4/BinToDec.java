package Lec4;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int i = 0;

        while (n>0){
            int rem = n % 10;
            n /= 10;
            ans = ans + (int)(rem * Math.pow(2,i));
            i++;
        }
        System.out.println(ans);
    }
}
