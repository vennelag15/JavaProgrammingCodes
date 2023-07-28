public class LinkedLists {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
    }

    public void addInMiddle(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){//returns deleted data of removed head node
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;

    }
    public int removeLast(){
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=tail.data;
            head=tail=null;
            size=size-1;
            return val;
        }
        //prev=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
         prev=prev.next;
        }
        int val=prev.next.data;
       prev.next=null;
       tail=prev;
        size--;
        return val;
    }
    public int iterativeSearch(int key){
       Node temp=head;
       int i=0;
       while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;
       }
       return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
         return  -1;  
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
         return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head,key);
    }
    public void reverseLinkedList(){
        Node prev=null;
        Node curr=tail=head;//head value is stored in curr and tail last element reversed 
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;//because curr=null then its previous is head after reversing
    }
    public void deleteNthFromEnd(int n){
    int size1=0;
    Node temp=head;
    while(temp!=null){
    temp=temp.next;
    size1++;
    }
   if(n==size1){
    head=head.next;
    return;
   }
   //size1-n
   Node prev=head;int i=1;
   while(i<size1-n){
    prev=prev.next;
    i++;
   }
   prev.next=prev.next.next;
    }
    public Node findmidNode(Node head){//Slow-fast approach
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
               slow=slow.next;//+1
               fast=fast.next.next;//+2
        }
        return slow;//slow is midnode
    }
    public boolean checkPalindrome(){
        //base case
        if(head==null || head.next==null){
            return true;
        }
        //step 1-find midnode
          Node midNode=findmidNode(head);
          //step2-reverse 2nd half
          Node prev=null;
          Node curr=midNode;
          Node next;
          while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
          }
          Node right=prev;//right half head
          Node left=head;//left half head
          //step3-compare left and right halves
          while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
          }
          return true;
        }
    public static void main(String args[]){
        LinkedLists ll=new LinkedLists();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addInMiddle(2, 9);
        ll.print();
        System.out.println(size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println("Index of key= "+ll.iterativeSearch(3));
        System.out.println("Index of key= "+ll.recursiveSearch(3));
    ll.reverseLinkedList();
    ll.print();
    ll.deleteNthFromEnd(2);
    ll.print();
    ll.addLast(1);
    ll.addLast(2);
    ll.print();
    System.out.println(ll.checkPalindrome());
    }

    }

