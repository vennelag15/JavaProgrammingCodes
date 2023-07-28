public class Trees_Question5 {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int res=Integer.MIN_VALUE;
    public static int maxPathSum(Node root){
        if(root==null){
            return 0;
        }
      int l=maxPathSum(root.left);
      int r=maxPathSum(root.right);
      int max1=Math.max(Math.max(l,r)+root.data,root.data);//maximum of left ,maximum of right 
      int max2=Math.max(max1,l+r+root.data);//l+r+root.data is entire path from left,root,right
      res=Math.max(res,max2);//final result
      return max1;//return to next level the maximum of left or right child value

    }
    
    public static void main(String args[]){

        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
       maxPathSum(root);
       System.out.println(res);
        
    }
    
}
