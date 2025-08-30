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

public class oddEvenLinkedList{

    public static ListNode odd_Even_Linked_List(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode oddHead = head;
        ListNode odd  = head;
        ListNode evenHead = head.next;
        ListNode even = head.next;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return oddHead;
    }

    public static void print_Linked_List(ListNode head){
        ListNode current = head;
        System.out.println("Linked List:");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        ListNode node5 = new ListNode(50);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = node1;
        System.out.println("Before oddEvenList");
        print_Linked_List(head);
        
        ListNode oddEvenList = odd_Even_Linked_List(head);
        System.out.println("After oddEvenList");
        print_Linked_List(oddEvenList);
    }
}
