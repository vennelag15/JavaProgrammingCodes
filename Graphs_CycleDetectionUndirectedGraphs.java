import java.util.*;

public class Graphs_CycleDetectionUndirectedGraphs{
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
   //0-vertex
    graph[0].add(new Edge(0,1));
   //graph[0].add(new Edge(0,2));
   graph[0].add(new Edge(0,3));
   //1-vertex
   graph[1].add(new Edge(1,0));
   graph[1].add(new Edge(1,2));
   //2-vertex
   //graph[2].add(new Edge(2,0));
   graph[2].add(new Edge(2,1));
   //3-vertex
   graph[3].add(new Edge(3,4));
   graph[3].add(new Edge(3,0));
   //4-vertex
   graph[4].add(new Edge(4,3));
}

public static boolean detectCycle(ArrayList<Edge>graph[]){
    boolean visited[]=new boolean[graph.length];
    for(int i=0;i<graph.length;i++){//loop because there may be unconnected components in graph
        if(!visited[i]){//if not visited
       if(detectCycleUtil(graph,visited,i,-1)){//-1 as starting node doesnt have parent
        return true;//cycle exists in any one component of graph
       }
        }
    }
    return false;
}

public static boolean detectCycleUtil(ArrayList<Edge>graph[],boolean visited[],int curr,int parent){
//similiar to dfs
visited[curr]=true;

for(int i=0;i<graph[curr].size();i++){
    //3 cases of neighbours
    Edge e=graph[curr].get(i);
    if(visited[e.dest]==false){//unvisited neighbour
        if(detectCycleUtil(graph,visited,e.dest,curr)){
return true;
        }
     
    }
    else if(visited[e.dest] && e.dest!=parent){//visited neighbour and is not parent
        return true;
    }
}
return false;
}


public static void main(String args[]){
    int V=5;
    ArrayList<Edge>graph[]=new ArrayList[V];
    createGraph(graph);
     System.out.println(detectCycle(graph));
}



}