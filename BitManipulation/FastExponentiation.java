package BitManipulation;

public class FastExponentiation {

    // Take time to understand this, its very logical to understand;
    // Time complexity => O(logn);
    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans =  ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    // learn about: Modular Exponentiation;

    public static void main(String[] args) {
        System.out.println(fastExpo(5, 3));
    }
}
