public class Trees_LowestCommonAncestorApproach2 {
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
    public static Node lca(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){//root itself is n1 and n2
         return root;
        }
        Node leftLca=lca(root.left,n1,n2);
        Node rightLca=lca(root.right,n1,n2);

        //leftLca valid rightLca=null
        if(rightLca==null){
            return leftLca;
        }
        if(leftLca==null){
            return rightLca;
        }
        //n1 in left subtree and n2 in right subtree
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
        int n1=4,n2=6;
        System.out.println(lca(root,n1,n2).data);
    }
    
}
