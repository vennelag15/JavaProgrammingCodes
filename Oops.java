public class Oops {
public static void main(String args[])//static-access modifier
{Pen p1=new Pen();//created pen object p1
    p1.setColor("Blue");
    System.out.println(p1.getColor());
    p1.setTip(5);
    System.out.println(p1.tip);
    p1.setColor("Yellow");
    System.out.println(p1.getColor());
BankAccount myAcc=new BankAccount();
myAcc.username="Vennela";
// this statement is invalid because private variable can be accessed only inside class -myAcc.password="abcdefghi";
myAcc.setPassword("abcdefghi");
}
}
class BankAccount{
public String username;
private String password;
public void setPassword(String pwd)
{password=pwd;}
}

class Pen{
private String color;
int tip;
public String getColor()//public function in order to access private attribute color
{ return this.color;//this means current object which calls the function
}
public void setColor(String newcolor)//setters
{color=newcolor;}
void setTip(int newTip)
{tip=newTip;}

}

class Student{
String name;
int age;
float percentage;

void calculatePercent(int phy,int mat,int che)
{percentage=(phy+che+mat)/3;
}
}
