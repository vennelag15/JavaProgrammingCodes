public class DoubleLinkedLists {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
public static Node head;
public static Node tail;
public static int size=0;
//add
public void addFirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head.prev=newNode;
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
newNode.prev=tail;
tail=newNode;
}
//remove
public int removeFirst(){
    if(head==null){
        System.out.println("Linked list is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
    return val;}
    int val=head.data;
    head=head.next;
    head.prev=null;
    size--;
    return val;
}
public int removeLast(){
    if(head==null){
        System.out.println("lINKED List is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val=head.data;
        head=tail=null;
        return val;
    }
    int val=tail.data;
    Node temp=head;
    while(temp.next.next!=null){
        temp=temp.next;
    }
    tail.prev=null;
    temp.next=null;
    size--;
    return val;
}
public void reverse(){
    Node curr=tail=head;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;
    }
    head=prev;
}
//print
public void print(){
    Node temp=head;
while(temp!=null){
System.out.print(temp.data+" ");
temp=temp.next;
    }
    System.out.println();
}

public static void main(String args[]){
    DoubleLinkedLists dll=new DoubleLinkedLists();
dll.addFirst(3);
dll.addFirst(2);
dll.addFirst(1);
dll.print();
System.out.println(size);
dll.removeFirst();
dll.print();
System.out.println(size);
dll.addLast(4);
dll.addLast(5);
dll.print();
dll.removeLast();
dll.print();
dll.removeLast();
dll.print();
System.out.println(size);
dll.addFirst(4);
dll.addFirst(5);
dll.addFirst(6);
dll.print();
dll.reverse();
dll.print();
}
    
}
