package SingleLinkedList;
/*
*Creating single LinkedList.
*Creating display method to print list.
*inserting default value.
 */
public class SLL extends Main
{

    protected ListNode head; //initializing head as first element of LinkedList
    static class ListNode //Define ListNode
    {

        protected int data; //initialise data as int type
        protected ListNode next; // initialise next to linked with next node

        public ListNode(int data) //constructor of listNode taking integer value as data
        {
            this.data = data; // updating the value of data everytime
            this.next = null;
        }
    }

        public void display() // create display method to rpint linkedlist
        {
            ListNode current = head; // initialise current and store head as first value of SLL
            while(current!=null) //loop till current is not equal to null
            {
                System.out.print(current.data+" --> "); //print statement
                current=current.next; // updating current node using next
            }
            System.out.print("null");
        }


        public int length()// create length method
        {
            int count=0; // initizalise count
            ListNode current = head;
            if(current == null) // check if head is null return length as zero
            {
                 return 0;
            }
            while(current!=null)
            {
                    count++;
                    current = current.next;
            }
            return count;
        }

        public void addFirst(int val)
        {
            ListNode newNode = new ListNode(val);
            newNode.next=head;
            head=newNode;
        }

        public  void addLast(int val)
        {
            ListNode newNode = new ListNode(val);
            if(head==null){
                head=newNode;
            }
            ListNode current = head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }

        public ListNode deleteFirst()
        {
            if(head==null)
            {
                return null;
            }
            ListNode temp=head;
            head=head.next;
            temp.next=null;
            return temp;

        }


    }


