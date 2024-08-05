// ArrayList

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Arrays;

public class p19_array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(21);
        arr.add(22);
        arr.add(23);
        arr.add(24);
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++)
            System.out.print(arr.get(i) + " ");

        // arr.remove(1);
        // System.out.println("\n" + arr);

        arr.remove(Integer.valueOf(22));
        System.out.println("\n" + arr);

        // arr.clear();
        // System.out.println("\n" + arr);

        arr.set(2, 52);
        System.out.println("\n" + arr);

        arr.add(0, 100);
        System.out.println("\n" + arr);

        Collections.sort(arr);
        System.out.println("\n" + arr);

        arr.remove(Integer.valueOf(101));
        System.out.println("\n" + arr);

        if (!arr.contains(101))
            arr.add(101);

        System.out.println("\n" + arr);

    }
}
