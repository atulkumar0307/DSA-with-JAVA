package OOPs;

public class Constructor {
    public static void main(String[] args) {
        // Student S1 = new Student(); // this way java initialize construtor by defualt just to initialize this in heap memory, but if we need something more to declare while object creation then we need to declare constructor intentionally;

        Student S1 = new Student();
        Student S2 = new Student("Atul Kumar");
        Student S3 = new Student(21);

    }
}

class Student{
    String name;
    int age;

    // Constructor, no return type and name as same as class name;

    // Having many constructor, this phenomenon known as Constructor Overloading; This also as an example of Polymorphism, having multiple forms;

    // Non-parameterized constructor;
    Student(){   
        System.out.print("Constructor is being initialized and called...");
    }

    // Parameterized Constructor;
    Student(String name){     
        this.name = name;
        System.out.print("Constructor is being initialized and called...");
    }
    Student(int age){
        this.age = age;
    }

}
