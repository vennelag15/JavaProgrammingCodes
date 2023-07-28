public class ShortestPathStrings {

    public static double getshortestpath(String path)
    {int x=0,y=0;
     for(int i=0;i<path.length();i++)
     {char dir=path.charAt(i);
    //south
    if(dir=='S')
    {y--;}
    //north
    else if(dir=='N')
    {y++;}
    //west
    else if(dir=='W')
    {x--;}
    //east
    else
    {x++;}
 }
 
return Math.sqrt((x*x)+(y*y));
}
  public static void main(String args[])
  {String path="NSEW";
System.out.println(getshortestpath(path));

}
    
}
