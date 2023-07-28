public class MethodOverriding {
    public static void main(String args[]){
Deer d=new Deer();
d.walk();// in overriding, its own class method is only called not parent class method*/
Animal a=new Animal();
a.walk();
    }
    
}
class Animal{
void  walk(){//same function with same name and same parameters
    System.out.println("walks with legs");
}

}

class Deer extends Animal{
    void walk(){//Overriding
        System.out.println("with 4 legs walks");
    }
}