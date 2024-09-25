public class p5_LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public static p5_LinkedList insert(p5_LinkedList list, int data) {
        Node temp = new Node(data);
        temp.next = null;

        if (list.head == null) {
            list.head = temp;
        } else {
            Node curr = list.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }

        return list;
    }

    public static void printList(p5_LinkedList list) {
        Node curr = list.head;
        if (curr == null) {
            System.out.println("Empty List");
        } else {
            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.print("NULL");
        }
    }

    public static void deleteNode(p5_LinkedList list,int val)
    {
        Node curr = list.head;
        if(curr.data == val)
        {
            list.head = curr.next;
        }

        
    }

    public static void main(String[] args) {
        p5_LinkedList list = new p5_LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        printList(list);
    }
}
