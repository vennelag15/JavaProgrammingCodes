import java.util.*;
public class BST_Question4 {
    public static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isFound(Node root,int num){
        if(root==null){
            return false;
        }
        if(root.data==num){
            return true;
        }
        if(num<root.data){
            return isFound(root.left,num);
        }
        else{
            return  isFound(root.right,num);
        }
        
    }
    public static int count=0;
    public static void sum2BSTs(Node root1,Node root2,int x){//O(n*h) where n is number of nodes in one tree and h is height of another tree
        if(root1==null || root2==null){
            return;
        }
        int num1=root1.data;
        int num2=x-num1;
        //searching for num2 in BST2
        if(isFound(root2,num2)){
            count++;
            System.out.print("("+num1+","+num2+") , ");
        }
       sum2BSTs(root1.left,root2,x);
       sum2BSTs(root1.right,root2,x);
        
    }
    public static int sum2BSTs2(Node root1,Node root2,int x){
        if(root1==null||root2==null){
            return 0;
        }
        int count=0;Node top1,top2;
        Stack<Node>st1=new Stack<>();
        Stack<Node>st2=new Stack<>();
        while(true){
            while(root1!=null){
              st1.push(root1);
              root1=root1.left;
            }
            while(root2!=null){
                st2.push(root2);
                root2=root2.right;

            }
            if(st1.isEmpty() || st2.isEmpty()){
                break;
            }
        top1=st1.peek();
        top2=st2.peek();
           
           if(top1.data+top2.data==x){
            count++;
            st1.pop();
            st2.pop();
            root1=top1.right;
            root2=top2.left;
           }
           else if(top1.data+top2.data<x){
            st1.pop();
            root1=top1.right;
           }
           else{
            st2.pop();
            root2=top2.left;
           }
        }
        return count;
    }
    public static void main(String args[]){
        //BST1
        Node root1=new Node(5);
        root1.left=new Node(3);
        root1.left.left=new Node(2);
        root1.left.right=new Node(4);
        root1.right=new Node(7);
        root1.right.left=new Node(6);
        root1.right.right=new Node(8);
        
        //BST2
        Node root2=new Node(10);
        root2.left=new Node(6);
        root2.left.left=new Node(3);
        root2.left.right=new Node(8);
        root2.right=new Node(15);
        root2.right.left=new Node(11);
        root2.right.right=new Node(18);

        int x=16;
       
        sum2BSTs(root1,root2,x);
        System.out.println("The number of pairs = "+count);
        System.out.println(sum2BSTs2(root1,root2,x));
        

    }
}
