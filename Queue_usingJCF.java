import java.util.*;
public class Queue_usingJCF{
    public static void main(String args[]){
//Queue<Integer>q=new LinkedList<>(); 
Queue<Integer>q=new ArrayDeque<>();
// as queue is interface its implemented using linked list and arraydeque
q.add(1);
q.add(2);
q.add(3);
while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove();
}
    }
}