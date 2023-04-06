package Lec47;

public class House_Robber {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 8, 1};
        int[] dp = new int[arr.length];
    }

    public static int Robber(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }

        int rob = arr[i] + Robber(arr, i + 2);
        int dontRob = Robber(arr, i + 2);
        return Math.max(rob, dontRob);

    }

    public static int RobberTD(int[] arr, int i, int[] dp) {
        if (i >= arr.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int rob = arr[i] + RobberTD(arr, i + 2, dp);
        int dontRob = RobberTD(arr, i + 1, dp);
        return Math.max(rob, dontRob);

    }

}
