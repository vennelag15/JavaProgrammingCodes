public class DivideAndConquerPractice {
    public static void printArr(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void mergesort(String arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    int mid=si+((ei-si)/2);
    mergesort(arr,si,mid);
    mergesort(arr,mid+1,ei);
    merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int i=si;int j=mid+1;int k=0;
        while(i<=mid && j<=ei){
           if(((int)arr[i].charAt(i))<(((int)arr[j].charAt(j)))){
              temp[k]=arr[i];
              i++;
              k++;
           }
           else if(((int)arr[i].charAt(i))==(((int)arr[j].charAt(j)))){
             i++;
             j++;
           }
           else{
            temp[k]=arr[j];
            j++;
            k++;
           }

           }
           while(i<=mid){
            temp[k++]=arr[i++];
           }
           while(j<=ei){
            temp[k++]=arr[j++];
           }
           for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
           }
        }
        public static int majorityElementBruteForce(int nums[]){
    
           for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                return nums[i];
            }
           }
           return -1;
        }
        
        public static int majorityElementDivideAndConquer(int nums[],int si,int ei){
            if(si==ei){return nums[si];}//one element is present
         int mid=si+((ei-si)/2);
         int left=majorityElementDivideAndConquer(nums,si,mid);
         int right=majorityElementDivideAndConquer(nums,mid+1,ei);
         if(right==left){
            return right;
         }
    int leftcount=countInRange(nums,left,si,ei);
    int rightcount=countInRange(nums,right,si,ei);
    return leftcount>rightcount ? left:right;
        }
        public static int countInRange(int nums[],int num,int si,int ei){
            int count=0;
            for(int i=si;i<=ei;i++){
                if(nums[i]==num){
                    count++;
                }
            }return count;
                    }


    public static int InversionCountBruteForce(int arr1[]){
        int count=0;
        for(int i=0;i<arr1.length;i++){
             for(int j=i+1;j<arr1.length;j++){
            if(arr1[i]>arr1[j]){
              count++;
            }}
        
        }return count;
    }                
    public static int InversionCountDivideAndConquer(int arr1[],int si,int ei){
       if(si>=ei){
        return 0;
       }
        
        int inversion=0;
        int mid=si+((ei-si)/2);
        
           int inversionleft=InversionCountDivideAndConquer(arr1,si,mid);
           int inversionright=  InversionCountDivideAndConquer(arr1,mid+1,ei);
           int inversionmerge=merge(arr1,si,mid,ei);
           inversion=inversionleft+inversionright+inversionmerge;
    
        return inversion;
    }  
    public static int merge(int arr1[],int si,int mid,int ei){
         int temp[]=new int[ei-si+1];
         int i=si,j=mid+1,k=0;int inversionCount=0;
         while(i<=mid && j<=ei){
          if(arr1[i]<=arr1[j]){
            temp[k]=arr1[i];
            i++;
            
          }
          else{
            temp[k]=arr1[j];
            j++;
           
            inversionCount+=(mid+1-i);
          }
          k++;
            }
            while(i<=mid){
                temp[k++]=arr1[i++];
            }
            while(j<=ei){
                temp[k++]=arr1[j++];
            }
            for(k=0,i=si;i<=ei;k++,i++){
                arr1[i] =temp[k];           }
            return inversionCount;
         }

    
    
    public static void main(String args[]){
     String arr[]={"sun","earth","mars","mercury"};
    mergesort(arr,0,arr.length-1);
    printArr(arr);
    int nums[]={2,2,1,1,1,2,2};
    int arr1[]={1,20,6,4,5};
    System.out.println(majorityElementBruteForce(nums));
    System.out.println(majorityElementDivideAndConquer(nums,0,nums.length-1));
    System.out.println(InversionCountBruteForce(arr1));
    System.out.println(InversionCountDivideAndConquer(arr1,0,arr1.length-1));
    }
    
}
