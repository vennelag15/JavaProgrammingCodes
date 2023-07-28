public class KnightsTour {
    static int N=8;
    public static boolean isSafe(int row,int col,int sol[][]){
        return (row>=0 && row<N && col>=0 && col<N && sol[row][col]==-1);
    }
    public static boolean knighttour(int sol[][]){
       int x_moves[]={}
    //base case
    if(row==matrix.length-1){
     printMatrix(matrix);
    }
    for(int i=0;i<matrix[0].length;i++){
        if(isSafe(matrix,row,i)){
            matrix[row][i]='K';
            knighttour(matrix,row+1);
            matrix[row][i]='X';
        }
    }

//kaam


    }
    public static void main(String args[]){
        int sol[][]=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                sol[i][j]=-1;
            }
        }
      knighttour(sol);
    }
    
}
