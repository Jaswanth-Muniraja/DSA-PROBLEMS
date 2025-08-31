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

class addTwoNumbersInLLs{

    public static ListNode add_two_Numbers_in_Linked_Lists(ListNode List1, ListNode List2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        ListNode L1 = List1;
        ListNode L2 = List2;
        while(L1 != null || L2 != null){
            int val = (L1.data + L2.data) + carry;
            current.next = new ListNode(val%10);
            carry = val/10;
            L1 = L1.next;
            L2 = L2.next;
            current = current.next;
        }
        if(carry > 0){
            current.next = new ListNode(carry);
        }
        return dummy.next;
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
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);

        node1.next = node2;
        node2.next = node3;
        ListNode List1 = node1;

        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);

        node4.next = node5;
        node5.next = node6;
        ListNode List2 = node4;

        ListNode List3 = add_two_Numbers_in_Linked_Lists(List1,List2);
        print_Linked_List(List3);
    }
}