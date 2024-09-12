import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class p59_Collection_2 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>(); // here you can create instance of Stack, Vector but it will only
                                                  // create a list and not the type of the instance
        list1.add(1100);
        list1.add(1200);
        list1.add(1300);

        System.out.println(list1.get(2));
        list1.add(0, 1000);
        list1.remove(1);
        System.out.println(list1);

        System.out.println(list1.indexOf(1300));
        System.out.println(list1.lastIndexOf(1300));
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }

        System.out.println();

        System.out.print("Each ele: ");
        for (int x : list1)
            System.out.print(x + " ");

        System.out.println();

        Iterator<Integer> it = list1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        System.out.println(list1.subList(1, 3));

    }
}
