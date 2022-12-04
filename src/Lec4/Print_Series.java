package Lec4;

public class Print_Series {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 4;
        int n = 1;

        while (n1>0){
            int q = 3*n +2;
            if (q % n2 != 0){
                System.out.println(q);
                n1--;
            } n++;
        }
    }
}
