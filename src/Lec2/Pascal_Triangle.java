package Lec2;

public class Pascal_Triangle {
    public static void main(String[] args) {
        int n = 6;
        int row = 0;
        int start = 1;

        while (row < n) {
            int i = 0;
            int ncr = 1;
            while (i < start) {
                System.out.print(ncr + " ");
                ncr = ((row - i) * ncr) / (i - 1);
                i++;
            }
            row++;
            start++;
            System.out.println();

        }
    }
}
