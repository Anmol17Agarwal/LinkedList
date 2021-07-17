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
        sll.addLast(70);
        sll.addLast(50);
        sll.deleteFirst();
        sll.deleteLast();
        sll.insertNode(1,5);
        sll.insertNode(2,15);
        sll.display();
        System.out.println();
        sll.insertNode(7,70);
        sll.display();
        sll.deleteNode(5);

        System.out.println();
        sll.display();
        if(sll.find(30))
        {
            System.out.println("Search key found");
        }
        else {
            System.out.println("Search key is not found");
        }
        sll.head=sll.reverseList(sll.head);
        System.out.println("Reversed List = ");
        sll.display();

        SLL.ListNode nthNode=sll.nthNodeFromLast(2);
        System.out.println(nthNode.data);
        SLL.ListNode middleNode = sll.middleNode();
        System.out.println("Middle Node"+ middleNode.data);
    System.out.println("Length of LinkedList = "+sll.length());
    }
}
