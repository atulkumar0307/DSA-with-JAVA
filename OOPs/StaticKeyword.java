package OOPs;

public class StaticKeyword {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.setName("Atul Kumar");
        S1.schoolName = "XYZ";
        System.out.println(S1.getName());
        Student S2 = new Student();
        System.out.print(S2.schoolName);
    }
}

class Student{
    String name;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    static String schoolName;
}