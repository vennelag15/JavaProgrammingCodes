import java.util.*;
public class GreedyAlgorithms_JobSequencingMethod2 {
    public static class Job{
        int deadline;
        int profit;
        char job_id;
        public Job(char job_id,int deadline,int profit){
            this.job_id=job_id;
            this.profit=profit;
            this.deadline=deadline;
        }
    }
    public static void main(String args[]){
        ArrayList<Job>jobs=new ArrayList<>();
        jobs.add(new Job('A',4,20));
        jobs.add(new Job('B',1,10));
        jobs.add(new Job('C',1,40));
        jobs.add(new Job('D',1,30));
        Collections.sort(jobs,(a,b)->b.profit-a.profit);
        int time=0;
        ArrayList<Character>seq=new ArrayList<>(); 
        for(int i=0;i<jobs.size();i++){
            if(jobs.get(i).deadline>time){
                seq.add(jobs.get(i).job_id);
                time++;
            }
        }
        System.out.println("Max jobs="+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }

    }
    
}
