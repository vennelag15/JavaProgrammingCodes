import java.util.*;
public class Queue_using2Stacks {
    public static class Queue{
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        public boolean isEmpty(){
            return s1.isEmpty();//in s2 we dont store any element permanently,so s1 if empty means entire queue is empty
        }
        public void add(int data){//0(n)-time complexity
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public int remove(){//0(1)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
        public int peek(){//0(1)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
            
        }
    }
    public static void main(String args[]){
Queue q=new Queue();
q.add(1);
q.add(2);
q.add(3);
while(!q.isEmpty()){
System.out.println(q.peek());
q.remove();
}

    }
    
}
