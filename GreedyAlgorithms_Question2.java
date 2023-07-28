public class GreedyAlgorithms_Question2 {
    public static int KthOdd(int arr[],int K){
        if(K<=0){
return 0;
        }
        int left=arr[0];
        int right=arr[1];
        if((right & 1)>0){//odd number case
            int Count=(int)Math.ceil((right-left+1)/2);
            if(K>Count){
return 0;
            }
            else{
                return (right-2*K+2);
            }

        }
        else{//even number case
            int Count=(int)((right-left+1)/2);
            if(K>Count){
                return 0;
            }
            else{
                return (right-2*K+1);
            }

        }
    }
    public static void main(String args[]){
        int arr[]={-3,3};int K=2;
        System.out.println(KthOdd(arr,K));
    }
    
}
