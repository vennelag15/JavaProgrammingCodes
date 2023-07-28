import java.util.*;
public class GreedyAlgorithms_JobSequencing {
    public static class Job{
        int deadline;
        int profit;
        int job_id;
        public Job(int job_id ,int deadline,int profit){
            this.deadline=deadline;
            this.profit=profit;
            this.job_id=job_id;
        }
    }
    public static void main(String args[]){
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();//array of objects of class Job
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobs,(o1,o2)->o2.profit-o1.profit);//lambda function to sort two objects
        //descending order of jobs according to profit

        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.job_id);
                time++;
            }
        }
        System.out.println("max works="+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }


        

    }
    
}
