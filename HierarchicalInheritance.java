public class HierarchicalInheritance {
    public static void main(String args[]){
        Bird peacock=new Bird();
        peacock.fly();
        peacock.eat();
    }
    
}
class Animal{
String color;
void eat(){
    System.out.println("eats");
}
void breathe(){
    System.out.println("breathes");
}
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}