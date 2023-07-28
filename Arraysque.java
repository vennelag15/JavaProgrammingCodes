import java.util.*;

public class Arraysque {

public static int[] sortUsingKey(int[]arr,int key)
{int i=0;
    while(i>=0 && i<key && key<arr.length)
    {int temp=arr[i];
    arr[i]=arr[key];
    arr[key]=temp;
key++;
i++;}
return arr;
}    
public static void main(String args[])
{    int arrsize;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    arrsize=sc.nextInt();
    int arr[]=new int[arrsize];

    for(int i=0;i<arrsize;i++)
    {System.out.println("Enter the value of element "+ i+": ");
      int temp=sc.nextInt();
    if(temp>=100 || temp<-100)
    {System.out.println("Enter valid input between 100 and -100");}
    else
    {arr[i]=temp;}}   
    int key;
    System.out.println("Enter the value of key: ");
    key=sc.nextInt();
   sortUsingKey(arr,key);
   System.out.println("The final array after sorting using key:");
   for(int i=0;i<arr.length;i++)
   {System.out.print(arr[i]+" ");}
for(int i=0;i<10;i++){
  i*=2;
  System.out.println(i);
}

    }
    
}
