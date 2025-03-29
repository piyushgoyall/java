public class p8_LL {

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            this.data = d;
        }
    }

    static Node insertEnd(Node head, int data) {
        Node newLink = new Node(data);
        Node last = head;
        newLink.next = null;
        if (head == null) {
            head = newLink;
            return head;
        }
        while (last.next != null)
            last = last.next;
        last.next = newLink;
        return head;
    }

    static int max_i = Integer.MIN_VALUE;
    static int min_i = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    static Node shiftSmallLarge(Node head) {
        if (head == null || head.next == null)
            return head;

        Node temp = head;
        int k = 0;
        while (temp != null) {
            int val = temp.data;
            if (val < min) {
                min = val;
                min_i = k;
            }
            if (val > max) {
                max = val;
                max_i = k;
            }
            temp = temp.next;
            k++;
        }

        temp = head;

        int val;
        while (min_i-- > 1) {
            temp = temp.next;
        }
        if (min_i >= 0) {
            val = temp.next.data;
            temp.next = temp.next.next;
            Node new_node = new Node(val);
            new_node.next = head;
            head = new_node;
        }

        temp = null;
        temp = head;

        while (max_i-- > 1) {
            temp = temp.next;
        }
        val = temp.next.data;
        if (temp.next != null)
            temp.next = temp.next.next;
        insertEnd(head, val);
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(-8);
        head.next.next = new Node(4);
        head.next.next.next = new Node(15);
        head.next.next.next.next = new Node(-3);
        head.next.next.next.next.next = new Node(10);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(20);
        head.next.next.next.next.next.next.next.next = new Node(-5);
        head.next.next.next.next.next.next.next.next.next = new Node(12);
        head.next.next.next.next.next.next.next.next.next.next = new Node(9);
        print(shiftSmallLarge(head));

    }
}
