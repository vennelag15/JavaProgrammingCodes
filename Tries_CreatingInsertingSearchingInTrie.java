public class Tries_CreatingInsertingSearchingInTrie{
    public static class Node{
        Node children[]=new Node[26];
        boolean endOfWord=false;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();//empty always

    public static void insert(String word){//0(L)
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.endOfWord=true;
    }

    public static boolean search(String key){//0(L)
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;//key doesnt exist
            }
            curr=curr.children[idx];
        }
        return curr.endOfWord==true;//check if entire word exists or only part of word exists which is part of another word
    }
    public static void main(String args[]){
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("any"));
        System.out.println(search("an"));//an exists but not as seperate word so returned false


    }
}