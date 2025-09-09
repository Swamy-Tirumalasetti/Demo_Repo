public class DeleteDLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data1, Node next1, Node prev1) {
            this.data = data1;
            this.next = next1;
            this.prev = prev1;
        }

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
            this.prev = null;
        }

        Node(int data1) {
            this.data = data1;
            this.next = null;
            this.prev = null;
        }

        public Node() {
            data = 0;
            next = null;
            prev = null;
        }
    }

    static Node convertLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, mover);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void printAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static Node deleteHead(Node head) {
        if (head == null || head.next == null)
            return null;
        // return head.next; one line statement
        Node prev = head;
        head = head.next;
        head.prev = null;
        prev.next = null;
        return head;
    }

    static Node deleteTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node preTail = tail.prev;
        preTail.next = null;
        tail.prev = null;
        return head;
    }

    static Node deleteKPositionNode(Node head, int k) {
        if (head == null || head.next == null)
            return null;
        Node currNode = head;
        int cnt = 0;
        while (currNode != null) {
            cnt++;
            if (cnt == k)
                break;
            currNode = currNode.next;
        }
        Node preNode = currNode.prev;
        Node temp = currNode.next;

        if (preNode == null && temp == null)
            return null;
        else if (preNode == null)
            return deleteHead(head);  //seems not required
        else if (temp == null)
            return deleteTail(head);

        preNode.next = temp;
        temp.prev = preNode;
        currNode.next = null;
        currNode.prev = null;
        return head;
    }

    //Striver is saying the never ask querstion to delete head
    static Node deleteGivenNode(Node head) {
        Node preNode = head.prev;
        Node front = head.next;
        if (front == null) {
            preNode.next = null;
            head.prev = null;
            return head;
        }
        preNode.next = front;
        front.prev = preNode;

        head.next = head.prev = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 8 };
        Node head = convertLL(arr);
        // Node output = deleteHead(head);
        // Node output = deleteTail(head);
        //Node output = deleteKPositionNode(head, 4);
        Node output = deleteGivenNode(head.next.next);
        printAll(output);
    }
}