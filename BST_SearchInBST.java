public class BST_SearchInBST {
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
    public static Node insert(Node root,int val){//inserting values in binary search tree
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
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(key==root.data){
            return true;
        }
        if(key<root.data){
            return search(root.left,key);//given answer by searchin in root.left, we return
        }
        else{
            return search(root.right,key);
        }
    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        if(search(root,1)){
            System.out.println("FOUND");
        }
        else{
            System.out.println("NOT FOUND");
        }

    }
    
}
