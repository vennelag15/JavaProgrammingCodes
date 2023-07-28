import java.util.*;

public class Queue_Question3{
    public static class Job{
        char job_id;
        int deadline;
        int profit;
        public Job(char job_id,int deadline,int profit){
            this.job_id=job_id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void jobsequencing(ArrayList<Job>arr){
        int n=arr.size();
        Collections.sort(arr,(a,b)->{return a.deadline-b.deadline;});//arrange deadlines in ascending order
        ArrayList<Job>res=new ArrayList<>();
        PriorityQueue<Job>q=new PriorityQueue<>((a,b)->{return b.profit-a.profit;});//arrange profits in ascending order
       for(int i=n-1;i>=0;i--){
        int slot_available;
        if(i==0){
            slot_available=arr.get(i).deadline;
        }
        else{
            slot_available=arr.get(i).deadline-arr.get(i-1).deadline;
        }
        q.add(arr.get(i));
        while(!q.isEmpty() && slot_available>0){
            Job job=q.remove();
            slot_available--;
            res.add(job);
        }}
        Collections.sort(res,(a,b)->{return a.deadline-b.deadline;});
        for(Job j :res){
        System.out.print(j.job_id+" ");
        }
    }
    public static void main(String args[]){
        ArrayList<Job>arr=new ArrayList<>();
        arr.add(new Job('a',2,100));
        arr.add(new Job('b',1,19));
        arr.add(new Job('c',2,27));
        arr.add(new Job('d',1,25));
        arr.add(new Job('e',3,15));
        jobsequencing(arr);
    }
}
