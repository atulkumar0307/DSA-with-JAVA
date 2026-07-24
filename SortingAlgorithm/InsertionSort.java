package SortingAlgorithm;

public class InsertionSort {

    // Time complexity: O(n^2)
    public static void insertionSort(int numbers[]){
        int n = numbers.length;
        for(int i=1; i<n; i++){
            int curr = numbers[i];
            int prev = i-1;
            while(prev >= 0 && numbers[prev] > curr){
                numbers[prev+1] = numbers[prev];
                prev--;
            }
            numbers[prev+1] = curr;
        }
    }

    public static void printArray(int numbers[]){
        int n = numbers.length;
        for(int i=0; i<n; i++){
            System.out.print(numbers[i]);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int numbers[] = {4,2,6,1,3};
        insertionSort(numbers);
        printArray(numbers);
    }
}
