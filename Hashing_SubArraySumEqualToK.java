import java.util.*;
public class Hashing_SubArraySumEqualToK {
    public static void main(String args[]){
        int arr[]={10,2,-2,-20,10};
        int K=-10;
        HashMap<Integer,Integer>map=new HashMap<>();
        //(sum,count)
        map.put(0,1);
        int sum=0,ans=0;
        for(int j=0;j<arr.length;j++){//0(n)
           sum+=arr[j];//sum(j)
          if(map.containsKey(sum-K)){
          ans+=map.get(sum-K);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
         
        }
        System.out.println(ans);
    }
    
}
