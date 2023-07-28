

public class Arrays1 {
    public static int minsearch(int[]nums)
    {int left=0,right=nums.length-1;
    while(left<right)
    {int mid=left+(right-left)/2;
    if(mid>0 && nums[mid-1]>nums[mid])
    {return mid;}
    else if(nums[left]<=nums[mid] && nums[mid]>nums[right])
    {left=mid+1;}
    else
    {right=mid-1;}

}
return left;
    }

    public static int search(int[] nums,int left,int right,int target)
    {int l=left,r=right;
    while(l<=r)
    {int mid=l+(r-l)/2;
    if(nums[mid]==target)
{return mid;}
   else if(nums[mid]>target)
   {r=mid-1;}
   else
   {l=mid+1;}

}

return -1;

    }
    public static void main(String args[])
    {int nums[]={1};
    int target=0;
    int min=minsearch(nums);
    if(nums[min]<= target && target<=nums[nums.length-1])
    {int index=search(nums,min,nums.length-1,target);
    System.out.println(index);}
else
    {int index=search(nums,0,min,target);
    System.out.println(index);}


    }}