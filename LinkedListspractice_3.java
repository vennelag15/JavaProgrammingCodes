import java.util.*;
public class LinkedListspractice_3 {
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

public static void swap(int x,int y){
    if(x==y){
        return;
    }
    Node prevX=null;Node currX=head;
    while(currX.data!=x && currX!=null){
prevX=currX;
currX=currX.next;
    }
    Node prevY=null;Node currY=head;
    while(currY!=null && currY.data!=y){
        prevY=currY;
        currY=currY.next;
    }
    if(currX==null || currY==null){
        return;
    }
    if(prevX!=null){
        prevX.next=currY;
    }
    else{
        head=currY;
    }
    if(prevY!=null){
        prevY.next=currX;
    }
    else{
        head=currX;
    }
    Node temp=currX.next;
    currX.next=currY.next;
    currY.next=temp;
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
    LinkedListspractice_3 ll=new LinkedListspractice_3();
    head=new Node(1);
    head.next=new Node(2);
    head.next.next=new Node(3);
    head.next.next.next=new Node(4);
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    swap(x,y);
    print();
}
    
}
