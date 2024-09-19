// import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class p61_Maps {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<Integer, String>();
        mp.put(123, "Arun");
        mp.put(124, "Arun");
        mp.put(125, "Varun");
        mp.put(126, "Tarun");

        System.out.println(mp);
        // mp.put(123, "Karun");
        mp.putIfAbsent(123, "Karun"); // puts only when entry is not found
        System.out.println(mp);

        System.out.println(mp.get(124));
        System.out.println(mp.get(127)); // prints null
        System.out.println(mp.getOrDefault(127, "111111")); // if you don't want to print null when value is not found.

        System.out.println(mp.containsKey(124));
        System.out.println(mp.containsKey(127));

        System.out.println(mp.containsValue("Nimish"));
        System.out.println(mp.containsValue("Arun"));

        // mp.replace(123, "Piyush");
        // System.out.println(mp);

        // mp.replace(127, "Piyush");
        // System.out.println(mp);

        mp.remove(123, "Piyush"); // won't remove anything if any of the key or value is not present.
        System.out.println(mp);

        Set<Integer> rollNum = mp.keySet();
        System.out.println(rollNum);

        Collection<String> Names = mp.values();
        System.out.println(Names);

        Set<Map.Entry<Integer, String>> record = mp.entrySet();
        System.out.println(record);
    }
}
