import java.util.*;
public class GreedyAlgorithms_MaxLengthChainOfPairs {
    public static void main(String args[]){
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        //sort in ascending order based on 1st column i.e second number
        int chainLen=1;//include first pair 
        int chainEnd=pairs[0][1];//last selected pair end or chain end
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){//b<c
              chainLen++;
              chainEnd=pairs[i][1];

            }
        }

System.out.println("Max length of chains= "+chainLen );


    }
    
}
