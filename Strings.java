import java.util.*;
public class Strings {

public static String substring(String str,int si,int ei)//logic for substring function
    {String substr="";
    for(int i=si;i<ei;i++)
    {substr+=str.charAt(i);}
return substr;
    }
    public static void main(String args[])
    {String s="Badaa baby";
    String s1=new String("Badaa baby");//string declaration
    String s3="Badaa baby";
     Scanner sc=new Scanner(System.in);
    String s2=sc.nextLine();//string as i/p
    System.out.println(s2);
    System.out.println(s.length());//length of string
    System.out.println(s1.length());
    String full=s+" "+s1;//string concatenation
    System.out.println(full);
    for(int i=0;i<full.length();i++)//charAt method
    {System.out.print(full.charAt(i)+" ");}
System.out.println();
for(int i=0;i<full.length();i++)//only consonants
{if(full.charAt(i)=='a' ||full.charAt(i)=='e' ||full.charAt(i)=='i' || full.charAt(i)=='o' || full.charAt(i)=='u')
{continue;}
else
{System.out.print(full.charAt(i)+" ");}
}
System.out.println();

if(s==s3)//strings comparison
{System.out.println("Strings are equal");
}
else
{System.out.println("Strings are unequal");}

if(s==s1)//strings comparison
{System.out.println("Strings are equal");
}
else
{System.out.println("Strings are unequal");}

if(s.equals(s1))//equals function to compare string value-returns boolean type
{System.out.println("Strings are equal");
}   
else
{System.out.println("Strings are unequal");}
String str="HelloWorld";
System.out.println(substring(str,0,5));//inbuilt substring function
System.out.println(str.substring(0,5));
//largest string using compareTo function
String fruits[]={"apple","mango","banana"};
String largest=fruits[0];
for(int i=1;i<fruits.length;i++)
{
if(largest.compareToIgnoreCase(fruits[i])<0)
{largest=fruits[i];}
}
System.out.println(largest);
}}
