package Assignment_1;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int ans = 0;

        int len = String.valueOf(n).length();

        while (original!=0){
            int rem = original % 10;
            ans = (int) (ans + Math.pow(rem,len));
            original /= 10;
        }

        if (n == ans){
            System.out.println("true");
        }
        else System.out.println("false");

    }
}
