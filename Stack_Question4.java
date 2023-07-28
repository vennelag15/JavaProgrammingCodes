import java.util.*;

public class Stack_Question4{

public static int trappedWater(int height[]){
    Stack<Integer>s=new Stack<>();
    int res=0;
    for(int i=0;i<height.length;i++){

        while(!s.isEmpty() && height[s.peek()]<=height[i]){
            int pop_height=height[s.peek()];
            s.pop();
            if(s.isEmpty()){
                break;
            }
            int width=i-s.peek()-1;
            int min_height=Math.min(height[s.peek()],height[i])-pop_height;
            res+=min_height*width;
        }
        s.push(i);
    }
    return res;
}
public static void main(String args[]){
    int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trappedWater(arr));
}
}