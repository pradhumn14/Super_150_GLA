package Assignment_1;

import java.util.Scanner;

public class PrintArmstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;
        int ans = 0;
        int len = String.valueOf(n).length();
//        System.out.println(len);

        while (n > 0){
            int rem = n % 10;
            int power = (int) (Math.pow(rem,len));
            ans = ans + power;
            n /= 10;
        }

        if (original == ans) System.out.println("yes armstrong");
        else System.out.println("not armstrong");
        System.out.println(ans);
    }
}
