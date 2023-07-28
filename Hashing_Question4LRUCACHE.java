import java.util.*;
public class Hashing_Question4LRUCACHE{
    public static class LRUcache<K,V>{
        private class Node{
         K key;
         V val;
         public Node(K key,V val){
            this.key=key;
            this.val=val;
         }
        }
       public int n;
       public int N;
       public LinkedList<Node>buckets[];
       public LRUcache(){
        this.N=4;
        this.buckets=new LinkedList[N];
        for(int i=0;i<N;i++){
            buckets[i]=new LinkedList<>();
        }
       }
       public int hashFunction(K key){
        int num=key.hashCode();
        return Math.abs(num)%N;
       }
       public int search(K key,int bi){
        LinkedList<Node>ll=buckets[bi];
        for(int i=0;i<ll.size();i++){
            if(ll.get(i).key==key){
                return i;
            }
        }
        return -1;
       }
       public void reHash(){
        LinkedList<Node>oldBucket[]=buckets;
        N=2*N;
        buckets=new LinkedList[N];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();
        }
        for(int i=0;i<oldBucket.length;i++){
            LinkedList<Node>ll=oldBucket[i];
            for(int j=0;j<buckets.length;j++){
            Node node=ll.remove();
           put(node.key,node.val);
            }
        }

       }
       public void put(K key,V val){
        int bi=hashFunction(key);
        int di=search(key,bi);
        if(di!=-1){
    Node node=buckets[bi].get(di);
      node.val=val;

        }
        else{
         buckets[bi].add(new Node(key,val));
         n++;
        }
    int lambda=n/N;
    if(lambda>2){
        reHash();
    }
    
    }
    public V get(K key){
     int bi=hashFunction(key);
        int di=search(key,bi);
        if(di!=-1){
    Node node=buckets[bi].get(di);
    return  node.val;

        }
        else{
        return null;
        }
    }
    }
    public static void main(String args[]){
   LRUcache<String,Integer>hm=new LRUcache<>();
      hm.put("India",100);
      hm.put("China",150);
      hm.put("US",50);
      hm.put("Nepal",5);
     
      System.out.println(hm.get("China"));
     
    }
}