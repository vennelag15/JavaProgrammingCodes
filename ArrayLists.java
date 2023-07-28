import java.util.*;
public class ArrayLists {
    public static void main(String args[]){
        //JAVA COLLECTION FRAMEWORK
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        //add operation
        list.add(1);//0(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9);//0(n)-coz pushes all elements after it backward
        System.out.println(list);

        //get operation-0(1)
        int element=list.get(2);
        System.out.println(element);

        //delete an element-0(n)
        list.remove(2);
        System.out.println(list);

    //set element at index-0(n)
    list.set(2,10);
    System.out.println(list);

    //contains element-0(n)
    System.out.println(list.contains(1));
    System.out.println(list.contains(11));
    
    //size of arraylist
    System.out.println(list.size());

    //iterating arraylist
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }
    System.out.println();

    //print reverse of array list
    for(int i=list.size()-1;i>=0;i--){
System.out.print(list.get(i)+" ");
    }
    System.out.println();

    //maximum element in array list
    ArrayList<Integer>list4=new ArrayList<>();
    list4.add(2);
    list4.add(5);
    list4.add(9);
    list4.add(3);
    list4.add(6);
    //to find max value
    int max=Integer.MIN_VALUE;
     for(int i=0;i<list4.size();i++){
        max=Math.max(max,list4.get(i));
     }
     System.out.println("The maximum element is "+max);
     //to swap 2 numbers
     int temp=list4.get(2);
     list4.set(2,list4.get(4));
     list4.set(4,temp);
    System.out.println("Array after swapping 2 numbers:");
     for(int i=0;i<list4.size();i++){
        System.out.print(list4.get(i)+" ");
     }
     System.out.println();
     //sorting an arraylist-optimised
     Collections.sort(list4);//by default ascending order
      System.out.println("Array after sorting in ascending order: "+list4);
      Collections.sort(list4,Collections.reverseOrder());// in descending order
      System.out.println("Array after sorting in descending order: "+list4);
    }

    
}
