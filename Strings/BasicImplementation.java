package Strings;

import java.util.Scanner;

public class BasicImplementation {

    public static void printString(String str){
        int n = str.length();
        for(int i=0; i<n; i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        // String str = "This is a String.";    // it can be point to already exist value in memory if present.
        // String str1 = new String("This is a String");    // it creates new object in memory.

        // System.out.print("Enter String: ");
        // // String str = sc.next();  // Takes only first word of the Input prompt.
        // String str = sc.nextLine();     // Takes complete input prmopt.

        // printString(str);
        // System.out.print("Lenght of String: " + str.length());  // String concatenation. .

        String s1 = "Atul";
        String s2 = "Atul";     // it points out the already exist string value in memory, if exists.
        String s3 = new String("Atul");     // it creates a new object in memory.

        if (s1 == s2) {
            System.out.println("S1 and S2 are equal.");
        }else{
            System.out.println("S1 and S2 are not equal.");
        }

        if (s1 == s3) {     // compares value with ref.
            System.out.println("S1 and S3 are equal.");
        }else{
            System.out.println("S1 and S3 are not equal.");
        }

        if (s1.equals(s3)) {    // compare only value and return boolean as true or false.
            System.out.println("S1 and S3 are equal.");
        }else{
            System.out.println("S1 and S3 are not equal.");
        }
        
        sc.close();
    }
}
