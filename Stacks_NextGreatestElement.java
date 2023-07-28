import java.util.*;
public class Stacks_NextGreatestElement {
public static void main(String args[]){
    int arr[]={6,8,0,1,3};
    Stack<Integer>s =new Stack<>();
    int nextGreatest[]=new int[arr.length];
    for(int i=arr.length-1;i>=0;i--){
        //while loop
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
        }
        System.out.println(s);
        //if-else
        if(s.isEmpty()){
            nextGreatest[i]=-1;
        }
        else{
            nextGreatest[i]=arr[s.peek()];
        }
        //push
        s.push(i);
    }
    for(int i=0;i<nextGreatest.length;i++){
        System.out.print(nextGreatest[i]+" ");
    }
}
    
}
