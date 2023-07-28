import java.util.*;
public class BST_Merge2BSTs {
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
    public static Node createBST(ArrayList<Integer>arr,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBST(arr,start,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;
    }
   public static void getInorder(Node root,ArrayList<Integer>arr){
    if(root==null){
        return;
    }
    getInorder(root.left,arr);
    arr.add(root.data);
    getInorder(root.right,arr);
   }
    public static Node mergeBSTs(Node root1,Node root2){
        //inorder for root1
        ArrayList<Integer>inorder1=new ArrayList<>();
        getInorder(root1,inorder1);
        //inorder for root2
        ArrayList<Integer>inorder2=new ArrayList<>();
        getInorder(root2,inorder2);
        //merge both arraylists inorder 1 and inorder 2
        int i=0,j=0;
        ArrayList<Integer>finalArr=new ArrayList<>();
        while(i<inorder1.size() && j<inorder2.size()){
       if(inorder1.get(i)<=inorder2.get(j)){
        finalArr.add(inorder1.get(i));
        i++;
       }
       else{
        finalArr.add(inorder2.get(j));
        j++;
       }
        }
        while(i<inorder1.size()){
            finalArr.add(inorder1.get(i));
            i++;  
        }
    while(j<inorder2.size()){
        finalArr.add(inorder2.get(j));
        j++;
    }
    //sorted arraylist->balanced BST
    Node root=createBST(finalArr,0,finalArr.size()-1);
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
        //given BST1
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);
        //given BST2
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
       Node root=mergeBSTs(root1, root2);
       preorder(root);
       

        
    }
    
}
