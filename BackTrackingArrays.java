public class BackTrackingArrays {
    public static void changeArray(int arr[],int i,int value){
    //base case
   if(i==arr.length){
    printArr(arr);
    return;
   }

    //kaam
    arr[i]=value;
    changeArray(arr,i+1,value+1);
    arr[i]=arr[i]-2;//while returning this line will execute
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        changeArray(arr,0,1);
        printArr(arr);
    }
    
}
