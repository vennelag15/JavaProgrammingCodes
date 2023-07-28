import java.util.*;
public class Hashing_IterationOnHashSet {
    public static void main(String args[]){
        HashSet<String>cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Bangalore");
        cities.add("Mumbai");
        //using iterator
        Iterator it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //using enhanced for loop
        for(String s:cities){
            System.out.println(s);
        }
    }
    
}
