public class RecursionBinaryStrings {
    //with string builder it becomes complex as it gets appended everytime, so use string
    public static void BinaryStringProblem(int n,int lastplace,String str){
       if(n==0){//base case
        System.out.println(str);
        return;
    }
    //kaam
    BinaryStringProblem(n-1,0,str+"0");
    if(lastplace==0){
        BinaryStringProblem(n-1,1,str+"1");
    }

    }
    public static void question1(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        //kaam
        if(arr[i]==key){
            System.out.println(i);
        }
        question1(arr,key,i+1);
    }
    public static void question2(int no,String s[]){
        if(no==0){
           return;
        }
         //kaam
         question2(no/10,s);
        System.out.println(s[no%10]);}

        public static int question3(String s,int i){
            if(i==s.length()){
                return i;
            }
            return question3(s,i+1);
        }
        public static void question4(String s,int i,StringBuilder s1,int i1){
             
            //kaam
            if(s1.charAt(i1)==s1.charAt(s1.length())){
                System.out.println(s1);
            }
            question4(s,i+1,s1.append(s.charAt(i+1)));
            
        }
    
    public static void main(String args[]){
  BinaryStringProblem(3,0,"");
  int arr[]={3,2,4,5,6,2,7,2,2};
  int key=2;
  question1(arr,key,0);
  int number=1947;
  String[] s={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
  question2(number,s);
  System.out.println(question3("abcde",0));

    }
    
}
