import java.util.*;
public class PairSum1 {
    public static boolean bruteforceApproach(ArrayList<Integer>list,int target){
    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            int sum=list.get(i)+list.get(j);
            if(sum==target){
                return true;
            }
        }
    }
    return false;
    }
    public static boolean twopointerApproach(ArrayList<Integer>list,int target){
int lp=0;int rp=list.size()-1;
while(lp<rp){
    int sum=list.get(lp)+list.get(rp);
    if(sum==target){
        return true;
    }
    else if(sum<target){
        lp++;
    }
    else {
        rp--;
    }
}
   return false; }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
         for(int i=1;i<=6;i++){
            list.add(i);
         }
System.out.println(bruteforceApproach(list, 5));
System.out.println(twopointerApproach(list, 50));
    }
    
}
