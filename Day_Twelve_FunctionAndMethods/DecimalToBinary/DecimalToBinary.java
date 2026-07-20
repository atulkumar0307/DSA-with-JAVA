package Day_Twelve_FunctionAndMethods.DecimalToBinary;

import java.util.*;

public class DecimalToBinary{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();

        int power = 0;
        int binary = 0;
        while(decimal > 0){
            int reminder = decimal % 2;
            binary = binary + (reminder * (int) Math.pow(10, power));
            power++;
            decimal /= 2;
        }
        System.out.print("Binary: " + binary);
        sc.close();
    }
}