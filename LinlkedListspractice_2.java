import java.util.*;

public class LinlkedListspractice_2 {
  public static  class Node{
    Node next;
    int data;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
  }  
  public static Node head;
  public static Node tail;

  public static void skipMDeleteN(int M,int N){
Node curr=head,t;
int count;
while(curr!=null){
    for(count=0;count<M-1 && curr!=null;count++){
        curr=curr.next;
    }
    if(curr==null){
        return;
    }
    t=curr.next;
    for(count=0;count<N-1 && t!=null;count++){
    Node temp=t;
    t=t.next;
    }
    t=t.next;
    curr.next=t;
    curr=t;
}
}

 public static void print(){
Node temp=head;
while(temp!=null){
    System.out.print(temp.data+"->");
    temp=temp.next;
}
System.out.println();
 }  
public static void main(String args[]){
    LinlkedListspractice_2 ll=new LinlkedListspractice_2();
    head=new Node(1);
    head.next=new Node(2);
    head.next.next=new Node(3);
    head.next.next.next=new Node(4);
    head.next.next.next.next=new Node(5);
    head.next.next.next.next.next=new Node(6);
    head.next.next.next.next.next.next=new Node(7);
    head.next.next.next.next.next.next.next=new Node(8);
    head.next.next.next.next.next.next.next.next=new Node(9);
    head.next.next.next.next.next.next.next.next.next=new Node(10);
    Scanner sc=new Scanner(System.in);
    int M=sc.nextInt();
    int N=sc.nextInt();
    skipMDeleteN(M, N);
    print();


}
}
