package BitManipulation;

public class IthBitOperations {

    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    // set ith bit, placing 1 at position i;
    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return (n | bitmask);
    }

    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }

    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitmask = newBit<<i;
        return (n | bitmask);
    }

    // Read more about this, has logical things to understand;
    public static int clearLastithBits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static void main(String[] args) {
        // System.out.println(getIthBit(10, 3));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearLastithBits(15, 2));
    }
}
