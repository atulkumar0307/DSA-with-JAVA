package Array;
import java.util.*;

public class Introduction{
    public static void main(String args[]){
        int arrayOfNumber[] = new int[40]; // intializatio of array
        // int manualAssign[] = {1,2,3};
        // String fruits[] = {"Apple", "Mango", "Pineapple"};
        Scanner sc = new Scanner(System.in);
        arrayOfNumber[0] = sc.nextInt();
        arrayOfNumber[1] = sc.nextInt();
        arrayOfNumber[2] = sc.nextInt();
        sc.close();

        System.out.println(arrayOfNumber[0]);
        System.out.println(arrayOfNumber[1]);
        System.out.println(arrayOfNumber[2]);

        System.out.println("Length of Array: "+ arrayOfNumber.length);

    }
}