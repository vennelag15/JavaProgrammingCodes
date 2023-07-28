
public class KeypadComb {

    public static void recursion(int pos,int len,StringBuilder sb,String s,String keypad[][]){
//base case
if(pos==len){
    System.out.println(sb.toString());
return;
}
//kaam
else{
    String []letters=keypad[Character.getNumericValue(s.charAt(pos))];
    for(int i=0;i<letters.length;i++){
        recursion(pos+1,len,sb.append(letters[i]),s,keypad);
    }}
}

    public static void keypadcombin(String keypad[][],String s){
        if(s.length()==0){
            System.out.println("");
            return;
        }
        recursion(0,s.length(),new StringBuilder(),s,keypad);
        }
    
    public static void main(String args[]){
        String s="2";
        String keypad[][]={{},{},{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}};
    
        keypadcombin(keypad,s);
    }
    
}
