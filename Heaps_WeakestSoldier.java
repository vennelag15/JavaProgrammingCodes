import java.util.*;
public class Heaps_WeakestSoldier {
    public static class Soldier implements Comparable<Soldier>{
        int val;
        int idx;
        public Soldier(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Soldier s2){
            if(this.val-s2.val==0){
             return this.idx-s2.idx;//ascending order of index
            }
            else{
                return this.val-s2.val;//ascending order of value                  
        }
       
    }}
    public static void main(String args[]){
        int arr[]={1000,1111,1000,1000};int k=2;
        PriorityQueue<Soldier>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(new Soldier(arr[i],i));
        }
        for(int i=0;i<k;i++){
            System.out.println("row"+pq.remove().idx);
        }
    }}