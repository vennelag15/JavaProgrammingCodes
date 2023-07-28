import java.util.*;

public class Hashing_LinkedHashMap {
    public static void main(String args[]){
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("US",50);
        lhm.put("China",150);
        
       System.out.println(lhm);
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
         hm.put("US",50);
        hm.put("China",150);
       
       System.out.println(hm);
    }
    
}
