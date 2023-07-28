import java.util.*;
public class Graphs_BipartiteGraph {
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
        graph[0].add(new Edge(0,2));
        //1-vertex
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));
        //2-vertex
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        //3-vertex
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        //4-vertex
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
    }
    public static boolean isbiPartite(ArrayList<Edge>graph[]){
        int color[]=new int[graph.length];//similar to visited array
        for(int i=0;i<color.length;i++){
            color[i]=-1;//no color
        }
        //BFS
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){//for unconnected components of graph
            if(color[i]==-1){//BFS-if no color for unconnected components -then do bfs on entire component and assign color
             q.add(i);
             color[i]=0;//by default we can give 0->yellow
             while(!q.isEmpty()){
                int curr=q.remove();
                for(int j=0;j<graph[curr].size();j++){
                    Edge e=graph[curr].get(j);
                    if(color[e.dest]==-1){
                        int nextColor=color[curr]==0? 1:0;
                        color[e.dest]=nextColor;
                        q.add(e.dest);
                    }
                    else if(color[e.dest]==color[curr]){
                        return false;
                    }
                }
             }
            }
        }
        return true;
    }
    public static void main(String args[]){
        int V=5;
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(isbiPartite(graph));
    }
}
