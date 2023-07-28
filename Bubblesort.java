public class Bubblesort {

    public static void sorting(int[]arr1)//in best case time complexity=n^2 and in worst case time complexity=n^2
    {for(int turn=0;turn<arr1.length-1;turn++)
        {for(int j=0;j<arr1.length-1-turn;j++)//ignore already sorted elements at end
        {if(arr1[j]>arr1[j+1])
        {int temp=arr1[j+1];
        arr1[j+1]=arr1[j];
        arr1[j]=temp;}}
        }
     for(int i=0;i<arr1.length;i++)
     {System.out.print(arr1[i]+" ");}
    }
    public static void optimisedbubblesort(int arr[]){//in best case time complexity=n and in worst case time complexity=n^2
        for(int i=0;i<arr.length-1;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-1-i;j++){
             if(arr[j]>arr[j+1]){
                int temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
             }
            }
            if(swap==false){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); 
        }
    }
    public static void main(String args[])
    {int arr[]={5,4,1,3,2};
sorting(arr);
System.out.println();
optimisedbubblesort(arr);
}
    
}
