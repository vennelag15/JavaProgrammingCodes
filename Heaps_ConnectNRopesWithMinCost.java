import java.util.*;
public class Heaps_ConnectNRopesWithMinCost {
    public static void main(String args[]){
        int ropes[]={2,3,3,4,6};
        
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int totalCost=0;
        while(pq.size()>1){
            int min1=pq.remove();
            int min2=pq.remove();
            totalCost+=min1+min2;
            pq.add(min1+min2);

        }
        System.out.println(totalCost);
    }
    
}
