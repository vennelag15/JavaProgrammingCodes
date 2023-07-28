public class GreedyAlgorithms_Question1 {
    public static void main(String args[]){
    String s="LRRRRLLRLLRL";
    int l=0,r=0,ans=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='R'){
         r++;
        }
        else if(ch=='L'){
            l++;
        }
        if(r==l){
            ans++;
        }
      }
      System.out.println(ans);
    }
    
}
