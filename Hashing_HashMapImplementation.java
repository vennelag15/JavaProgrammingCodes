import java.util.*;

public class Hashing_HashMapImplementation {
    public static class HashMap<K,V>{//generics-K,V can be of any data type(int,boolean,string,anything)
     private class Node{
       K key;
       V value;

       public Node(K key,V value){
        this.key=key;
        this.value=value;
       }

     }
     private int n ; //number of nodes n
     private int N;
     private LinkedList<Node>buckets[];//bucket similar to private int arr[];
     //size of buckets=number of buckets N

     @SuppressWarnings("unchecked")
     public HashMap(){//constructor
        this.N=4;
        this.buckets=new LinkedList[4];
        for(int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>();
        }

     }
     private int hashFunction(K key){
        int hc=key.hashCode();
        //1234567 //-1234566
        return (Math.abs(hc))%N;//gives value between 0 to size-1


     }
    private int searchInLinkedList(K key,int bi){
        LinkedList<Node>ll=buckets[bi];
        int di=0;
        for(int i=0;i<ll.size();i++){
            Node node=ll.get(i);
            if(node.key==key){
                 return di;

            }
            di++;
        }
        return -1;

    }

    private void rehash(){
        LinkedList<Node>oldBucket[]=buckets;
        buckets=new LinkedList[2*N];
        N=2*N;
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();
        }
        //nodes->add in new bucket
        for(int i=0;i<oldBucket.length;i++){
            LinkedList<Node>ll=oldBucket[i];//in each bucket traversing in the linkedlist
            for(int j=0;j<ll.size();j++){
                 Node node=ll.remove();
                 put(node.key,node.value);
            }
        }

    }
     public void put(K key,V value){//0(lambda)->0(1)
       int bucketIndex= hashFunction(key);//0 to size-1
       int dataIndex=searchInLinkedList(key,bucketIndex);//node where key doesnt exist then dataIndex is -1(invalid) or where key found is valid Index
       if(dataIndex!=-1){//update value
        Node node=buckets[bucketIndex].get(dataIndex);
        node.value=value;
       }//in bucket bi and inside bucket at di index 
       else{
        buckets[bucketIndex].add(new Node(key,value));
        n++;
       } 
       double lambda=(double)n/N;
       if(lambda>2.0){//if lambda>k(constant threshold value)
//rehashing
rehash();
       }



       }


     
     public boolean containsKey(K key){//0(1)
         int bucketIndex= hashFunction(key);//0 to size-1
       int dataIndex=searchInLinkedList(key,bucketIndex);//node where key doesnt exist then dataIndex is -1(invalid) or where key found is valid Index
       if(dataIndex!=-1){//key exists
        return true;
       }//in bucket bi and inside bucket at di index 
       else{//key doesnt exist
       return false;
       } 
     }
     public V remove(K key){//0(1)
         int bucketIndex= hashFunction(key);//0 to size-1
       int dataIndex=searchInLinkedList(key,bucketIndex);//node where key doesnt exist then dataIndex is -1(invalid) or where key found is valid Index
       if(dataIndex!=-1){//update value
        Node node=buckets[bucketIndex].remove(dataIndex);
        n--;
        return node.value;
       }//in bucket bi and inside bucket at di index 
       else{
        return null;
       } 
     }
     public V get(K key){//0(1)
        int bucketIndex= hashFunction(key);//0 to size-1
       int dataIndex=searchInLinkedList(key,bucketIndex);//node where key doesnt exist then dataIndex is -1(invalid) or where key found is valid Index
       if(dataIndex!=-1){//get the value
        Node node=buckets[bucketIndex].get(dataIndex);
        return node.value;
       }//in bucket bi and inside bucket at di index 
       else{
        return null;
       } 
     }
     public ArrayList<K>keySet(){//0(1)
        ArrayList<K>keys=new ArrayList<>();
        for(int i=0;i<buckets.length;i++){
          LinkedList<Node>ll=buckets[i];
          for(Node node:ll){
            keys.add(node.key);
          }
        }
        return keys;
     }

     public boolean isEmpty(){
      return n==0;
     }
    }

    
    public static void main(String args[]){
        
      HashMap<String,Integer>hm=new HashMap<>();
      hm.put("India",100);
      hm.put("China",150);
      hm.put("US",50);
      hm.put("Nepal",5);
      ArrayList<String>keys=hm.keySet();
      for(String k:keys){
       System.out.println(k);
      }
      System.out.println(hm.get("China"));
      System.out.println(hm.remove("China"));
      System.out.println(hm.get("China"));


    }
    
}
