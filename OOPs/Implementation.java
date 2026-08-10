package OOPs;

public class Implementation {
    public static void main(String[] args) {

        Pen p1 = new Pen(); // type of constructor which create the object in heap memory with its properties;

        // without getter, setter;-------------
        // p1.setColor("Red");
        // System.out.println(p1.color);
        // p1.setTip(7);
        // System.out.println(p1.tip);
        // p1.color = "Green"; // Can reassign;
        // System.out.println(p1.color);


        //with getter and setter;------------
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());
        // p1.setTip(3);
        // System.out.println(p1.gettip());


        // Access Modifiers;----------------
        // BankAccount myBankAcc = new BankAccount();
        // myBankAcc.username = "Atul_Kumar";
        // System.out.println(myBankAcc.username);
        // myBankAcc.password = "Atul@123"; // Private Access Modifier: The field BankAccount.password is not visible;
        // myBankAcc.setPassword("Atul@123");
    }
    
}

// Access Modifiers => Private, Default, Protected, Public;
class BankAccount {
    public String username;
    private String password;    // no-one can access outside this class;
    public void  setPassword(String newPass){
        password = newPass;
    }
}

// Normal code
// class Pen {
//     String color;
//     int tip;

//     void setColor(String newColor){
//         color = newColor;
//     }
//     void setTip(int newTip){
//         tip = newTip;
//     }
// }

// When properties are private then we can use setter and getter to get and set their value, rather than accessing the properties directly;
class Pen {
    private String color;
    private int tip;

   String getColor(){
    return this.color;  // This keyword refer to the 
   };
   int gettip(){
    return this.tip;
   }

   void setColor(String color){
    this.color = color;
   }
   void setTip(int tip){
    this.tip = tip;
   }

}

class Student {
    String name;
    int age;
    float percentage;

    float averageMarks(int math, int phy, int chem){
        return (math + phy + chem) / 3;
    }
}
