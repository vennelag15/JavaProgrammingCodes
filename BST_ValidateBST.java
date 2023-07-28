public class BST_ValidateBST {
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
        public static class Info2{
            int min;
            int max;
            boolean isBST;
            public Info2(boolean isBST,int min,int max){
                this.isBST=isBST;
                this.min=min;
                this.max=max;
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
        public static boolean isvalidBST(Node root,Node min,Node max){
         if(root==null){//no node BST
            return true;
         }
         if(min!=null && root.data<=min.data){
return false;
         }
         else if(max!=null && root.data>=max.data){
            return false;
         }
         //analyse left subtree nodes and right subtree
         return isvalidBST(root.left,min,root) && isvalidBST(root.right,root,max);

        }
        public static Info2 isValidBST2(Node root){
            if(root==null){
                return new Info2(true,Integer.MAX_VALUE,Integer.MIN_VALUE);
            }
            Info2 leftInfo=isValidBST2(root.left);
            Info2 rightInfo=isValidBST2(root.right);
            int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
            int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
            if(root.data<=leftInfo.max || root.data>=rightInfo.min ){
                return new Info2(false,min,max);
            }
            if(leftInfo.isBST && rightInfo.isBST){
                return new Info2(true,min,max);
            }
            return new Info2(false,min,max);

        }
       
        public static void main(String args[]){
            int values[]={8,5,3,6,10,11,14};

            Node root=null;
            for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
            }
            if(isvalidBST(root, null, null)){
                System.out.println("VALID");
            }
            else{
                System.out.println("INVALID");
            }
            Info2 info=isValidBST2(root);
            System.out.println(info.isBST);
           
            
    
        }

    
}
