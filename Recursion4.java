public class Recursion4 {
    public static int friendsPairing(int n){
        if(n==1 || n==2){//base case
            return n;
        }
        int singleways=friendsPairing(n-1);
        int pairingways=(n-1)*(friendsPairing(n-2));
        int totalways=singleways+pairingways;
        return totalways;

    }
    public static void SubsequencesOfString(String str,int index,String newString){
        if(index==str.length()){
System.out.println(newString);
return;
        }
        char currChar=str.charAt(index);
        //to add
        SubsequencesOfString(str,index+1,newString+currChar);
        //to not add
        SubsequencesOfString(str,index+1,newString);

    }
    public static void main(String args[]){
      System.out.println(friendsPairing(3));
    SubsequencesOfString("abc", 0, " ");
    }
    
}
