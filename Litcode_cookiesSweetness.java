import java.util.*;
public class Litcode_cookiesSweetness {
    public static void main(String args[]){
        int arr[]={2,7,3,6,4,6};int k=9;
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    for(int i=0;i<arr.length;i++){
        pq.add(arr[i]);
    }
    int a=-1;int count=0;
    while(!pq.isEmpty()){
if(pq.isEmpty()){
    System.out.println("-1");
    return;
}
    a=pq.remove();
    if(a>k){
        break;
    }
        int b=pq.remove();
    pq.add(a+(2*b));
    count++;
    }
    System.out.println(count);
    }
    
}
