import java.util.*;
public class Litcode_PairsDivisibleByK {
    public static void main(String args[]){
        int arr[]={2,2,1,7,5,3};
        int k=4;
        int freq[]=new int[4];
        for(int i=0;i<arr.length;i++){
            ++freq[arr[i]%k];
        }
        int ans=0;
        ans+=freq[0]*(freq[0]-1)/2;// for 0
        for(int i=1;i<=k/2 && i!=(k-i);i++){
           ans+=freq[i]*freq[k-i];
        }
        if(k%2==0){
            ans+=freq[k/2]*(freq[k/2]-1)/2;
        }
System.out.println(ans);
    }
}
