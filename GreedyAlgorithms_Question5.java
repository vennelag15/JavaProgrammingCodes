
public class GreedyAlgorithms_Question5{
    public static int ans=1000000000;
    public static void solve(int arr[],int N,int K,int index,int sum,int maxSum){
        if(K==1){
            maxSum=Math.max(sum,maxSum);
            sum=0;
            for(int i=index;i<N;i++){
sum+=arr[i];
            }
            maxSum=Math.max(sum,maxSum);
            ans=Math.min(ans,maxSum);
            return;
            
        }

        sum=0;
        for(int i=index;i<N;i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            solve(arr,N,K-1,i+1,sum,maxSum);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4};int K=3;int N=arr.length;
        solve(arr,N,K,0,0,0);
        System.out.println(ans);


    }
}