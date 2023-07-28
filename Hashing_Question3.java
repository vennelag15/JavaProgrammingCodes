import java.util.*;
public class Hashing_Question3 {
    public static void main(String args[]){
        String s="tree";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
     PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>((a,b)->a.getValue()==b.getValue()?a.getKey()-b.getKey():b.getValue()-a.getValue());
      for(Map.Entry<Character,Integer>e:map.entrySet()){
        pq.add(e);
      }
      StringBuilder res=new StringBuilder();
      while(!pq.isEmpty()){
        char ch=pq.remove().getKey();
        int val=map.get(ch);
        while(val!=0){
            res.append(ch);
            val--;
        }



      }
      System.out.println(res.toString());

        
    }
    
}
