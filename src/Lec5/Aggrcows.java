package Lec5;

import java.util.Arrays;
import java.util.Scanner;

public class Aggrcows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int nos = sc.nextInt();
            int noc = sc.nextInt();
            int [] stalls = new int[nos];
            for (int i = 0; i < nos; i++) {
                stalls[i] = sc.nextInt();

            }
            Arrays.sort(stalls);
        }
    }

}
