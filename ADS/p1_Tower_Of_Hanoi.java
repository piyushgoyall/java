public class p1_Tower_Of_Hanoi {
    public static void main(String[] args) {
        String s = "src";
        String h = "helper";
        String d = "dest";
        int n = 3;

        toh(s, h, d, n);
    }

    private static void toh(String s, String h, String d, int n) {
        if (n == 0)
            return;

        toh(s, d, h, n - 1);
        System.out.println("Move " + n + " From " + s + " To " + d);
        toh(h, s, d, n - 1);
    }
}