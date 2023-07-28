public class OopsPracticequestions {
    public static void main(String args[]){
Complex c1=new Complex(4,5);
Complex c2=new Complex(5,6);
Complex c3=Complex.add(c1,c2);
Complex c4=Complex.subtract(c1,c2);
Complex c5=Complex.multiply(c1,c2);
System.out.println((c3.real)+" "+(c3.imag));
System.out.println((c4.real)+" "+(c4.imag));
System.out.println((c5.real)+" "+(c5.imag));
    }}
class Complex{
    int real;
    int imag;
    Complex(int r,int i){
   real=r;
   imag=i;
    }
    public static Complex add(Complex a,Complex b){
      return new Complex((a.real+b.real),(a.imag+b.imag)); 
    }
    public static Complex subtract(Complex a,Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag)); 
      }
      public static Complex multiply(Complex a,Complex b){
        return new Complex((a.real*b.real)-(a.imag*b.imag),(a.real*b.imag)+(a.imag*b.real)); 
      }
}