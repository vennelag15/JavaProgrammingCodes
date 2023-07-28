public class Arrayspractice {
public static void transpose(int[][]array)
{int newarray[][]=new int[array.length][array[0].length];
    for(int i=0;i<array.length;i++)
    {for(int j=0;j<array[0].length;j++)
    {newarray[i][j]=array[j][i];
    System.out.print(newarray[i][j]+" ");}
System.out.println();}
   
}    
public static void main(String args[])
{int array[][]={{1,4,9},{11,4,3},{2,2,3}};
transpose(array);
}
    
}
