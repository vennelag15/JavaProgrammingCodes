public class Bitmanipulation {
    public static void isOddorEven(int n)
    {int bitmask=1;
        if((n&bitmask)==0)
        {System.out.println("Even number");}
        else
        {System.out.println("Odd number");}
    }
    public static int getIthBit(int n,int i)
    {int bitmask=1<<i;
     if((n&bitmask)==0)
     {return 0;}
    return 1; }

    public static int setIthBit(int n,int i)
    {int bitmask=1<<i;
     return n|bitmask;}
    public static int clearIthBit(int n,int i)
    {int bitmask=~(1<<i);
     return n&bitmask;}
    public static int updateIthBit(int n,int i,int newbit)
    {if(newbit==0)
        {return clearIthBit(n,i);}
    else
    {return setIthBit(n,i);}} 
    public static int clearLastIBits(int n,int i)
    {int bitmask=(-1)<<i;
     return n&bitmask;   

    }

    public static int clearRangeofIBits(int n,int i,int j)
    {int a=-1<<(j+1);
     int b=(1<<i)-1;
     int bitmask=a|b;
     return n&bitmask;     
    }
    public static boolean isPowerOf2(int n)
    {if((n&(n-1))==0)
        {return true;}
    else
    {return false;}
    }

    public static void main(String args[])
    {isOddorEven(3);
        isOddorEven(11);
        isOddorEven(14);   
       System.out.println(getIthBit(10,3));
       System.out.println(setIthBit(10,2));
       System.out.println(clearIthBit(10,1));
       System.out.println(updateIthBit(10,2,1));
       System.out.println(clearLastIBits(15,2));
       System.out.println(clearRangeofIBits(10,2,4));
       System.out.println(isPowerOf2(18));
    }
    
}
