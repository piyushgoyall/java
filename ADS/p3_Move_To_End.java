// Move a particular char in a string to the end using recursion.

public class p3_Move_To_End {
    public static void main(String[] args) {
        String str = "bvsdkauybdksdfuyb";
        char ele = 'b';

        System.out.println(move(str, ele, 0, 0));
    }

    private static String move(String str, char ele, int i, int count) {
        if (i == str.length()) {
            return String.valueOf(ele).repeat(count);
        }

        if (str.charAt(i) == ele) {
            return move(str, ele, i + 1, count + 1);
        }

        return str.charAt(i) + move(str, ele, i + 1, count);
    }
}
