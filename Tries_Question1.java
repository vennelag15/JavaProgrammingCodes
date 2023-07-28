import java.util.*;

public class Tries_Question1 {
    public static class Node{
        LinkedHashSet<String>data;
        Node children[]=new Node[26];
        boolean endOfWord=false;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            data=new LinkedHashSet<>();
        }

    }
    public static Node root=new Node();
    public static ArrayList<String>finalAns=new ArrayList<>();
    public static void insert(String word){
     Node curr=root;
     char[]arr=word.toCharArray();
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
        int idx=arr[i]-'a';
        if(curr.children[idx]==null){
            curr.children[idx]=new Node();
        }
        curr=curr.children[idx];
     }
     curr.endOfWord=true;
     curr.data.add(word);
    }

public static void depthFirstSearch(Node root){
  if(root.endOfWord==true){
        finalAns.addAll(root.data);
    }

    for(int i=0;i<26;i++){
      
        if(root.children[i]!=null){
            depthFirstSearch(root.children[i]);
        }

    }
    
}
    public static void main(String args[]){
        String strs[]={"eat","tea","tan","ate","nat","bat"};
        for(int i=0;i<strs.length;i++){
            insert(strs[i]);
        }
        depthFirstSearch(root);
        System.out.println(finalAns);

    }
    
}
