import java.util.HashMap;
import java.util.Map;

public class p65_HashMap {

    public static void main(String[] args) {
        // Creating a HashMap to store String keys and Integer values
        HashMap<String, Integer> myMap = new HashMap<>();

        // Adding elements to the map using put() method
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);
        myMap.put("Four", 4);

        // Printing the map
        System.out.println("Initial Map: " + myMap);

        // Accessing an element using get() method
        System.out.println("Value for key 'Two': " + myMap.get("Two"));

        // Removing an element using remove() method
        myMap.remove("Three");
        System.out.println("Map after removing key 'Three': " + myMap);

        // Checking if a key exists using containsKey() method
        boolean hasFour = myMap.containsKey("Four");
        System.out.println("Contains key 'Four': " + hasFour);

        // Checking if a value exists using containsValue() method
        boolean hasValue3 = myMap.containsValue(3);
        System.out.println("Contains value 3: " + hasValue3);

        // Iterating through the map using for-each loop and entrySet()
        System.out.println("Iterating through map:");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Replacing a value using replace() method
        myMap.replace("Four", 40);
        System.out.println("Map after replacing value for key 'Four': " + myMap);

        // Checking the size of the map
        System.out.println("Map size: " + myMap.size());

        // Clearing the map using clear() method
        myMap.clear();
        System.out.println("Map after clear(): " + myMap);
    }
}
