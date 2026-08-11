package OOPs;

public class Constructor {
    public static void main(String[] args) {
        // Student S1 = new Student(); // this way java initialize construtor by defualt just to initialize this in heap memory, but if we need something more to declare while object creation then we need to declare constructor intentionally;

        Student S1 = new Student();
        Student S2 = new Student("Atul Kumar");
        Student S3 = new Student(21);
        S1.marks[0] = 65;
        S1.marks[1] = 51;
        S1.marks[2] = 76;

        Student S4 = new Student(S1);
        S1.marks[2] = 33;       // notice, how this changes the value for S2 also with deep and shallow copy;
        for(int i=0; i<3; i++){
            System.out.println(S1.marks[i]);
        }
        for(int i=0; i<3; i++){
            System.out.println(S4.marks[i]);
        }




    }
}

class Student{
    String name;
    int age;
    int marks[];

    // Copy constructor
    // Student(Student S1){    // Shallow Copy
    //     marks = new int[3];
    //     this.name = S1.name;
    //     this.age = S1.age;
    //     this.marks = S1.marks;
    // }

    // Copy constructor
    Student(Student S1){    // Deep Copy
        marks = new int[3];
        this.name = S1.name;
        this.age = S1.age;
        for(int i=0; i<3; i++){
            this.marks[i] = S1.marks[i];
        }
    }


    // Constructor, no return type and name as same as class name;

    // Having many constructor, this phenomenon known as Constructor Overloading; This also as an example of Polymorphism, having multiple forms;

    // Non-parameterized constructor;
    Student(){   
        marks = new int[3];
        System.out.println("Constructor is being initialized and called...");
    }

    // Parameterized Constructor;
    Student(String name){     
        this.name = name;
        marks = new int[3];
        System.out.println("Constructor is being initialized and called...");
    }
    Student(int age){
        marks = new int[3];
        this.age = age;
    }

}
