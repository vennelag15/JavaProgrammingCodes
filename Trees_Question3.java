public class Trees_Question3 {
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
    public static Node deleteX(Node root,int x){
        if(root==null){
            return null;
        }
       
    root.left=deleteX(root.left,x);//here automatically the returned values gets assigned to root.left and root.right
root.right=deleteX(root.right,x);
        if(root.left==null && root.right==null && root.data==x){
            return null;
    
        }
        return root;//if no change we return same value
        
        
       
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        Node root=new Node(1);
            root.left=new Node(3);
            root.left.left=new Node(3);
            root.left.right=new Node(2);
            root.right=new Node(3);
            int x=3;
            preOrder(root);
            System.out.println();
            deleteX(root,x);
            preOrder(root);

           
        
    
    }   
    
}
