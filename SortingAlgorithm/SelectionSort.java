package SortingAlgorithm;

public class SelectionSort {

    // Time complexity: O(n^2)
    public static void selectionSort(int numbers[]){
        int n = numbers.length;
        
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1; j<n;j++){
                if(numbers[j] < numbers[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }
        }
    }

    public static void printArray(int numbers[]){
        int n = numbers.length;
        for(int i=0; i<n; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int numbers[] = {5,9,2,8,1,7,4,2,3};
        selectionSort(numbers);
        printArray(numbers);
    }
}
