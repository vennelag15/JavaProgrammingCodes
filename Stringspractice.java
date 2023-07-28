import java.util.Arrays;
public class Stringspractice {

    public static int countlowercasevowels(String str)
    {int count=0;
    for(int i=0;i<str.length();i++)
        {if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
        {count++;}

        }
return count;
    }
    public static boolean anagrams(String str,String str1)
    {  boolean result;
        if(str.length()!=str1.length())
        {return false; }
      else{str=str.toLowerCase();
            str1=str1.toLowerCase();
            char arr[]=str.toCharArray();
            char arr1[]=str1.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr1);
            result= Arrays.equals(arr,arr1);
        }
return result;
    }
    public static void main(String args[])
    {String str="hello, i am chhotu baby and i love badaa baby";
    System.out.println(countlowercasevowels(str));
    String str1="ShradhaDidi";
    String str2="ApnaCollege";
    String str3="ShradhaDidi";
    System.out.println(str1.equals(str2) +" "+str1.equals(str3));
    String str4="ApnaCollege".replace("l","");
    System.out.println(str4);
    String str5="integery";
    String str6="triangle";
    if(anagrams(str5,str6))
    {System.out.println("Strings are anagrams");}
    else
    {System.out.println("Strings are not anagrams");}
    String str7="Vennela";//stack memory
    String str8=new String("Vennela");//memory stored in heap memory
    String str9=str8.intern();//now it is Vennela only -creates reference variable for str8-stack memory
    if(str7==str9)
    {System.out.println("Strings are equal");}
    else
    {System.out.println("Strings are not equal");}
    if(str8==str9)
    {System.out.println("Strings are equal");}
    else
    {System.out.println("Strings are not equal");}
}
}
