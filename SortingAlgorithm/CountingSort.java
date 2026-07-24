package SortingAlgorithm;

public class CountingSort {

    // Time complexity: O(n^2), but is the number of elements is small in count then time complexity can be linear;
    public static void countingSort(int numbers[]){
        int n = numbers.length;

        // find max
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
           largest = Math.max(largest, numbers[i]);
        }

        int countArr[] = new int[largest+1];
        // get range of each number 
        for(int i=0; i<n; i++){
            countArr[numbers[i]]++;
        }

        // replace in original array
        int j=0; // to update index or original array
        for(int i=0; i<countArr.length; i++){
            while(countArr[i] > 0){
                numbers[j] = i;
                countArr[i]--;
                j++;
            }
        }

    }

     public static void printArray(int numbers[]){
        int n = numbers.length;
        for(int i=0; i<n; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int numbers[] = {3,5,2,5,3,7,2,1,9,2,1};
        countingSort(numbers);
        printArray(numbers);
    }
}
