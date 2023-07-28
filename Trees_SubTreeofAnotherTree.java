public class Trees_SubTreeofAnotherTree{
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
    public static boolean isIdentical(Node node,Node subroot){
        //check non identical condition
        if(node==null && subroot==null){
            return true;
        }
        else if(node== null || subroot==null || node.data!=subroot.data){
            return false;
        }
        //non identical left subtree
        if(!isIdentical(node.left,subroot.left)){
            return false;

        }
        if(!isIdentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubTree(Node root,Node subroot){
        if(root==null){//if child of leaf ,then it is not subroot,so return false
            return false;
        }
        //find subroot in tree
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
       //than using two variables to store isSubTree(root.left) and isSubTree( root.right)
       //better to write as below as according to || rules, states that if first condition true then it doesnt check in right itself
        //found in left,then return true or found in right,then true
        return isSubTree(root.left,subroot)||isSubTree(root.right,subroot);
    }
    public static void main(String args[]){
        //tree
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        //subtree
        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        System.out.println(isSubTree(root,subroot));
}}