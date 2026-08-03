package BitManipulation;

public class IsPowerOfTwo {

    //This follows a pattern
    // 2^n = 100000
    // 2^n - 1 = 011111
    // so their & must be 0;

    public static boolean isPowerOfTwo(int n){
        return ((n & (n-1)) == 0);
    }
    
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(14));
    }
}
