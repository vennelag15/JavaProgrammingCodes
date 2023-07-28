public class Tries_WordBreak {
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
    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.endOfWord==true;
    }
    public static boolean wordBreak(String key){//0(L)
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            //substring (beginning idx,last idx)
            if((search(key.substring(0,i))) && (wordBreak(key.substring(i)))){
                return true;

            }
        }
        return false;
    }
    public static void main(String args[]){
     String words[]={"i","like","sam","samsung","mobile","ice"};
     String key="ilikesamsung";
     for(int i=0;i<words.length;i++){//create a trie
        insert(words[i]);
     }
      System.out.println(wordBreak(key));
    }
    
}
