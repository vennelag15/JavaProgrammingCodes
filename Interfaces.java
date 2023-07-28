public class Interfaces {
    public static void main(String args[]){
Queen q=new Queen();
q.moves();
Bear b=new Bear();
b.eat();
    }
    
}

interface Herbivore{
void eat();
}
interface Carnivore{
void sleep();
}
class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("Eats grass");
    }
    public void sleep(){
        System.out.println("Sleeps in night");
    }
}



interface ChessPlayer{
    void moves();//by default abstract and public 
}
class Queen implements ChessPlayer{
    public void moves(){//have to write public coz method implemented in abstract is public
        System.out.println("up,down,left,right,diagonal(in all directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(only one step)");
    }
}