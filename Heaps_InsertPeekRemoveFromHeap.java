import java.util.*;
public class Heaps_InsertPeekRemoveFromHeap {
    public static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();
        public void add(int data){//O(logn)
            arr.add(data);
            int childIdx=arr.size()-1;//at last element only we insert child
            int parentIdx=(childIdx-1)/2;
            while(arr.get(parentIdx)>arr.get(childIdx)){
             //swap
             int temp=arr.get(childIdx);
             arr.set(childIdx,arr.get(parentIdx));
             arr.set(parentIdx,temp);
             childIdx=parentIdx;
             parentIdx=(childIdx-1)/2;
             //update pointers
            }
        }
        public int peek(){//O(1)
            return arr.get(0);
        }
       
        public int remove(){//O(logn)
            int data=arr.get(0);
            //STEP 1 swap first and last element
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //STEP 2 remove last element
            arr.remove(arr.size()-1);
            //STEP 3 HEAPIFY TO FIX HEAP
            heapify(0);
            return data;

        }
        private void heapify(int i){
            int leftChild=(2*i)+1;
            int rightChild=(2*i)+2;
            int minIdx=i;//root is min value in min heap
            if(leftChild<arr.size() && arr.get(leftChild)<arr.get(minIdx)){
                minIdx=leftChild;
            }
            if(rightChild<arr.size() && arr.get(rightChild)<arr.get(minIdx)){
                minIdx=rightChild;
            }
            if(minIdx!=i){
                //swap
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);
                heapify(minIdx); //check all for entire tree
            }
           

        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String args[]){
        Heap pq=new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
    
}
