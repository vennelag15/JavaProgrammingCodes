import java.util.*;
public class Litcode_migratoryBirds{
    public static void main(String args[]){
        int arr[]={1,1,2,3,3};
TreeMap<Integer,Integer>map=new TreeMap<>();
for(int i=0;i<arr.length;i++){
    if(!map.containsKey(arr[i])){
        map.put(arr[i],1);
    }
    else{
        map.put(arr[i],map.get(arr[i])+1);
    }
}
int max=Integer.MIN_VALUE;int ans=-1;
for(Integer s:map.keySet()){
int val=map.get(s);
if(val>max){
    max=val;
    ans=s;
}
}

System.out.println(ans);
    }
}