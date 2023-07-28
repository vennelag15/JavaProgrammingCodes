public class MethodOverloading {
public static void main(String args[]){
Calculator calc=new Calculator();
System.out.println(calc.sum(1,2));
//In java by default, 1.5 is taken as double so typecast it into float
System.out.println(calc.sum((float)1.5,(float)2.5));
System.out.println(calc.sum(1,2,3));
}
    
}
class Calculator{
int sum(int a,int b){
    return a+b;
}
float sum(float a, float b){
    return a+b;
}
int sum(int a,int b,int c){
    return a+b+c;
}
}