package Assignment_1;

import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = n1; i <= n2; i++) {

            int sum = 0;
            int x = i;

            while (x > 0){
                int rem = x % 10;
                sum += rem*rem*rem;
                x /= 10;
            }

            if (sum == i){
                System.out.println(i);
            }
        }
        
    }





}
