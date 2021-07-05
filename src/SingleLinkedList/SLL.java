package SingleLinkedList;
/*
*Creating single LinkedList.
*Creating display method to print list.
*inserting default value.
 */
public class SLL
{
    private ListNode head; //initializing head as first element of LinkedList
    private static class ListNode { //Define ListNode

        private int data;//initialise data as int type
        private ListNode next;// initialise next to linked with next node

        public ListNode(int data) {//constructor of listNode taking integer value as data
            this.data = data;// updating the value of data everytime
            this.next = null;
        }
    }

        public void display()// create display method to rpint linkedlist
        {
            ListNode current = head;// initialise current and store head as first value of SLL
            while(current!=null)//loop till current is not equal to null
            {
                System.out.print(current.data+" --> ");//print statement
                current=current.next;// updating current node using next
            }
            System.out.print("null");
        }

        public static void main(String[] args)
        {
            SLL sll = new SLL();// create object
            ListNode first = new ListNode(10);// default value of first element
            ListNode second = new ListNode(20);// default value of second element
            ListNode third = new ListNode(30);// default value of third element
            ListNode fourth = new ListNode(40);// default value of fourth element

            sll.head = first;//storing first value as head
            first.next = second;//linking node using next
            second.next = third;//linking node using next
            third.next = fourth;//linking node using next

            sll.display();
    }
    }


