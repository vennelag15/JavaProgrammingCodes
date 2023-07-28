public class BST_Question2 {
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
    public static int min=-1,min_difference=Integer.MAX_VALUE;
    public static void closestElement(Node root,int k){
        if(root==null){
            return;
        }
        if(root.data==k){
          min=root.data;
          return;
        }
        if(min_difference>Math.abs(root.data-k)){
            min_difference=Math.abs(root.data-k);
          min=root.data;

        }
        if(root.data<k){
            closestElement(root.right,k);
            
        }
        else{
           closestElement(root.left,k);
           
           
        }
    }
    public static void main(String args[]){
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(11);
        root.right.right=new Node(20);
        int K=13;
        closestElement(root,K);
        System.out.println(min);

    }
    
}
