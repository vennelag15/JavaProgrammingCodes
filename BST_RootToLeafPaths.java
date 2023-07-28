import java.util.*;
public class BST_RootToLeafPaths {
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
    public static void printPath(ArrayList<Integer>paths){
        for(int i=0;i<paths.size();i++){
            System.out.print(paths.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void printRootToLeaf(Node root,ArrayList<Integer>paths){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){//leaf node
            printPath(paths);
         }
       paths.add(root.data);//add root to path first
       
       printRootToLeaf(root.left,paths);//adding paths
       printRootToLeaf(root.right,paths);
       paths.remove(paths.size()-1);//remove last element


    }
    public static void main(String args[]){
        int values[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
        root=insert(root,values[i]);
        }
        printRootToLeaf(root, new ArrayList<>());
        

    }
    
}
