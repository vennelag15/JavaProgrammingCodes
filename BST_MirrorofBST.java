public class BST_MirrorofBST {
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
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftMirror=mirror(root.left);
        Node rightMirror=mirror(root.right);
        root.left=rightMirror;
        root.right=leftMirror;
        return root;
    }
    public static void preorder(Node root){
if(root==null){
    return;
}
System.out.print(root.data+" ");
preorder(root.left);
preorder(root.right);
    }
    public static void main(String args[]){
        //create a BST
        Node root=new Node(8);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right=new Node(10);
        root.right.right=new Node(11);
        preorder(root);
        mirror(root);
        System.out.println();
        preorder(root);
    }
    
}
