import java.util.*;
public class GreedyAlgorithms_Chocola {
    public static void main(String args[]){
        int n=4,m=6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};
        //sort arrays
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;int cost=0;
        while(h<costHor.length && v<costVer.length){
            //vertical cost less than horizontal
            if(costVer[v]<=costHor[h]){//horizontal
            cost+=costHor[h]*vp;
            hp++;
            h++;
            }
            else{//vertical
                cost+=costVer[v]*hp;
                vp++;
                v++;
            }
        }
        while(h<costHor.length){//remaining horizontal
            cost+=costHor[h]*vp;
            hp++;
            h++;

        }
        while(v<costVer.length){//remaining vertical
            cost+=costVer[v]*hp;
            vp++;
            v++;
        }
      System.out.println("Min cost="+cost);  
    }
    
}
