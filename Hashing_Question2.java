import java.util.*;
public class Hashing_Question2 {
    public static void main(String args[]){
        int arr[]={2,7,11,15};
        int target=9;
        int ans[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int j=0;j<arr.length;j++){
            int diff=target-arr[j];
            if(map.containsKey(diff)){
                ans=new int[]{map.get(diff),j};
                break;
            }
            map.put(arr[j],j);
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    
}
