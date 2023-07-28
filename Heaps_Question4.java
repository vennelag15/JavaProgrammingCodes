import java.util.*;
public class Heaps_Question4 {
    public static void main(String args[]){
        int arr[]={1,5,8,19};
        int initialSum=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<arr.length;i++ ){
           initialSum+=arr[i];
           pq.add(arr[i]);
        }
        int finalSum=initialSum/2;
        int currSum=initialSum;
        int countOperations=0;
        while(currSum>finalSum){
            //remove peek element and add half of it
            int max=pq.remove();
            currSum-=(max/2);
            pq.add(max/2);
            countOperations++;

        }
        System.out.println(countOperations);

        

    }
    
}
