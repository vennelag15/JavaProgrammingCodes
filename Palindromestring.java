public class Palindromestring {
    public static boolean ispalindrome(String str)
    {for(int i=0;i<str.length()/2;i++)
        {if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {return false;}

        }
return true;
    }
    public static void main(String args[])
    {String s="raffle";
    System.out.println(ispalindrome(s));
}
    
}
