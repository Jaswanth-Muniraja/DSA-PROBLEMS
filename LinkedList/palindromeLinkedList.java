class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class palindromeLinkedList{

     public static void print_Linked_List(ListNode head){
        ListNode current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static ListNode reverse_Linked_List(ListNode head) {
        ListNode node = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }
        return node;
    }

    public static boolean is_palindrome_Linked_List(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newNode = reverse_Linked_List(slow.next);
        ListNode secondList = newNode;
        ListNode firstList = head;
        while(secondList != null){
            if(firstList.data != secondList.data) return false;
            firstList = firstList.next;
            secondList = secondList.next;
        }
        slow.next = reverse_Linked_List(newNode);
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(20);
        ListNode node5 = new ListNode(10);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = node1;

        if(is_palindrome_Linked_List(head)){
            System.out.println("Yes, The given Linked List is a palindrome");
        }else{
            System.out.println("No, The given Linked List is not a palindrome");
            
        }
            ListNode temp = reverse_Linked_List(head);
        print_Linked_List(temp);
    }
}