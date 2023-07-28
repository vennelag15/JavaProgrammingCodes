public class Trees_DiameterOfTreeApproach1{
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
    public static int heightOfTree(Node root){
        if(root==null){
            return 0;

        }
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        int selfdiameter=leftHeight+rightHeight+1;
        int leftdiameter=diameter(root.left);
        int rightdiameter=diameter(root.right);
        return Math.max(selfdiameter,Math.max(leftdiameter,rightdiameter));
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diameter(root));
    

    }
}