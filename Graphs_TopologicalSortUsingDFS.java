import java.util.*;
public class Graphs_TopologicalSortUsingDFS {
    public static class Edge{
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //2-vertex
        graph[2].add(new Edge(2,3));
        //3-vertex
        graph[3].add(new Edge(3,1));
        //4-vertex
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));
        //5-vertex
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,1));

    }
    public static void topologicalSort(ArrayList<Edge>graph[]){
        boolean visited[]=new boolean[graph.length];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){//if unvisited
             topologicalSortUtil(graph,i,visited,s);//gives sorted order in stack
            }
        }
        while(!s.isEmpty()){//print elements in stack
            System.out.print(s.pop()+"   ");

        }
    }
    public static void topologicalSortUtil(ArrayList<Edge>graph[],int curr,boolean visited[],Stack<Integer>s){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                topologicalSortUtil(graph,e.dest,visited,s);
            }
        }
        s.push(curr);
    }
    public static void main(String args[]){
   int V=6;
   ArrayList<Edge>graph[]=new ArrayList[V];
   createGraph(graph);
topologicalSort(graph);

    }
    
}
