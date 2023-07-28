import java.util.*;
public class stackUsingArrayList{
    public static class Stack{
        static ArrayList<Integer>list=new ArrayList<Integer>();
        //isEmpty
        public static boolean isEmpty(){
            return list.size()==0;
        }
       //push
       public static void push(){
        list.add(1);
        list.add(2);
        list.add(3);
       }
       //pop
       public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
       }
       //peek
       public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
       }
    
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push();
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}