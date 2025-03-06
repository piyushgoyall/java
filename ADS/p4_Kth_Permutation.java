import java.util.ArrayList;
import java.util.List;

public class p4_Kth_Permutation {
    static int count = 0;

    public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            numbers.add(i);
        return findKthPermutation(numbers, k, new StringBuilder());
    }

    private static String findKthPermutation(List<Integer> nums, int k, StringBuilder result) {
        if (nums.isEmpty())
            return result.toString();

        int fact = factorial(nums.size() - 1);
        int index = (k - 1) / fact;
        result.append(nums.get(index));
        nums.remove(index);
        return findKthPermutation(nums, k - index * fact, result);
    }

    private static int factorial(int num) {
        return (num <= 1) ? 1 : num * factorial(num - 1);
    }
    
    public static void main(String[] args) {
        int n = 4, k = 9;
        System.out.println(getPermutation(n, k));
    }
}