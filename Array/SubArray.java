package Array;

public class SubArray{

    public static void subArray(int number[]){
        int totalSubarray = 0;
        for(int i=0;i < number.length; i++){
            for(int j=i; j<number.length;j++){
                for(int k=i; k<=j; k++){
                    System.out.print(number[k] + " ");
                }
                totalSubarray++;
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("Total Subarray: " + totalSubarray);
    }
    public static void main(String args[]){
        int number[] = {1,2,3,4,5};
        subArray(number);
    }
}
