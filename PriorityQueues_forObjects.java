import java.util.*;
public class PriorityQueues_forObjects {
    public static class Student implements Comparable<Student>{//class gets power to compare its objects using implements Comparable
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        //parent Comparable interface and child class student implements same function(compareTo)
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;//ascending order of rank sorting
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student>pq=new PriorityQueue<>();
        pq.add(new Student("A",4));
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",12));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }


    }

    
}
