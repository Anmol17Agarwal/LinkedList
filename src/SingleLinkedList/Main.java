package SingleLinkedList;

public class Main {
    public static void main(String[] args)
    {
        SLL sll = new SLL(); // create object
        SLL.ListNode first = new SLL.ListNode(10); // default value of first element
        SLL.ListNode second = new SLL.ListNode(20); // default value of second element
        SLL.ListNode third = new SLL.ListNode(30); // default value of third element
        SLL.ListNode fourth = new SLL.ListNode(40); // default value of fourth element

        sll.head = first; //storing first value as head
        first.next = second; //linking node using next
        second.next = third; //linking node using next
        third.next = fourth; //linking node using next
        sll.addFirst(5);
        sll.addLast(50);
        sll.display();
        System.out.println();
        System.out.println("Length of LinkedList = "+sll.length());
    }
}
