public class Tries_UniqueSubstrings {
    public static class Node{
        Node children[]=new Node[26];
        boolean endOfWord=false;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
    for(int i=0;i<word.length();i++){
        int idx=word.charAt(i)-'a';
        if(curr.children[idx]==null){
            curr.children[idx]=new Node();
        }
        curr=curr.children[idx];

    }
curr.endOfWord=true;
    }
public static int countNodes(Node root){
    if(root==null){
        return 0;
    }
    int count=0;

    for(int i=0;i<26;i++){
     if(root.children[i]!=null){
        count+=countNodes(root.children[i]);
     }
    }
    return count+1;
}

    public static void main(String args[]){
        String s="ababa";
        //suffix->insert in trie
        for(int i=0;i<s.length();i++){
            String suffix=s.substring(i);//i to s.length
             insert(suffix);

        }
        System.out.println(countNodes(root));


    }
    
}
