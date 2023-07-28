public class Tries_PrefixProblem {
    public static class Node{
        Node children[]=new Node[26];
        boolean endOfWord=false;
        int freq;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            freq=1;
        }
    }
    public static Node root=new Node();
    
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();// by constructor, freq=1 is intialized
            }
            else{
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.endOfWord=true;
    }
    public static void findPrefix(Node root,String ans){
        if(root.freq==1){
                System.out.println(ans);
                return;
            }

        for(int i=0;i<root.children.length;i++){
            
            if(root.children[i]!=null){
            findPrefix(root.children[i],ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String args[]){
        String arr[]={"zebra","dog","duck","dove"};
        //create a trie
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        root.freq=-1;
        findPrefix(root,"");

    }
    
}
