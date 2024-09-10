import java.util.ArrayList;
import java.util.List;

public class p57_Collection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        System.out.println(list1.size()); // size method

        list1.add(1100); // add method
        list1.add(1200);
        list1.add(1300);

        System.out.println(list1);

        System.out.println(list1.contains(1100)); // contains method (T.C. : O(n))

        // list1.remove(2); // method of Collection (removes by index and not the value)
        // list1.remove(Integer.valueOf(1200)); // method of ArrayList

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(); // retainAll() method
        list2.add(1300);
        list2.add(1400);
        list2.add(1500);

        // list1.retainAll(list2);
        // System.out.println(list1);

        // list1.removeAll(list2); // removeAll
        // System.out.println(list1);

        // list1.clear(); // clear() method O(n)
        // System.out.println(list1);

        ////////////////////////////////////

        // Object[] obj = list1.toArray();
        // for (Object ele : obj)
        //     System.out.println(ele + " ");

        // System.out.println(list1);

        System.out.println(list1.get(2));
        System.out.println(list1);

        list1.add(0, 5000);
        System.out.println(list1);

    }
}
