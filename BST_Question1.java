public class BST_Question1 {
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
 public static int sum=0;
public static void rangesum(Node root,int L,int R){
    if(root==null){
        return ;
    }
    if(root.data>=L && root.data<=R){
       rangesum(root.left,L,R);
    sum+=root.data;
       rangesum(root.right,L,R);
  }
    if(root.data>R){
      rangesum(root.left,L,R);
    }
    else{
     rangesum(root.right,L,R);
    }
    
}
    public static void main(String args[]){
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(11);
        root.right.right=new Node(20);
        int L=11,R=15;
        rangesum(root,L,R);
         System.out.println(sum);

    }
    
}
