import java.util.*;

public class Stack_Question3{
    public static String decode(String str){
        Stack<Integer>intStack=new Stack<>();
        Stack<Character>charStack=new Stack<>();
        String res="";String temp="";
        for(int i=0;i<str.length();i++){
           int count=0;
           char ch=str.charAt(i);
           if(Character.isDigit(str.charAt(i))){
            while(Character.isDigit(str.charAt(i))){
                count=count*10+str.charAt(i)-'0';
                i++;
            }
            i--;
            intStack.push(count);
           }
           else if(ch=='['){
            if(Character.isDigit(str.charAt(i-1))){
                charStack.push(str.charAt(i));
            }
            else{
                intStack.push(1);
                charStack.push(str.charAt(i));
            }
           }
          
           else if(ch==']'){
            count=0;
            temp="";
            if(!intStack.isEmpty()){
             count=intStack.peek();
             intStack.pop();}
             while(!charStack.isEmpty() && charStack.peek()!='['){
                temp=charStack.peek()+temp;
                charStack.pop();
             }
             if(!charStack.isEmpty() && charStack.peek()=='['){
                charStack.pop();
             }
             for(int j=0;j<count;j++){
               res=temp+res;
             }
             for(int k=0;k<res.length();k++){
                charStack.push(res.charAt(k));
             }
             res="";
           }
           
           else{
            charStack.push(str.charAt(i));
           }
        
        }
        while(!charStack.isEmpty()){
            res=charStack.peek()+res;
            charStack.pop();
        }
        return res;
    }
    public static void main(String args[]){
        String str1="2[cv]";
        String str2="3[b2[v]]";
        System.out.println(decode(str1));
        System.out.println(decode(str2));
    }
}