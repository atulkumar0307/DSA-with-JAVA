package Recursion;

public class Basics {
    // Recursion basically moves from top to bottom untill base case hit, then back bottom to top;
    // 1. Define base case;
    // 2. Define work what need to perform;
    // 3. Function inner call;

    // NOTE: Better to also understand how recursion work in memory call stack;

    //Recursion is not "a function calling itself." Recursion is solving a problem by reducing it to a smaller version of the same problem, until you reach a case whose answer is already known.

    public static void printNumber(int i){  // Descending order
        if(i < 1){   // Base Case;
            return;
        }
        System.out.print(i + " ");  // Work
        printNumber(i-1);   //Function Inner call
    }

    public static void printNumberIncOrder(int i){  // Ascending order
        if(i < 1){  // Base case
            return; 
        }
        printNumberIncOrder(i-1);   // Function Inner call
        System.out.print(i + " ");  // Work
    }

    public static int factorial(int i){
        if(i == 0){
            return 1;
        }
        return i * (factorial(i-1));
    }

    public static int sumOfNumber(int i){
        if(i == 1){
            return 1;
        }
        return i + sumOfNumber(i-1);
    }

    // Space complexity: O(n)
    // Time complexity: O(2^n)
    public static int fibonacci(int i){
        if(i == 0 || i == 1){
            return i;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }

    // Space complexity: O(n)
    // Time complexity: O(n)
    public static boolean isArraySorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return isArraySorted(arr, i+1);
    }

    // Space complexity: O(n)
    // Time complexity: O(n)
    public static int firstOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
    }

    public static int lastOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static int lastOccuranceUnoptimized(int arr[], int key, int i){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurance(arr, key, i-1);
    }

    public static void main(String[] args) {
        // printNumber(20);
        // printNumberIncOrder(20);
        // System.out.print(factorial(10));
        // System.out.println(sumOfNumber(100));
        // System.out.println(fibonacci(100));
        int randomArray[] = {3,6,21,11,34,65,34,21,1};
        // System.out.println(isArraySorted(randomArray, 0));
        // System.out.println(firstOccurance(randomArray, 21, 0));
        // System.out.println(lastOccuranceUnoptimized(randomArray, 21, randomArray.length-1));
        System.out.println(lastOccurance(randomArray, 21, 1));
    }
}
