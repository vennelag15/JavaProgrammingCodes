public class Recursion1 {
    public static void printDecreasing(int n){
        if(n==1){//base case
        System.out.println(n);
        return;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    public static void printIncreasing(int n1){//here at each level we are not returning anything to next level
        if(n1==1){//base case
            System.out.print(1+" ");
            return;
        }
       printIncreasing(n1-1);
       System.out.print(n1+" ");
    }
    public static int factorial(int n2){//here at each level we are returning int number to next level
        if(n2==0){
            return 1;
        }
        return n2*factorial(n2-1);

    }
    public static int sumofFirstNumbers(int n3){
        if(n3==0){
            return 0;
        }
        return n3+sumofFirstNumbers(n3-1);
    }
    public static int fibonacci(int n4){
        if((n4==0) || (n4==1)){return n4;
        
        }
    return fibonacci(n4-1)+fibonacci(n4-2);
   


    }
    public static void main(String args[]){
        int n=10;
        int n1=10;
        int n2=5;
        int n3=10;
        int n4=25;
        printDecreasing(n);
        printIncreasing(n1);
        System.out.println();        
        System.out.println(factorial(n2));
        System.out.println(sumofFirstNumbers(n3));
        System.out.println(fibonacci(n4));

    }

    
}
