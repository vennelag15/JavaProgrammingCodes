import java.util.*;
public class Trees_KthLevelOfTreeIteration {
    public static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static void KthLevel(Node root,int K){
        Queue<Node>q=new LinkedList<>();
        int level=1;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }
                
                else{
                    level++;
                    q.add(null);
                }

            }
            else{
                if(level==K){
                    System.out.print(curr.data+" ");
                    }
                if(curr.left!=null){
                    q.add(curr.left);
                }  
                if(curr.right!=null){
                    q.add(curr.right);
                }  
            }

            
        }

    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        KthLevel(root, 3);

    }
    
}
