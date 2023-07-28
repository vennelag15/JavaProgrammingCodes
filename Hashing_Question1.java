import java.util.*;
public class Hashing_Question1 {
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
    public static class Info{
        int hd;
        Node node;
        public Info(int hd,Node node){
            this.hd=hd;
            this.node=node;
        }
    }
  

public static void main(String args[]){
Node root=new Node(20);
root.left=new Node(8);
root.right=new Node(22);
root.left.left=new Node(5);
root.left.right=new Node(3);
root.left.right.left=new Node(10);
root.left.right.right=new Node(14);
root.right.right=new Node(25);
Queue<Info>q=new LinkedList<>();
q.add(new Info(0,root));
q.add(null);
HashMap<Integer,Node>map=new HashMap<>();
int min=0,max=0;
while(!q.isEmpty()){
    Info currInfo=q.remove();
    if(currInfo ==null){
     if(q.isEmpty()){
        break;
     }
     else{
        q.add(null);
     }
    }
    else{
        map.put(currInfo.hd,currInfo.node);
        if(currInfo.node.left!=null){
            q.add(new Info(currInfo.hd-1,currInfo.node.left));
            min=Math.min(min,currInfo.hd-1);
        }
        if(currInfo.node.right!=null){
            q.add(new Info(currInfo.hd+1,currInfo.node.right));
            max=Math.max(max,currInfo.hd+1);
        }
        
    }

}
for(int i=min;i<=max;i++){
    System.out.print(map.get(i).data+"->");
}



}
}
