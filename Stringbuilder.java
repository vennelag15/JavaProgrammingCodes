public class Stringbuilder {

    public static String touppercase(String str)
    {StringBuilder sb=new StringBuilder("");
     char ch=Character.toUpperCase(str.charAt(0));
     sb.append(ch);
     for(int i=1;i<str.length();i++)
     {if(str.charAt(i)==' ' && i<str.length()-1)
     {sb.append(str.charAt(i));//appending space as it is
    i++;
sb.append(Character.toUpperCase(str.charAt(i)));}//converting to uppercase the letter after space
else{
    sb.append(str.charAt(i));//remaining letters appending as it is
}} return sb.toString();}
    public static void main(String args[])
    {StringBuilder sb=new StringBuilder("");
    //append function
    for(char ch='a';ch<='z';ch++)
    {sb.append(ch);}
 System.out.println(sb);
 System.out.println(sb.length());
 String str="hi, I am vennela g";
 System.out.println(touppercase(str));
    }

    
}
