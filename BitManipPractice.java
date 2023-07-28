public class BitManipPractice {
    public static int fastExpo(int a)
    {int ans=1;
     int n=a;   
     while(n>0)
     {if((n&1)==1)
        {ans=ans*a;}
     a=a*a;
     n=n>>1;
     }
   return ans;
    }
    public static void swap(int a,int b)
    {a=a^b;
     b=a^b;
     a=a^b;
     System.out.println(a+" "+b);
 
}
    public static int addOne(int n)
    {
    return -~n;
    }

    public static void upperToLowerCase()
    {for(char ch='A';ch<='Z';ch++)
    {
        System.out.print((char)(ch| ' '));
    }

    }
    public static void main(String args[])
    {System.out.println(fastExpo(5));
    System.out.println(5^5);
    swap(2,3);
    System.out.println(addOne(4));
    upperToLowerCase();
}
    
}
