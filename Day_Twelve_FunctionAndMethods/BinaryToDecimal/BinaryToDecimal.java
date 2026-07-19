package Day_Twelve_FunctionAndMethods.BinaryToDecimal;

import java.util.*;

public class BinaryToDecimal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary: ");
        int binary = sc.nextInt();

        int pow = 0;
        int decimal = 0;
        while(binary > 0){
            int lastDigit = binary % 10;
            decimal = decimal + (int) (lastDigit * Math.pow(2, pow));
            
            binary = binary / 10;
            pow++;
        }
        System.out.print("Decimal: " + decimal);

        sc.close();
    }
}