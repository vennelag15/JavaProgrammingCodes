public class Countingsort {
    public static void counting(int arr[])
    {int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {largest=Math.max(arr[i],largest);
    }
    int count[]=new int[largest+1];//0 to largest
    for(int i=0;i<arr.length;i++)
    {count[arr[i]]++;}
    for(int i=0;i<count.length;i++)
{System.out.print(count[i]+" ");}
System.out.println();
    //sorting
    int j=0;
    for(int i=0;i<count.length;i++)
    {while(count[i]>0)
    {arr[j]=i;
    j++;
     count[i]--;}}
    
    for(int i=0;i<arr.length;i++)
{System.out.print(arr[i]+" ");}}
    public static void main(String args[])
    {int arr[]={1,4,1,3,2,4,3,7};

counting(arr);}
    
}
