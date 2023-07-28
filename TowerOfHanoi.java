public class TowerOfHanoi {
    
    public static void tof(int n,char src,char dest,char help){
        if(n==1){
                System.out.println("Move disk "+n+" from "+src+" to "+dest);
            return;}

            tof(n-1,src,help,dest);
            System.out.println("Move disk "+n+" from "+src+" to "+dest);
        tof(n-1,help,dest,src);}
public static void main(String args[]){

tof(3,'A','C','B');
}}