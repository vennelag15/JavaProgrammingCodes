
public class Arrays {

    public static int func(int[] arr1,int pos)
    {int start=0;int end=arr1.length;
        while(start>end)
    {int mid=(start+end)/2;
    if(arr1[mid]==pos)
    {return mid;}
    else if(pos<arr1[mid])
        {start=mid+1;}
    else
    {start=mid+1;}

    }
return -1;}
    public static void main(String args[])
    {int arr[]={4,5,6,7,0,1,2};
    int target=3;
    int index=func(arr,target);
    System.out.println(index);

    }
    
}
