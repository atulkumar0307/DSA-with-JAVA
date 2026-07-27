package Strings;

import java.util.Scanner;

public class IsPalindrome {

    public static boolean IsStrPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        boolean isPlaindrome = IsStrPalindrome(str);
        System.out.print("Result: " + isPlaindrome);
        
        sc.close();
    }
}
