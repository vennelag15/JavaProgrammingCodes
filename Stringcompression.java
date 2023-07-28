public class Stringcompression {
    public static String compress(String str)
    {String newstr="";
    for(int i=0;i<str.length();i++)
    {Integer count=1;
    while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
    {count++;
        i++;}
    newstr+=str.charAt(i);
    if(count>1)
    {newstr+=count.toString();}    

    }
return newstr;
    }

    public static String compressusingstringbuilder(String str)//better time complexity than with string
    {StringBuilder sb=new StringBuilder("");
    for(int i=0;i<str.length();i++)
    {Integer count=1;//so that Integer class can be converted to string 
        
     while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
     {count++;
      i++; } 
     sb.append(str.charAt(i)); 
     if(count>1)
     {sb.append(count.toString());}


    }
return sb.toString();

    }
    public static void main(String args[])
    {String str="aaabbcccdd";
   System.out.println(compress(str));
   System.out.println(compressusingstringbuilder(str));
}
}