import java.util.*;
public class GreedyAlgorithms_ActivitySelection{
    public static void main(String args[]){
        int start[]={0,1,3,5,5,8};
        int end[]={6,2,4,7,9,9};
        //end time basis not sorted
        //sorting end[]
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lambda functionm-shortform of big function Comparator
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        //sorting on o[2] -column 2 i.e based on end time
        int maxActivities=0;
        ArrayList<Integer>ans=new ArrayList<>();
         maxActivities=1;
         ans.add(activities[0][0]);//first activity added
         int lastEnd=activities[0][2];
         for(int i=1;i<end.length;i++){//we can take till start.length also
          if(activities[i][1]>=lastEnd){//non overlapping activity Condition
            maxActivities++;
            ans.add(activities[i][0]);
            lastEnd=activities[i][2];
          }}
          System.out.println("Max activities="+maxActivities);
          for(int j=0;j<ans.size();j++){
System.out.print("A"+ans.get(j)+" ");
          }
          System.out.println();
            
         }

    
    }
