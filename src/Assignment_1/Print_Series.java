package Assignment_1;

import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n = 1;

        while (n1 > 0){

            int q = 3 * n + 2;
            if (q % n2 != 0){
                System.out.println(q);
                n1--;
            }
            n++;
        }
    }
}
