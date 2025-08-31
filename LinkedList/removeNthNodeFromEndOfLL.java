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

public class removeNthNodeFromEndOfLL {

    public static ListNode remove_Nth_From_End(ListNode head, int n){
        if(head == null) return head;
        int length = 0;
        ListNode temp = head;
        while(temp != null){ 
            temp = temp.next; 
            length++;
        }
        if(length == n){
           return head.next;
        }
        int replace = length-n;
        temp = head;
        while(replace > 1){
            temp = temp.next;
            replace--;
        }
        temp.next = temp.next.next;
        return head;
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
        System.out.println("Before removing the Nth Node from End");
        print_Linked_List(head);

        int n = 2;
        head = remove_Nth_From_End(head, n);
        System.out.println("After removing the Nth Node from End");
        print_Linked_List(head);
    }
}
