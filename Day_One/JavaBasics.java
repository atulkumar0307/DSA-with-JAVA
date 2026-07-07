package Day_One;
import java.util.*;

public class JavaBasics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Your Name: " + name);
        sc.close();
    }
}