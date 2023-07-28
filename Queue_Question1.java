import java.util.*;
public class Queue_Question1 {
    
    public static void binarytillN(int N){
Queue<String>q=new LinkedList<>();
q.add("1");
while(N-- >0){
    String s1=q.peek();
    q.remove();
    System.out.println(s1);
    String s2=s1;
    q.add(s1+"0");
    q.add(s2+"1");
}

    }
    public static void main(String args[]){
        int N=10;
       binarytillN(N);    }
}
