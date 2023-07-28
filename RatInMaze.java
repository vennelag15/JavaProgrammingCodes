public class RatInMaze {
    public static boolean isSafe(int maze[][],int row,int col){
        if(row>=0 && row<maze.length && col>=0 && col<maze[0].length && maze[row][col]==1){
            return true;
        }
        return false;
    }
   
    public static void printMaze(int sol[][]){
        System.out.println("------------MAZE--------------");
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol[0].length;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    public static boolean ratInmaze(int maze[][],int row,int col,int sol[][]){
        //base case
        if(row==maze.length-1 && col==maze[0].length-1 && (maze[row][col]==1)){
            sol[row][col]=1;
            printMaze(sol);
            return true;
        }
 
    if(isSafe(maze,row,col)){
        if(sol[row][col]==1){
            return false;
        }
        sol[row][col]=1;
        if(ratInmaze(maze,row,col+1,sol)){
        return true;
         }
        if(ratInmaze(maze,row+1,col,sol)){
        return true;
                }
        sol[row][col]=0;
       return false;
            }
            
        return false;
        
        }
        
    
    public static void main(String args[]){
    int maze[][]={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
    int sol[][]=new int[maze.length][maze[0].length];
    if(ratInmaze(maze,0,0,sol)==false){
        System.out.println("The solution doesnt exist");
    }}
    
}
