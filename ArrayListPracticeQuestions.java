import java.util.*;
public class ArrayListPracticeQuestions {
      public static boolean isMonotonic(ArrayList<Integer>list){
       for(int i=0;i<list.size()-1;i++){
        if(list.get(i)>list.get(i+1) && list.get(list.size()-1)>list.get(0)){
            return false;
        }
        if(list.get(i)<list.get(i+1) && list.get(list.size()-1)<list.get(0)){
        return false;
        }
       }
       return true;
      }
      
      public static void lonelyNumbersPractice(ArrayList<Integer>list1){
ArrayList<Integer>ansList1=new ArrayList<>();
Collections.sort(list1);
        for(int i=1;i<list1.size()-1;i++){
if(list1.get(i-1)+1<list1.get(i) && list1.get(i+1)-1>list1.get(i)){
ansList1.add(list1.get(i));
}}
if(list1.size()==1){
  ansList1.add(list1.get(0));
}
if(list1.size()>1){
if(list1.get(0)+1<list1.get(1)){
ansList1.add(list1.get(0));
}
if(list1.get(list1.size()-1)-1>list1.get(list1.size()-2)){
  ansList1.add(list1.get(list1.size()-1));
} }
        System.out.println(ansList1);
      }


      public static int mostFrequentNumberFollowingKey(ArrayList<Integer>list2,int key){
       
        int result[]=new int[1000];
       for(int i=0;i<list2.size()-1;i++){
        if(list2.get(i)==key){
          result[list2.get(i+1)-1]++;
        }
       }
       int max=Integer.MIN_VALUE;
       int ans=0;

       for(int j=0;j<1000;j++){
       if(result[j]>max){
        max=result[j];
        ans=j+1;
       }
       }
         return ans;
      }
      public static void beautifulArrayList(int n){
        ArrayList<Integer>list=new ArrayList<>();
        divideConquer(1,1,list,n);
        System.out.println(list);
      }
      public static void divideConquer(int start,int Increment, ArrayList<Integer>list,int n){
if(start+Increment>n){
list.add(start);
return;
}
divideConquer(start, 2*Increment, list, n);

divideConquer(start+Increment, 2*Increment, list, n);
      }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(isMonotonic(list));
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(3);
        lonelyNumbersPractice(list1);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(1);
        list2.add(100);
        list2.add(200);
        list2.add(1);
        list2.add(100);
        System.out.println(mostFrequentNumberFollowingKey(list2,1));
        beautifulArrayList(4);

    }
    
}
