package BitManipulation;

public class CountSetBits {

    // Number of bits required to represent a decimal number in binary => [log2​(n)]+1 ;​
    // So time complexity of finding set bits is => O(log n);

    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBit(15));
    }
}
