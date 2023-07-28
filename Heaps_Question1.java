import java.util.*;
public class Heaps_Question1{
    public static void main(String args[]){
        int arr[]={10, 20, 11, 70, 50, 40, 100, 5};
        int k=3;
        int ans[]=new int[arr.length];
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
              if(pq.size()<k){
                pq.add(arr[i]);
              }
              else{
                if(arr[i]>pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
              }
              if(pq.size()<k){
                ans[i]=-1;
              }
              else{
                ans[i]=pq.peek();
              }
        }

for(int i=0;i<ans.length;i++){
    System.out.print(ans[i]+" ");
}
    }

}