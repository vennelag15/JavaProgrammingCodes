public class Trees_Question1 {
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
    public static boolean univalue(Node root){
        if(root==null){
           return true; 
        }
        if(root.left!=null && root.data!=root.left.data){
            return false;
        }
        if(root.right!=null && root.data!=root.right.data){
            return false;
        }
    
      return univalue(root.left)& univalue(root.right);

            
        }
     public static boolean univalue2(Node root,int data){
       if(root==null){
        return true;
       }
       if(root.data!=data){
        return false;
       }
       return univalue2(root.left,data) && univalue2(root.right,data);
     }
    
    public static void main(String args[]){
        Node root=new Node(2);
        root.left=new Node(2);
        root.left.left=new Node(5);
        root.left.right=new Node(2);
        root.right=new Node(2);
        int data=root.data;
        System.out.println(univalue(root));
        System.out.println(univalue2(root,data));
    }
    
}
