
public class SortLinkedLL {
    public static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node convertLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void PrintList(Node head) {
        Node curr = head;
        for (; curr != null; curr = curr.next)
            System.out.print(curr.data + " -> ");
        System.out.println("null");
    }

    static Node sortLL(Node head) {
        if (head == null || head.next == null)
            return head;
        Node middle = finfMiddleNode(head);
        Node leftHead = head, rightHead = middle.next;
        middle.next = null;
        leftHead = sortLL(leftHead);
        rightHead = sortLL(rightHead);
        return merge2(leftHead, rightHead);
    }

    static Node finfMiddleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node fast = head.next;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static Node merge2(Node left, Node right) {
        Node head = new Node(-1), temp = head;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if (left != null) {
            temp.next = left;
        } else
            temp.next = right;
        return head.next;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 4, 1 };
        Node head = convertLL(arr);
        System.out.print("Original Linked List: ");
        PrintList(head);

        Node sortedHead = sortLL(head);

        System.out.print("Sorted Linked List: ");
        PrintList(sortedHead);
    }
}
