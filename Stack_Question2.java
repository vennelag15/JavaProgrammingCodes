import java.util.*;
public class Stack_Question2 {

    public static void simplifyPath(String str){
        Stack<String> st = new Stack<String>();
        int len_A = str.length();
        for (int i = 0; i < len_A; i++){
            String dir = "";
            while (i < len_A && str.charAt(i) != '/'){
                dir += str.charAt(i);
                i++;}
                if (dir.equals("..") == true){
                    if (!st.isEmpty())
                        st.pop();}
                    else if (dir.equals(".") == true)
                       continue;
                    else if (dir.length() != 0)
                        st.push(dir);}
String str1="";
while(!st.isEmpty()){
str1="/"+st.pop()+str1;
} 
if(str1.length()==0){
    str1="/";
}
    System.out.println(str1);}

public static void main(String args[]){
String str1="/apnacollege/";
String str2="/../";
simplifyPath(str1);
simplifyPath(str2);

    }
    
}
