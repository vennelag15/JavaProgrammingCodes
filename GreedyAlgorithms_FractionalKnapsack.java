import java.util.*;
public class GreedyAlgorithms_FractionalKnapsack {
    public static void main(String args[]){
     int val[]={60,100,120};
     int weight[]={10,20,30};
     int W=50;

     double ratio[][]=new double[val.length][2];
     //2D array with 0th column as index and 1st column as ratio value

     for(int i=0;i<val.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=val[i]/(double)weight[i];// take in double to include all fractional value not int
        
     }
     Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));//ascending order sorting based on ratio column done 

     //descending order ratio so reverse for loop
     int n=ratio.length;
     int capacity=W;
     int finalVal=0;
     for(int i=n-1;i>=0;i--){
        int index=(int)ratio[i][0];//this index has highest ratio
        if(capacity>=weight[index]){//include full weight of that item
            finalVal+=val[index];
         capacity-=weight[index];
        }
        else{//include fractional value
            finalVal+=ratio[i][1]*capacity;
            capacity=0;
            break;

        }

     }
     System.out.println(finalVal);

    }
    
}
