import java.util.*;
public class Stack_reverseString {
    public static void reverseAString(Stack<Character>s,String str){
    for(int i=0;i<str.length();i++){//adding characters to stack
        s.push(str.charAt(i));
    }
    StringBuilder result=new StringBuilder("");
    while(!s.isEmpty()){
        char curr=s.pop();
        result.append(curr);
    }
    str=result.toString();
    System.out.println(str);
    }
    public static void main(String args[]){
      Stack<Character>s=new Stack<>();
      reverseAString(s,"Hello World");

    }
    
}
