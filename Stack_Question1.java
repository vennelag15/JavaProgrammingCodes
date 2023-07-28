import java.util.*;
public class Stack_Question1{
    public static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static boolean isPalindrome(){
        Stack<Character>s1=new Stack<>();
        Node temp=head;
        //entering elements from linked list to stack
        while(temp!=null){
            s1.push(temp.data);
            temp=temp.next;
        }
        Node temp1=head;
        while(temp1!=null){
            char ch=s1.pop();
            if(ch!=temp1.data){
return false;
            }
            temp1=temp1.next;
}

return true;
    }

    public static void main(String args[]){
        Stack_Question1 s=new Stack_Question1();
         head=new Node('A');
         head.next=new Node('B');
         head.next.next=new Node('C');
         head.next.next.next=new Node('B');
         head.next.next.next.next=new Node('A');
         System.out.println(isPalindrome());
    }
}
