public class QuickSort {

    public static void printArr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
         System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
//last element is pivot and partition gives its index
int pivotindex=partition(arr,si,ei);
quicksort(arr,si,pivotindex-1);//left part
quicksort(arr,pivotindex+1,ei);//right part
    }
public static int partition(int arr[],int si,int ei){
    int pivot=arr[ei];
    int i=si-1;//to make place for elements smaller than pivot
    for(int j=si;j<ei;j++){
        if(arr[j]<=pivot){
         i++;// for all elements
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
        }
    }
// to bring pivot in the correct place
    i++;
    int temp=arr[i];
    arr[i]=arr[ei];
    arr[ei]=temp;
return i;
}
    public static void main(String args[]){
  int arr[]={6,3,9,8,2,5};
quicksort(arr,0,arr.length-1);
printArr(arr);
    }
    
}
