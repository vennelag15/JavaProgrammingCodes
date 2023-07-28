public class Recursion2 {
    public static boolean checkArraySorted(int arr[],int i){
   
        if(i==(arr.length-1)){//base case
      return true;
     }
     if(arr[i]>arr[i+1]){
        return false;
    }

    return checkArraySorted(arr,i+1);
     
    }
    public static int firstOccurrence(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
if(arr[i]==key){
    return i;}
    return firstOccurrence(arr,key,i+1);

    }
    public static int lastOccurrence(int arr[],int key,int i){
        if(i==arr.length-1){//base case
            return -1;
        }
        int isFound=lastOccurrence(arr,key,i+1);
        if(isFound==-1 && arr[i]==key ){//traversed entire and found at other position
            return i;
        }

        return isFound;//traversed but found at only one position
    }
    public static void main(String args[]){
      int arr[]={1,2,3,4,5};
      int arr1[]={8,3,6,9,5,10,2,3};
      if(checkArraySorted(arr,0)==true){
        System.out.println("Array is sorted");
      }
      else{
        System.out.println("Array is not sorted");
      }
      System.out.println(firstOccurrence(arr1, 100, 0));
      System.out.println(lastOccurrence(arr1, 5,0));
      


    }
    
}
