public class BST_DeleteNode{
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
    public static Node insert(Node root,int val){//inserting values in BST
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

   public static Node delete(Node root,int val){
    if(root==null){
        System.out.println("VALUE TO BE DELETED NOT FOUND IN BST");
        return null;
    }
    //search the value first to delete
    if(val<root.data){
        root.left=delete(root.left,val);
    }
    else if(val >root.data){
        root.right=delete(root.right,val);
    }
    else{//where root.data==key called voila case
        //case 1-leaf node
        if(root.left==null && root.right==null){
            return null;
        }
        //case 2-single child
        if(root.left==null){
            return root.right;
        }
        if(root.right==null){
            return root.left;
        }
        //case 3-two children
        Node IS=findInorderSuccessor(root.right);//inorder successor is the leftmost node in the right subtree,so find in right subtree
        root.data=IS.data;//replace root with IS
        root.right=delete(root.right,IS.data);//delete the node with IS
    }
        
    return root;
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;//leftmost node 
        }
        return root;
    }

    public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
        root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        root=delete(root,5);
        inorder(root);
       
    }
}