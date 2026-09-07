package Recursion;

public class Basics {
    // Recursion basically moves from top to bottom untill base case hit, then back bottom to top;
    // 1. Define base case;
    // 2. Define work what need to perform;
    // 3. Function inner call;

    public static void printNumber(int i){
        if(i==1){   // Base Case;
            System.out.print(1 + " ");
            return;
        }
        System.out.print(i + " ");  // Work
        printNumber(i-1);   //Function Inner call
    }

    public static void main(String[] args) {
        printNumber(10);
    }
}
