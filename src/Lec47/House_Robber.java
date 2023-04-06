package Lec47;

public class House_Robber {
    public static void main(String[] args) {

    }

    public static int Robber (int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }

        int rob = arr[i] + Robber(arr, i+2);
        int dontRob = Robber(arr, i + 2);
        return Math.max(rob, dontRob);

    }

    public static int RobberTD (int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }

        int rob = arr[i] + RobberTD(arr, i+2);
        int dontRob = Robber(arr, i + 2);
        return Math.max(rob, dontRob);

    }

}
