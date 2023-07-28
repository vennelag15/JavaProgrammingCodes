public class Sudoku {
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //for column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //for row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //for 3x3 grid
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
          //traversing grid
        for(int i=startRow;i<startRow+3;i++){
           for(int j=startCol;j<startCol+3;j++){
            if(sudoku[i][j]==digit){
                return false;
            }
           }
        }
    return true;
    }
    public static boolean sudokusolver(int sudoku[][],int row,int col){
        //base case
        if(row==8 & col==8){
            return true;
        }
        else if(row==9){//going out of sudoku after 9 so its base case
            return false;
        }

        //kaam
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokusolver(sudoku,nextRow,nextCol);
        }
        for(int digit=0;digit<=9;digit++){
         if(isSafe(sudoku,row,col,digit)){
            sudoku[row][col]=digit;//place
            if(sudokusolver(sudoku,nextRow,nextCol)){//solution exists
          return true;
            }
 sudoku[row][col]=0;
         }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<=8;i++){
            for(int j=0;j<=8;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},{4,9,0,1,5,7,0,0,2},{0,0,3,0,0,4,1,9,0},{1,8,5,0,6,0,0,2,0},{0,0,0,0,2,0,0,6,0},{9,6,0,4,0,5,3,0,0},{0,3,0,0,7,2,0,0,4},{0,4,9,0,3,0,0,5,7},{8,2,7,0,0,9,0,1,3}};
      if(sudokusolver(sudoku,0,0)){
        System.out.println("Solution exists");
        printSudoku(sudoku);
      }
      else{
        System.out.println("Solution does not exist");
      }
    }
    
}
