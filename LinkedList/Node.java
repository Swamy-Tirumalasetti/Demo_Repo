public class Node {

    //1st example
    int data; // Data stored in the node
    Node next; // Reference to the next node in the linked list

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
    static Node convertLL(int arr[]) {
        // convert array to ll
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node x = new Node(arr[0]);
        Node y = x;
        System.out.println("X is: " + x.data + " Y is: " + y);
    }
}