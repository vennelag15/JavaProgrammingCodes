import java.util.*;
public class Heaps_Question2 {
    public static void main(String args[]){
        int arr[]={2,6};
        int k=2;
        int N=6;
        boolean visited[]=new boolean[N+1];
        Queue<Integer>q=new LinkedList<>();
        int time=0;
        //add given array elements into queue and visited
        for(int i=0;i<arr.length;i++){
          q.add(arr[i]);
          visited[arr[i]]=true;
        }
        while(q.size()>0){
            for(int i=0;i<q.size();i++){
               int curr=q.remove();
               if(curr-1>=1 && !visited[curr-1]){//checking prev empty 
                q.add(curr-1);
                visited[curr-1]=true;
               }
               if(curr+1<=N && !visited[curr+1]){//checking next empty
                q.add(curr+1);
                visited[curr+1]=true;
               }

            }
            time++;

        }
        System.out.println("Time="+(time-1));//because for last element also q gets executed then time++,so decrease time by 1

    }
    
}
