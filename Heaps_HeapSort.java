public class Heaps_HeapSort{
    private static void heapify(int i,int size,int arr[]){
      int leftChild=(2*i)+1;
      int rightChild=(2*i)+2;
      int maxIdx=i;
      if(leftChild<size && arr[leftChild]>arr[maxIdx]){
        maxIdx=leftChild;
      }
      if(rightChild<size && arr[rightChild]>arr[maxIdx]){
        maxIdx=rightChild;
      }
      if(maxIdx!=i){
    //swap
    int temp=arr[i];
    arr[i]=arr[maxIdx];
    arr[maxIdx]=temp;
    heapify(maxIdx,size,arr);
      }

    }
    public static void HeapSort(int arr[]){
        //step 1-Build max heap to sort in ascending order
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
           heapify(i,n,arr);
        }
        //step 2 swap first and last element and again fix heap
        for(int i=n-1;i>=0;i--){
            //swap
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(0,i,arr);
        }
       

    }
    public static void main(String args[]){
        int arr[]={4,5,1,3,2};
        HeapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}