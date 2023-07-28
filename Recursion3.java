public class Recursion3 {
    public static int xPowern(int x,int n){
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }
        return x*xPowern(x,n-1);
    }
    public static int xPowernOptimized(int x,int n){
        if(n==0){//base case
return 1;
        }
        int halfPower=xPowernOptimized(x,n/2);
        int halfPowerSquare=halfPower*halfPower;
        if(n%2!=0){
            halfPowerSquare=x*halfPowerSquare;
        }
return halfPowerSquare;
//Time complexity =0(log n)
    }
    public static int tilingProblem(int n){//floor size 2xn
        if(n==0 || n==1){
            return 1;
        }
        //kaam-taking choice horizontal or vertical
       int verticalways=tilingProblem(n-1);
       int horizontalways=tilingProblem(n-2);

       int totalways=verticalways+horizontalways;
       return totalways;
    }
    public static void removeDuplicates(String s,int index,StringBuilder s1,boolean map[]){

        if(index==s.length()-1){
          System.out.println(s1);  
          return; 
        }
        char currChar=s.charAt(index);
        if(map[currChar-'a']==false){
            map[currChar-'a']=true;
            s1=s1.append(currChar);
        }
        
        removeDuplicates(s,index+1,s1,map);
         }
    public static void main(String args[]){
        System.out.println(xPowern(2,10));
        System.out.println(xPowernOptimized(2,5));
        System.out.println(tilingProblem(4));
        boolean[] map=new boolean[26];
        StringBuilder s1=new StringBuilder("");
        removeDuplicates("ramchaheleelachaheramleeleram", 0,s1,map);

    }
    
    }
