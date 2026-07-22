package ArrayTwo;

public class MaxSumSubArray {

    // Approach one: Brute Force, time complexity: O(n cube)
    public static void maxSumSubArrayBrute(int number[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            for(int j=i; j<number.length; j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += number[k];
                }
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max Sum of subarray by brute force: " + maxSum);
    }

    // Approach two:  Prefix Sum, time complexity: O(n 2)
    public static void maxSumSubArrayPrefix(int number[]){
        int MaxSum = Integer.MIN_VALUE;
        int prefixArray[] = new int [number.length];

        prefixArray[0] =number[0];
        for(int i=1; i< number.length; i++){
            prefixArray[i] = prefixArray[i-1] + number[i];
        }
        // for(int i=0; i< prefixArray.length; i++){
        //     System.out.print(prefixArray[i]+ " ");
        // }
        // System.out.println("");

        for(int i=0; i<prefixArray.length; i++){
            int currentSum = 0;
            for(int j=i; j<prefixArray.length; j++){
                currentSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i-1];
                if(MaxSum < currentSum){
                    MaxSum = currentSum;
                }
            }
        }
        System.out.println("Max Sum of subarray by prefix sum: " + MaxSum);
    }

    // Approach Three:  Kadane's Algorithm, time complexity: O(n)
    public static void maxSumSubArrayKadane(int number[]){
        int MaxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0; i<number.length; i++){
            currentSum += number[i];
            if(currentSum < 0){
                currentSum = 0;
            }
            if(MaxSum < currentSum){
                MaxSum = currentSum;
            }
        }
        System.out.println("Max Sum of subarray by Kadane Algorithm: " + MaxSum);
    }

    public static void main(String args[]){
        int number[] = {2, 6, -3, 1, -8, 4};
        maxSumSubArrayBrute(number);
        maxSumSubArrayPrefix(number);
        maxSumSubArrayKadane(number);
    }
}
