import java.util.*;
public class PairSum2 {

    public static boolean twopointerApproach(ArrayList<Integer>list,int target){
         int pivot=-1;
         int n=list.size();
         for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivot=i;
                break;
            }
         }
        int lp=pivot+1;int rp=pivot;
        while(lp!=rp){
            int sum=list.get(lp)+list.get(rp);
            if(sum==target){
                return true;
            }
            else if(sum<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }


        }
return false;
    }
    public static void main(String args[]){
ArrayList<Integer>list=new ArrayList<>();
//sorted and rotated array
list.add(11);
list.add(15);
list.add(6);
list.add(8);
list.add(9);
list.add(10);
System.out.println(twopointerApproach(list, 16));
    }
    
}
