import java.util.*;
public class Queue_Question2 {
    public static void minCost(int arr[]){
        PriorityQueue<Integer>q=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }
        int res=0;
        while(q.size()>1){
         int first=q.remove();
         int second=q.remove();
         res+=first+second;
         q.add(first+second);
        }
        System.out.println(res);
        
        }
    public static void main(String args[]){
        int arr[]={4,3,2,6};
        minCost(arr);
    }
    
}
