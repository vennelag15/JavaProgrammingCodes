import java.util.*;
public class Hashing_ItineraryForTickets {
    public static String getStart(HashMap<String,String>map){
        HashMap<String,String>revMap=new HashMap<>();
        for(String key:map.keySet()){
          revMap.put(map.get(key),key);
        }
        for(String key:map.keySet()){
          if(!revMap.containsKey(key)){
             return key;//starting point
          }
        }
        return null;

    }
    public static void main(String args[]){
        HashMap<String,String>map=new HashMap<>();
        map.put("Chennai","Banagalore");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");
        //starting point
        String start=getStart(map);
        System.out.print(start);
        for(String s:map.keySet()){
             System.out.print("->"+map.get(start));
             start=map.get(start);
        }

    }
    
}
