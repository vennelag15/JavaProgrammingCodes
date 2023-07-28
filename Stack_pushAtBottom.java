import java.util.*;
public class Stack_pushAtBottom{
public static void pushAtBottom(Stack<Integer>s,int data){
    if(s.isEmpty()){
        s.push(data);
        return;
    }
    int top=s.pop();//removing while moving up
    pushAtBottom(s,data);
    s.push(top);//adding while moving down

}
public static void main(String args[]){
Stack<Integer>s=new Stack<>();
s.push(1);
s.push(2);
s.push(3);
pushAtBottom(s,4);
while(!s.isEmpty()){
    System.out.println(s.pop());
}
}
}