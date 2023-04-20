package sem2Test6;

import java.util.*;

public class Monu_Bhaiya_And_Contests {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {

            int n = in.nextInt();

            int[] arrivll = new int[n];
            int[] departrr = new int[n];

            for (int p = 0; p < n; p++) {
                arrivll[p] = in.nextInt();
            }

            for (int p = 0; p < n; p++) {
                departrr[p] = in.nextInt();
            }

            int laptopsNeeded = minimLaptopss(arrivll, departrr, n);
            System.out.println(laptopsNeeded);

        }
        in.close();
    }

    public static int minimLaptopss(int[] arrivll, int[] departrr, int n) {

        Arrays.sort(arrivll);
        Arrays.sort(departrr);


        int laptopsNeeded = 0;
        int studntUsngLptop = 0;

        int p = 0;
        int k = 0;

        while (p < n && k < n) {

            // if arriving
            if (arrivll[p] < departrr[k]) {

                studntUsngLptop++;

                if (studntUsngLptop > laptopsNeeded) {
                    laptopsNeeded = studntUsngLptop;
                }

                p++;

            }

            // if leaving
            else {
                studntUsngLptop--;
                k++;
            }

        }

        return laptopsNeeded;
    }
}
