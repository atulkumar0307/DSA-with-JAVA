import java.util.*;

public class ProductOf_twoNumber{

    public static int product(int a, int b){
        return a * b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = sc.nextInt();
        System.out.print("Enter number B: ");
        int b = sc.nextInt();
        sc.close();

        int result = product(a, b);
        System.out.println("Product: "+ result);
    }
}