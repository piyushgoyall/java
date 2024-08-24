import java.util.HashMap;
import java.util.Map;

public class p11_FrequencyMap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 6 };

        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and update the frequency in the map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency map
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

        System.out.println();

        // Print elements with frequency 2 or 4
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            if (frequency == 2 || frequency == 4) {
                System.out.println("Element: " + entry.getKey() + ", Frequency: " + frequency);
            }
        }
    }
}