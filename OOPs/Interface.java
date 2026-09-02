package OOPs;

public class Interface {
    public static void main(String[] args) {
        /*
        Interfaces: Blueprint of the class;
        1. All methods are public, abstract and without implementation;
        2. Used to achieve total abstraction;
        3. Variables in the interface are final, public and static;
        */
    }
}

interface ChessPlayer{
    void moves();
}

class queen implements ChessPlayer{
    public void moves(){
        System.out.println("Moves....");
    }
}
