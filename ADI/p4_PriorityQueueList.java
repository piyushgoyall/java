class Node {
    int data;
    Node next;
    int priority;

    Node(int d, int p) {
        this.data = d;
        this.priority = p;
        this.next = null;
    }

    static Node push(Node head, int d, int p) {
        Node start = head;
        Node temp = new Node(d, p);

        if (head == null || head.priority > p) {
            temp.next = head;
            head = temp;
        }

        else {
            while (start.next != null && start.next.priority < p) {
                start = start.next;
            }
            temp.next = start.next;
            start.next = temp;
        }

        return head;
    }

    static Node pop(Node head) {
        if (head != null)
            head = head.next;
        else {
            System.out.println("Queue empty!!");
        }

        return head;
    }

    static int peek(Node head) {

        return head == null ? -1 : (head.data);

    }
}

public class p4_PriorityQueueList {
    public static void main(String[] args) {
        Node pq = null;
        pq = pq.pop(pq);
        System.out.println(pq.peek(pq));
        pq = Node.push(pq, 1, 5);
        pq = Node.push(pq, 2, 4);
        pq = Node.push(pq, 3, 3);
        pq = Node.push(pq, 4, 2);
        pq = Node.push(pq, 5, 1);

        while (pq != null) {
            System.out.println(pq.peek(pq));
            pq = pq.pop(pq);
        }

    }
}
