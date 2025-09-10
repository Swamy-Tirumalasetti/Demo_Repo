public class PalindromeLL {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data1, ListNode next1) {
            this.data = data1;
            this.next = next1;
        }

        ListNode(int data1) {
            this.data = data1;
            this.next = null;
        }
    }

    static ListNode convertLL(int arr[]) {
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static ListNode reverseLL(ListNode newHead) {
        if (newHead == null || newHead.next == null)
            return newHead;
        ListNode temp = newHead;
        ListNode prev = null;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    // Recursive approach
    // static ListNode reverseLL(ListNode head) {
    // if (head == null || head.next == null)
    // return head;
    // ListNode newHead = reverseLL(head.next);
    // ListNode front = head.next;
    // front.next = head;
    // head.next = null;
    // return newHead;
    // }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = reverseLL(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        boolean result = true;
        while (second != null) {
            if (second.data != first.data) {
                result = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        slow.next = reverseLL(newHead); // Restore the original list
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1 };
        ListNode head = convertLL(arr);
        printLL(head);
        boolean output = isPalindrome(head);
        System.out.println(output);
    }
}
