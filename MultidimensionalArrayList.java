import java.util.*;
public class MultidimensionalArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        mainList.add(arr);
        ArrayList<Integer>arr1=new ArrayList<>();
        arr1.add(6);
        arr1.add(7);
        arr1.add(8);

       mainList.add(arr1);
       for(int i=0;i<mainList.size();i++){
        ArrayList<Integer>currList=mainList.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
                }
                System.out.println();
       }
       System.out.println(mainList);

       ArrayList<ArrayList<Integer>>mainOne=new ArrayList<>();
       ArrayList<Integer>list1=new ArrayList<>();
       ArrayList<Integer>list2=new ArrayList<>();
       ArrayList<Integer>list3=new ArrayList<>();
       for(int i=1;i<=5;i++){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
       }
       mainOne.add(list1);
       mainOne.add(list2);
       mainOne.add(list3);
       list2.remove(2);
       list2.remove(1);
System.out.println(mainOne);
for(int i=0;i<mainOne.size();i++){
    ArrayList<Integer>currList1=mainOne.get(i);
    for(int j=0;j<currList1.size();j++){
        System.out.print(currList1.get(j)+" ");
    }
    System.out.println();
}
    }
    
}
