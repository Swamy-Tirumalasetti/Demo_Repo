import java.util.Arrays;
import java.util.List;

class Node {
    public int data;
    public Node next;

    // Constructor with both data and next node
    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data (assuming next is initially null)
    public Node(int data1) {
        data = data1;
        next = null;
    }
}

public class InsertNode {

    static Node convertLL(List<Integer> array) {
        Node head = new Node(array.get(0));
        Node mover = head;
        for (int i = 1; i < array.size(); i++) {
            Node temp = new Node(array.get(i));
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void printAll(Node head) {
        while ((head != null)) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    static Node insertAtHead(Node head, int x) {
        return new Node(x, head);
    }

    static Node insertAtTail(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = temp;
        return head;
    }

    static Node insertAtKPosition(Node head, int x, int k) {
        if (head == null) {
            if (k == 1)
                return new Node(x);
            else
                return null; // not possible
        }
        if (k == 1)
            return new Node(x, head);
        int cnt = 0;
        Node current = head;
        while (current != null) {
            cnt++;
            if (cnt == k - 1) {
                Node temp = new Node(x, current.next);
                current.next = temp;
                break;
            }
            current = current.next;
        }
        return head;
    }

    static Node insertBeforeGivenValue(Node head, int x, int val) {
        if (head == null)
            return null;
        if (val == head.data)
            return new Node(x, head);
        Node current = head;
        while (current != null) {
            if (current.next.data == val) {
                Node temp = new Node(x, current.next);
                current.next = temp;
                break;
            }
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // without ConvertLL method
        // Node head = new Node(arr.get(0));
        // head.next = new Node(arr.get(1));
        // head.next.next = new Node(arr.get(2));
        // head.next.next.next = new Node(arr.get(3));
        List<Integer> arr = Arrays.asList(12, 8, 1, 7);
        int val = 100;
        Node head = convertLL(arr);
        //Node output = insertAtHead(head, val);
        //Node output = insertAtTail(head, val);
        //Node output = insertAtKPosition(head, val, 8);
        Node output = insertBeforeGivenValue(head, val, 1);
        printAll(output);
    }
}
