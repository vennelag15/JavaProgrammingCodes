public class GridWays {
    public static int gridways(int i,int j,int n,int m){//time complexity=O(2^(n+m))
        //base case
        if(i==n-1 && j==m-1){//condition for last cell
            return 1;
        }
        else if(i==n || j==m){//boundary cross condition
            return 0;
        }
int way1=gridways(i+1,j,n,m);
int way2=gridways(i,j+1,n,m);
return way1+way2;

    }
    public static int fact(int no){
      if(no==0){
        return 1;
      }
      return no*fact(no-1);
    }
  public static int Optimizedgridways(int n,int m){//time complexity =linear=O(n!)
    int ans=fact(n-1+m-1);
    int ans2=(fact(n-1)*fact(m-1));
    return ans/ans2;}
    
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(gridways(0,0,n,m));
        System.out.println(Optimizedgridways(n,m));
    }}