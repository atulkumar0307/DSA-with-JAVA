package Array;

public class LargestInArray {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;  // -ve infinity
        for(int i=0; i<numbers.length; i++){
            if(largest <= numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {2,5,3,6,1,8,3,0};
        int result = getLargest(numbers);
        System.out.print("Largest in array: " + result);

    }
}
