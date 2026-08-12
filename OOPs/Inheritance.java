package OOPs;

public class Inheritance {
    // Inheritance is when properties & methods of base class are passed on to a derived class.

    public static void main(String[] args) {
        Dog D1 = new Dog();
        D1.eats();
        D1.Feeder();
        D1.Run();
    }

}

// Parent Class / Base Class;
class Animal{
    String color;

    void eats(){
        System.out.println("Eats...");
    }
    void breathe(){
        System.out.println("Breathe...");
    }
}


// Child Class / Derived Class;
// Single level inheritance;
class Mammals extends Animal{  // Mammals class inherites the properites of Animal class;
    int legs;

    void Feeder(){
        System.out.println("Milk Feeder...");
    }
}

// Multi level inheritance
class Dog extends Mammals{   // Dog class inherites the properites of Mammals class;
    String breed;

    void Run(){
        System.out.println("Runs...");
    }
}

// Hierarchial Inheritance => When Multiple classes inherit the properties of a same class;
class Fish extends Animal{  // Fish class inherites the properites of Animal class;
    int fin;

    void Swim(){
        System.out.println("Swims...");
    }
}

// Hybrid Inheritance => Multi level inheritance + Hierarchial inheritance;

// Multiple Class => Where a class inherit the properties of more than one class; As this is not being used direclty in java in heritance, but in c++;
