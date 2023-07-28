public class ZigZagLinkedLists {
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
    public void addLast(int data){
        Node newNode=new Node(data);
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
    public void zizzag(){
        //find midnode
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
        }
        Node mid=slow;
        //2nd half ko reverse
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;Node right=prev;
        Node nextL;Node nextR;
        //alternate merging
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
        left=nextL;//updation
        right=nextR;
        }
    }
    public static void main(String args[]){
        ZigZagLinkedLists zzl=new ZigZagLinkedLists();
        zzl.addLast(1);
        zzl.addLast(2);
        zzl.addLast(3);
        zzl.addLast(4);
        zzl.addLast(5);
        zzl.addLast(6);
        zzl.print();
       zzl.zizzag();
       zzl.print();
    }
    
}
