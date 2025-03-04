// First and last occurrence of a character in a string using recursion.

public class p2_FLOC {
    public static void main(String[] args) {
        String s = "abcaabcdab";
        char c = 'b';
        find_floc(s, c);
    }

    private static void find_floc(String s,char c)
    {
        helper(s, c, 0, -1, -1);
    }

    private static void helper(String s, char c, int idx, int first, int last) {
        if (idx == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (s.charAt(idx) == c) {
            if (first == -1)
                first = idx;
            last = idx;
        }

        helper(s, c, idx + 1, first, last);
    }
}
