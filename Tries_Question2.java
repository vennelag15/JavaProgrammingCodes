public class Tries_Question2 {
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
    public static String finalAns="";
    public static void longestWord(Node root,StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].endOfWord==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>finalAns.length()){//longest word
                    finalAns=temp.toString();
                }
                longestWord(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }

        }
    }
    public static void main(String args[]){
String words[]={"a","banana","app","appl","ap","apply","apple"};
for(int i=0;i<words.length;i++){
    insert(words[i]);
}
longestWord(root,new StringBuilder(""));
System.out.println(finalAns);



    }
    
}
