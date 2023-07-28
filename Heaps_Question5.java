import java.util.*;

public class Heaps_Question5{
    public static class Node{
      int data;
      Node next;
      public Node(int data){
        this.data=data;
       this.next=null;
      }

    }
   public class NodeComparator implements Comparator<Node>{
      public int compare(Node k1,Node k2){
        if(k1.data>k2.data){
          return 1;
        }
        else if(k1.data<k2.data){
          return -1;
        }
        return 0;
      }
    }
    public static Node mergeLists(Node arr[],int n){
      PriorityQueue<Node>queue=new PriorityQueue<>(new NodeComparator());
      Node a[]=new Node[n];
      Node head=new Node(0);
      Node last=head;
      for(int i=0;i<n;i++){
        if(arr[i]!=null){
          queue.add(arr[i]);
        }
      }
      if(queue.isEmpty()){
        return null;
      }
      while(!queue.isEmpty()){
        Node curr=queue.poll();
        last.next=curr;
        last=last.next;
        if(curr.next!=null){
          queue.add(curr.next);
        }
      }
      return head.next;
    }
    public static void print(Node node){
      while(node!=null){
        System.out.print(node.data+"->");
        node=node.next;
      }
      System.out.println("NULL");
    }
public static void main(String args[]){
  int n=3,k=3;
  Node a[]=new Node[n];
   Node head1=new Node(1);
   a[0]=head1;
   head1.next=new Node(3);
    head1.next.next=new Node(7);
Node head2=new Node(2);
a[1]=head2;
    head2.next=new Node(4);
    head2.next.next=new Node(8);
   Node head3=new Node(9);
   a[2]=head3;
   head3.next=new Node(10);
    head3.next.next=new Node(11);
    Node res=mergeLists(a,n);
    while(res!=null){
      print(res);
    }


}
}