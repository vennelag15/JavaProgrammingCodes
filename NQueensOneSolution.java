public class NQueensOneSolution {
    public static boolean isSafe(char chessboard[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(chessboard[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<chessboard[0].length;i--,j++){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;
            }
        
        public static boolean nQueens(char chessboard[][],int row){
        //base case
        if(row==chessboard.length){
        return true;
        }
            //column loop
        for(int j=0;j<chessboard[0].length;j++){
          if(isSafe(chessboard,row,j)){
            chessboard[row][j]='Q';
            if(nQueens(chessboard,row+1)){
                return true;
            };
                chessboard[row][j]='x';//backtracking
          }
         
            }
            return false;
        }
        
        public static void printBoard(char chessboard[][]){
            System.out.println("------------------chessboard------");
            for(int i=0;i<chessboard.length;i++){
                for(int j=0;j<chessboard[0].length;j++){
                    System.out.print(chessboard[i][j]+" ");
                }
                System.out.println();
            }
        }
        
            public static void main(String args[]){
                int n=3;
                char chessboard[][]=new char[n][n];
                //initialization
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        chessboard[i][j]='x';
                    }
                }
                if(nQueens(chessboard,0)){
                    System.out.println("The solution is possible");
                    printBoard(chessboard);
                }
                else{
                    System.out.println("The solution is possible");  
                }
            }
    
}
