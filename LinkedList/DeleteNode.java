
class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class DeleteNode {

    static Node convertLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void printAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;
        return head.next;
    }

    public static Node deleteTail(Node head) {
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteNodeOnPositionK(Node head, int k) {
        if (head == null || k == 1)
            return head.next;
        int cnt = 0;
        Node temp = head;
        Node previous = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                previous.next = previous.next.next;
                break;
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node deleteNodeBasedOnValue(Node head, int val) {
        if (head == null || val == head.data)
            return null;
        Node temp = head;
        Node previous = null;
        while (temp != null) {
            if (temp.data == val) {
                previous.next = previous.next.next;
                break;
            }
            previous = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 9 };
        Node head = convertLL(arr);
        // Node output = deleteHead(head);
        // Node output = deleteTail(head);
        //Node output = deleteNodeOnPositionK(head, 3);
        Node output = deleteNodeBasedOnValue(head, 9);
        printAll(output);
    }

}
// Time cpxy O(k) k depends on the element