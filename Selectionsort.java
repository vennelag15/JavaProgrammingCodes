import java.util.Collections;
import java.util.Arrays;
public class Selectionsort {

/*public static void sorting(int[]arr1)
{for(int i=0;i<arr1.length-1;i++)//n-1 rounds
{int minpos=i;
    for(int j=i+1;j<arr1.length;j++)//first i elements already sorted 
{if(arr1[minpos]>arr1[j])
{minpos=j;}
}
int temp=arr1[minpos];
arr1[minpos]=arr1[i];
arr1[i]=temp;

}
for(int i=0;i<arr1.length;i++)
{System.out.print(arr1[i]+" ");}}*/
public static void main(String args[])
{Integer arr[]={5,4,1,3,2};
Arrays.sort(arr,Collections.reverseOrder());
for(int i=0;i<arr.length;i++)
{System.out.print(arr[i]+" ");}
/* 
sorting(arr);*/}
}