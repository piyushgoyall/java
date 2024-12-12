public class p15_Manacher {
    public static String longestPalindromicSubstring(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append("#");
        }
        String s = sb.toString();

        int[] p = new int[s.length()];
        int center = 0, right = 0;
        for (int i = 1; i < s.length() - 1; i++) {
            int mirror = 2 * center - i;
            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }
            while (i + p[i] + 1 < s.length() && i - p[i] - 1 >= 0 && s.charAt(i + p[i] + 1) == s.charAt(i - p[i] - 1)) {
                p[i]++;
            }
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }

        int maxLen = 0, centerIndex = 0;
        for (int i = 1; i < p.length - 1; i++) {
            if (p[i] > maxLen) {
                maxLen = p[i];
                centerIndex = i;
            }
        }
        int startIndex = (centerIndex - maxLen) / 2;
        return str.substring(startIndex, startIndex + maxLen);
    }

    public static void main(String[] args) {
        String str = "abaxabaxabb";
        String longestPalindromicSubstring = longestPalindromicSubstring(str);
        System.out.println(longestPalindromicSubstring);
    }
}
