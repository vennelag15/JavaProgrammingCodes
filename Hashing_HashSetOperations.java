import java.util.*;
public class Hashing_HashSetOperations {
    public static void main(String args[]){
        HashSet<Integer>hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);
        System.out.println(hs.size());
        hs.remove(2);
        if(hs.contains(2)){
            System.out.println("Set contains");
        }
        else{
                 System.out.println("Set doesnt contain");
      }
      hs.clear();
      System.out.println(hs.size());
      System.out.println(hs.isEmpty());
      
    }
    
}
