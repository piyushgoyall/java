public class p11_Array_Two_Unique {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 3, 5, 1, 4, 3, 2, 6 };
        int res = 0;

        // 1st part: XOR all elements to get the XOR of the two unique numbers
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }

        // 2nd part: Find the rightmost set bit in the XOR result
        int pos = 0;
        for (int i = 0; i < 32; i++) {
            if ((res & (1 << i)) > 0) {
                pos = i;
                break;
            }
        }

        // 3rd part: Divide the array elements into two groups and XOR separately
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & (1 << pos)) > 0) {
                num1 ^= arr[i];
            } else {
                num2 ^= arr[i];
            }
        }

        System.out.println("The two unique numbers are: " + num1 + " and " + num2);
    }
}
