import java.util.*;
public class LinkedListPracticeQuestions {
   public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
   }
   public void print(){
 Node temp=head;
 while(temp!=null){
    System.out.print(temp.data+" ");
    temp=temp.next;
 }
 System.out.println();
 Node temp1=head1;
 while(temp1!=null){
    System.out.print(temp1.data+" ");
    temp1=temp1.next;
 }
 System.out.println();
   }
   public static Node head;
   public static Node tail;
   public static Node head1;
   public int intersectionNode(){
    Node temp=head;
    while(temp!=null){
      Node temp1=head1;
        while(temp1!=null){
          if(temp==temp1){
           
            return temp.data;
          }
          temp1=temp1.next;
        }
        temp=temp.next;
        
    }
    return -1;
   }
   
   public static void question3(int key1,int key2,Node head2){
    //traverse to find keys
    Node temp=head2;Node index1=null;Node index2=null;
    while(temp!=null && (index1==null && index2==null)){
      if(temp.data==key1){
        index1=temp;
      }
      else if(temp.data==key2){
        index2=temp;
      }
      temp=temp.next;
    }
   Node curr1=head2;Node next1=index1;
   Node curr2=head2;Node next2=index2;
   while(curr2!=null){
    if(curr2.next==index2){
      

    }
   }
    
   }
   public static void main(String args[]){
    LinkedListPracticeQuestions llp=new LinkedListPracticeQuestions();
    head=new Node(1);
    head.next=new Node(2);
    head.next.next=new Node(3);
   head.next.next.next=new Node(6);
   head.next.next.next.next=tail=new Node(7);
   head1=new Node(4);
   head1.next=new Node(5);
   Node helper=head1.next.next=head.next.next.next;
   helper.next=tail;
   llp.print();
    System.out.println(llp.intersectionNode());
    Node head2=new Node(1);
head2.next=new Node(2);
head2.next.next=new Node(3);
head2.next.next.next=new Node(4);
question3(2,4,head2);
   }
}
