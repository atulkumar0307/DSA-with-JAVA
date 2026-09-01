package OOPs;

public class Abstraction{
    public static void main(String[] args){
        /*
        Abstract class
        1. Cant not create an instance of abstract class.
        2. Can have abstract and non abstract methods.
        3. Can have constructors.
        */

        Horse H1 = new Horse();
        System.out.println(H1);
    }
}

abstract class Animal{  
    String color;
    Animal(){   // Constructor
        System.out.println("Animal constructor called...");
    }
    void eat(){     //
        System.out.println("Animal Eats");
    }
    abstract void walk();   // It will only define, but subclasses must have to define.
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called...");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
