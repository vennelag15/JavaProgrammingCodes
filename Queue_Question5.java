import java.util.*;
public class Queue_Question5{
	public static void maxSubArray(int arr[],int k){
		Deque<Integer>q=new LinkedList<>();//double ended queue
		int i;int n=arr.length;
		for(i=0;i<k;i++){
			while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]){
				q.removeLast();
			}
			q.addLast(i);
		}
		
	  for(i=k;i<n;i++){
		System.out.print(arr[q.peek()]+" ");
		while(!q.isEmpty() && q.peek()<=i-k){
			q.removeFirst();
		}
		while(!q.isEmpty() && arr[i]>=arr[q.peekLast()]){
			q.removeLast();
		}
		q.addLast(i);

	  }
	  System.out.print(arr[q.peek()]);
	  System.out.println();

	}
	public static void main(String args[]){
		int arr[]={1,2,3,1,4,5,2,3,6};
		int k=3;
		maxSubArray(arr,k);
	}
}