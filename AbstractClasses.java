public class AbstractClasses {
    public static void main(String args[]){
Horse h=new Horse();
h.eat();
h.walk();
Chicken ch=new Chicken();
ch.eat();
ch.walk();
//Animal a=new Animal(); error-because we cannot create object for abstract classes
System.out.println(h.color);//output is brown because when child class object is created ,it first calls parent class constructor
   Mustang myhorse=new Mustang();//testing flow of constructor calling-(top-bottom:Animal->Horse->Mustang)
}
}

abstract class Animal{
    String color;
    Animal(){
color="brown";
System.out.println("Animal constructor is called");
    }
    void eat(){//non abstract  method
        System.out.println("animal eats");
    }
    abstract void walk();//abstract method-defined by other sub classes
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called"); 
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){//defining abstract walk method
        System.out.println("walks on 4 legs");
    }

}
class Chicken extends Animal{
    void changeColor(){
        color="yellow";
    }
    void walk(){//all sub classes which extends Animal class must use abstract walk method
        System.out.println("walks on 2 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}