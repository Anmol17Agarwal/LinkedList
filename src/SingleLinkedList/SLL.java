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
            ListNode newNode = new ListNode(val);//create newNode and added value to it
            newNode.next=head;//joined newnode with head
            head=newNode;// newNode is updated to head
        }

        public  void addLast(int val)
        {
            ListNode newNode = new ListNode(val);//create newNode and added value to it
            if(head==null){//if head is empty
                head=newNode;//head will be newnode
            }
            ListNode current = head;//create reference point
            while (current.next!=null){//check if current.next is not equal to null
                current=current.next;//update current with current.next
            }
            current.next=newNode;//when loop will terminate i.e at tail,join curent.next to newNode
        }

        public ListNode deleteFirst()
        {
            if(head==null)//if head is empty
            {
                return null;//return head is empty
            }
            ListNode temp=head;//create reference point
            head=head.next;//update head with head.next
            temp.next=null;//disjoin temp with head and assign value to null
            return temp;// return linkedlist
        }

        public ListNode deleteLast()
        {
            if(head==null || head.next==null)//check if head is null and head.next is null
            {
                return head;//return head after deleting head.next
            }
            ListNode current = head;//create reference point
            ListNode previous = null;//create reference point
            while (current.next!=null)//check if current.next is not equal to null
            {
                previous=current;//update previous to current
                current=current.next;//update current with current.next
            }
            previous.next=null;//disjoin previous from current and assign value to null
            return current;//return linkedlist
        }

        public void insertNode(int position,int value)
        {
            ListNode node = new ListNode(value);
            if(position==1)
            {
                node.next=head;
                head=node;
            }
            else{
                ListNode previous = head;
                int count=1;
                if(count<position-1)
                {
                    previous=previous.next;
                    count++;
                }
                ListNode current=previous.next;
                node.next=current;
                previous.next=node;
            }
        }


        public void deleteNode(int position)
        {
            if(position==1)
            {
                head=head.next;
            }
            else
            {
                ListNode previous=head;
                int count=1;
                while (count<position-1)
                {
                    previous=previous.next;
                    count++;
                }
                ListNode current=previous.next;
                previous.next=current.next;
            }
        }

        public boolean find(int searchItem)
        {
            ListNode current=head;
            while (current.next!=null)
            {
                if(current.data==searchItem)
                {
                    return true;
                }
                current=current.next;
            }
            return false;
        }


    }


