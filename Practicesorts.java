public class Practicesorts {
public static void bubblesort(int[]arr)
{for(int i=0;i<arr.length-1;i++)
    {for(int j=0;j<arr.length-i-1;j++)
        {if(arr[j]<arr[j+1])
        {int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;}}
    }
for(int i=0;i<arr.length;i++)
{System.out.print(arr[i]+" ");}
System.out.println();
}

public static void selectionsort(int[]arr)
{
for(int i=0;i<arr.length-1;i++)
{int maxpos=i;
    for(int j=i;j<arr.length-1;j++)
    {if(arr[j]>arr[maxpos])
    {maxpos=j;}}
int temp=arr[i];
arr[i]=arr[maxpos];
arr[maxpos]=temp;
}    
for(int i=0;i<arr.length;i++)
{System.out.print(arr[i]+" ");}
System.out.println();
}
public static void insertionsort(int[]arr)
{for(int i=1;i<arr.length;i++)
{int curr=arr[i];
int prev=i-1;
while(prev>=0 && curr>=arr[prev])
{arr[prev+1]=arr[prev];
prev--;}
arr[prev+1]=curr;}
for(int i=0;i<arr.length;i++)
{System.out.print(arr[i]+" ");}
System.out.println();}

public static void countingsort(int[]arr)
{int largest=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{largest=Math.max(largest,arr[i]);}
int count[]=new int[largest+1];
for(int i=0;i<arr.length;i++)
{count[arr[i]]++;}
int j=0;
for(int i=count.length-1;i>=0;i--)
{while(count[i]>0)
{arr[j]=i;
j++;
count[i]--;}}
for(int i=0;i<arr.length;i++)
{System.out.print(arr[i]+" ");}
System.out.println();
}
public static void main(String args[])
{int arr[]={3,6,2,1,8,7,4,5,3,1};
bubblesort(arr);
selectionsort(arr);
insertionsort(arr);
countingsort(arr);
}
    
}
