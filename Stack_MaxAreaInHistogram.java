import java.util.*;
public class Stack_MaxAreaInHistogram {
    public static void maxArea(int heights[]){
        int maxArea=0;
        int nextsmallerleft[]=new int[heights.length];
        int nextsmallerright[]=new int[heights.length];
        
        Stack<Integer>s=new Stack<>();
        //Next smaller right
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
s.pop();
            }
            if(s.isEmpty()){
                nextsmallerright[i]=heights.length;
            }
            else{
                nextsmallerright[i]=s.peek();
            }
            s.push(i);
        }
        //Next Smaller left
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nextsmallerleft[i]=-1;
            }
            else{
                nextsmallerleft[i]=s.peek();
            }
            s.push(i);
        }

        //current area: width=nsr[i]-nsl[i]-1
        for(int i=0;i<heights.length;i++){
            int height=heights[i];
            int width=nextsmallerright[i]-nextsmallerleft[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea,currArea);
        }
        System.out.println("Max Area in Histogram= "+maxArea);

    }
    
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};//heights in histogram
          maxArea(arr);

    }
}
