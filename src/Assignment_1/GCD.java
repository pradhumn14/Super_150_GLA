package Assignment_1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        while(n2%n1!=0){
            int rem = n2 % n1;
            n2 = n1;
            n1= rem;
        }
        System.out.println(n1);
    }
}
