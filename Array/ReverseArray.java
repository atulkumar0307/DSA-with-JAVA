package Array;

public class ReverseArray {

    public static void reverseArray(int number[]){
        int start = 0;
        int end = number.length - 1;
        while(start < end){
            int temp = number[start]; // swapping
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int number[]){
        for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = {4,3,7,6,2,4,3};
        printArray(number);
        reverseArray(number);
        System.out.println("After reverse: ");
        printArray(number);
    }
}
