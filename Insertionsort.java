public class Insertionsort {

    public static void sorting(int[]arr1)
    {for(int i=1;i<arr1.length;i++)//n-1 rounds
        {int curr=arr1[i];
            int prev=i-1;
            //finding correct position to insert
            while(prev>=0 && arr1[prev]>curr)
            {arr1[prev+1]=arr1[prev];//creating spaces for correct element
            prev--;}
            //insertion
            arr1[prev+1]=curr;

        }
    for(int i=0;i<arr1.length;i++)
    {System.out.print(arr1[i]+" " );}

    }
    public static void main(String args[])
    {int arr[]={5,4,1,3,2};
    sorting(arr);
}
    
}
