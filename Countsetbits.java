public class Countsetbits {
    public static int countbits(int n)
    {int count=0;
    int bitmask=1;
     while(n>0)
     {if((n&bitmask)==1)//check least significant bit
        {count++;}
      n=n>>1;
     }   
    return count;
    }
    public static void main(String args[])
    {
System.out.println(countbits(16));
    }
    
}
