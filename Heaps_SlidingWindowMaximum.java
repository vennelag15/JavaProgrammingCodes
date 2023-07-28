import java.util.*;
public class Heaps_SlidingWindowMaximum {
    //to store numbers and index also ,we store it in class
    public static class Pair implements Comparable<Pair>{
        int val;
        int idx;
        public Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.val-this.val;//sorts in descending order as we want sliding window maximum
        }
    }
    public static void main(String args[]){
    int arr[]={1,3,-1,-3,5,3,6,7};
    int k=3;//window size
    int n=arr.length;
    int res[]=new int[n-k+1];

    PriorityQueue<Pair>pq=new PriorityQueue<>();

    //1st window elements store
    for(int i=0;i<k;i++){
        pq.add(new Pair(arr[i],i));
    }
    res[0]=pq.peek().val;

    //for remaining elements
    for(int i=k;i<n;i++){
        while(pq.size()>0 && pq.peek().idx<=i-k){//element of prev window
            pq.remove();

        }
        pq.add(new Pair(arr[i],i));
        res[i-k+1]=pq.peek().val;
    }

    for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
    }
    }
    
}
