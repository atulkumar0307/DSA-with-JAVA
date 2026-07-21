package Array;

public class BinarySearch {

    public static int binarySearch(int number[], int key){
        int start = 0;
        int end = number.length - 1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(number[mid] == key){
                return mid;
            }else if(number[mid]  > key ){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // For Binary Search Array must be Sorted.

        int number[] = {2,4,5,7,8,10,14,19,25};
        int findAt = binarySearch(number, 5);

        if(findAt < 0){
            System.out.print("Number not found");
        }else{
            System.out.print("Number found at index: " + findAt);
        }
    }
}
