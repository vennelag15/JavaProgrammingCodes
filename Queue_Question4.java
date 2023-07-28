import java.util.*;
public class Queue_Question4 {
    public static void reverseK(Queue<Integer>q,int k){
        int n=q.size();
        Stack<Integer>helper=new Stack<>();
        for(int i=0;i<k;i++){
          helper.push(q.remove());
        }
        while(!helper.isEmpty()){
          q.add(helper.pop());
        }
        for(int i=0;i<n-k;i++){
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
        q.remove();
        }
    }
    public static void main(String args[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90); 
        q.add(100); 
        int k=5;
        reverseK(q,k);

    }
    
}
