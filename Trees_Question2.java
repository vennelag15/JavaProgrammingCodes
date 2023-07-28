public class Trees_Question2 { 
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
public static void mirror(Node root){//own method(Method 1)
    if(root==null){
        return;}
        if(root.left!=null && root.right!=null){
            Node left=root.left;
            root.left=root.right;
            root.right=left;

        }
        mirror(root.left);
        mirror(root.right);
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node mirror2(Node root){//method 2 given
        if(root==null){
            return root;
        }
        Node Left=mirror2(root.left);
        Node Right=mirror2(root.right);
        root.left=Right;
        root.right=Left;
        return root;

    }
public static void main(String args[]){
    Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        preOrder(root);
        System.out.println();
       mirror(root);
    //mirror2(root);
    preOrder(root);
    

}   
}
