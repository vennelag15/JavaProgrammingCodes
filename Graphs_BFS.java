import java.util.*;
public class Graphs_BFS {
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        //its unweighted graph but by default we can put weight as 1
      //0-vertex
      graph[0].add(new Edge(0,1,1));
      graph[0].add(new Edge(0,2,1));
      //1-vertex
      graph[1].add(new Edge(1,0,1));
      graph[1].add(new Edge(1,3,1));
    //2-vertex
    graph[2].add(new Edge(2,0,1));
    graph[2].add(new Edge(2,4,1));
    //3-vertex
    graph[3].add(new Edge(3,1,1));
    graph[3].add(new Edge(3,4,1));
    graph[3].add(new Edge(3,5,1));
    //4-vertex
    graph[4].add(new Edge(4,3,1));
    graph[4].add(new Edge(4,5,1));
    graph[4].add(new Edge(4,2,1));
    //5-vertex
    graph[5].add(new Edge(5,3,1));
    graph[5].add(new Edge(5,4,1));
    graph[5].add(new Edge(5,6,1));
    //6-vertex
    graph[6].add(new Edge(6,5,1));
    }
    public static void bfs(ArrayList<Edge>graph[]){
     Queue<Integer>q=new LinkedList<>();
     boolean visited[]=new boolean[graph.length];//graph.length=vertices number 
     q.add(0);//add src into queue 
     while(!q.isEmpty()){
        int curr=q.remove();
        if(!visited[curr]){//unvisited
        visited[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            q.add(e.dest);

        }

        }
     }
     System.out.println();

    }

    public static void main(String args[]){
    int V=7;
    ArrayList<Edge>graph[]=new ArrayList[V];
    createGraph(graph);
    bfs(graph);

    }
    
}
