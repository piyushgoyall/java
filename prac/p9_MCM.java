public class p9_MCM {
    static int res(int i, int j, int[] arr, Integer[][] memo) {

        if (i == j)
            return 0;

        if (memo[i][j] != null)
            return memo[i][j];

        int min = 999999;
        for (int k = i; k <= j - 1; k++) {
            int val = arr[i - 1] * arr[k] * arr[j] + res(i, k, arr, memo) + res(k + 1, j, arr, memo);
            min = Math.min(min, val);
        }

        return memo[i][j] = min;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        Integer[][] memo = new Integer[arr.length][arr.length];
        System.out.println(res(1, arr.length - 1, arr, memo));
    }
}