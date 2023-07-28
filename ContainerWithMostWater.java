import java.util.*;
public class ContainerWithMostWater {
     //bruteforce approach-O(n^2)
     public static int bruteforceapproach(ArrayList<Integer>height){
        int maxwater=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int water=ht*width;
                maxwater=Math.max(maxwater, water);
            }
        }
        return maxwater;
     }
     public static int twopointerApproach(ArrayList<Integer>height){
        int maxwater1=Integer.MIN_VALUE;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
           int ht=Math.min(height.get(lp),height.get(rp));
           int width=rp-lp;
           int water=ht*width;
           maxwater1=Math.max(maxwater1,water);
           if(lp<rp){
            lp++;
           }
           else{
            rp--;
           }
              
        }
        return maxwater1;
     }
    public static void main(String args[]){
       
        ArrayList<Integer>height=new ArrayList<>();
height.add(1);
height.add(8);
height.add(6);
height.add(2);
height.add(5);
height.add(4);
height.add(8);
height.add(3);
height.add(7);
System.out.println(bruteforceapproach(height));
System.out.println(twopointerApproach(height));
    }
    
}
