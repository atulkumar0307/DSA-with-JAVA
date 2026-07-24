package SortingAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class InBuildSort {

    public static void printArray(int numbers[]){
        int n = numbers.length;
        for(int i=0; i<n; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
    }

    public static void printArray(Integer numbers[]){
        int n = numbers.length;
        for(int i=0; i<n; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        // int numbers[] = {4,2,7,5,1,3,9};
        // Arrays.sort(numbers);  // Ascending Order, Time complexity O(log n);
        // Arrays.sort(startIndex, endIndex, array[]);  // to sort a range of array;

        // To sort in descending order use Collection.reverseOrder();
        // Reverse order works on Objects, so we have to take array type in Integer form which is object rather than int;
        // reverseOrder() internally use comparative operation (output in true false) i.e. for asc: a-b, for desc: b-a 
        Integer numbers[] = {4,2,7,5,1,3,9};
        Arrays.sort(numbers, Collections.reverseOrder());
        // Arrays.sort(arr[], startIndex, endIndex, Collections.reverseOrder()); // to sort a range of array;
        printArray(numbers);
    }
}
