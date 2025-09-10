

public class InsertDLL {
    public static class Node {
        public int data;
        public Node next;
        public Node back;

        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }

        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }

        public Node(int data1, Node x) {
            data = data1;
            next = x;
            back = null;
        }
        
        public Node() {
            data = 0;
            next = null;
            back = null;
        }
    }

    static Node convertDLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
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

    static Node insertAtHead(Node head, int val) {
        Node newHead = new Node(val,head);
        head.back = newHead;
        return newHead;
    }

    static Node insertBeforeTail(Node head, int val) {
        Node temp = new Node(val);
        if(head == null) return temp;
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
        return head;
    }

    static Node insertAtPositionK(Node head, int val,int k) {
        if(head==null) return new Node(val);
        if(k == 1) return new Node(val,head);
        int cnt = 0; Node current = head;
        while (current != null) {
            cnt++;
            if(cnt == k-1){
                Node temp = new Node(val,current.next,current);
                current.next = temp;
                break;
            }
            current = current.next;
        }
        return head;
    }

    static Node insertBeforeValue(Node head, int x,int val) {
        if(head==null) return new Node(x,head);
        if(val == head.data) return new Node(x,head);
        Node current = head;
        Node preNode = null;
        while (current != null) {
            if(val == current.data){
                Node temp = new Node(x,current,preNode);
                preNode.next = temp;
                break;
            }
            preNode = current;
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        Node head = convertDLL(arr);
       // Node output = insertAtHead(head, 14);
        //Node output = insertBeforeTail(head, 14);
        Node output = insertAtPositionK(head, 14,3);
        //Node output = insertBeforeValue(head, 14,6);
        printAll(output);

    }

}
