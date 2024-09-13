import java.util.PriorityQueue;
import java.util.Queue;
// import java.util.Deque;
// import java.util.LinkedList;

public class p60_Queue {
    public static void main(String[] args) {
        Queue<Integer> num = new PriorityQueue<>((a, b) -> b - a); // write a - b for min heap (by default only first
                                                                   // element changes to max or min rest elements are
                                                                   // placed randomly)
        num.offer(6);
        num.offer(4);
        num.offer(9);
        num.offer(1);

        System.out.println(num);

    }
}

// public class p60_Queue {
// public static void main(String[] args) {
// Deque<String> students = new LinkedList<>(); // You can also create
// ArrayDeuqe but then the instance also has to
// // be of ArrayDeque type and not LinkedList

// students.offer("Piyush");
// students.offerLast("Kavay");
// students.offerFirst("Omil");

// System.out.println(students);

// // students.poll();
// students.pollLast();
// System.out.println(students);
// }
// }

// public class p60_Queue {
// public static void main(String[] args) {
// Queue<String> students = new LinkedList<>();
// students.offer("Piyush"); // does not throw exception
// students.offer("Kavay");
// students.offer("Omil");

// System.out.println(students);

// System.out.println(students.poll()); // does not throw exception whereas
// remove throws exception
// System.out.println(students);

// System.out.println(students.peek()); // does not throw exception if queue is
// empty
// System.out.println(students.element()); // throws exception if queue is empty
// System.out.println(students);
// }
// }
