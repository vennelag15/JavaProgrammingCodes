import java.util.*;
public class BST_Question3 {
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
    public static void getInorder(Node root,ArrayList<Integer>arr){
        if(root==null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static int kthsmallestElement(Node root,int k){
       //inorder traversal
       ArrayList<Integer>inorder=new ArrayList<>();
       getInorder(root,inorder);
       return inorder.get(k-1);

    }
    public static void main(String args[]){
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(11);
        root.right.right=new Node(20);
        int K=3;
        System.out.println(kthsmallestElement(root,K));

    }
    
    
}
