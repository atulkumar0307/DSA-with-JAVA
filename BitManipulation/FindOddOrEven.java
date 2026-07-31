package BitManipulation;

public class FindOddOrEven {

    // Here the concept is,
    // There is pattern in Binary numbers that even number's Lease Significant Bit / Right most bit is 0, and for odd number's its 1;
    // Right Most bit, if 0 => Even, if 1 => odd; So
    // We will apply the 'And' / '&' bitwise operator on the value with 1, as we only need to check the Right most bit, 
    // 1 & 1 = 1, Odd number;
    // 0 & 1 = 0, Even number;

    public static void oddOrEven(int n){
        int bitmask = 1; // Generally we call the value which we gonna use for bitwise operations, knowns as bitmask;
        if((n & bitmask) == 0){
            System.out.println("Number " + n + " is Even.");
        }else{
            System.out.println("Number " + n + " is Odd.");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(8);
        oddOrEven(153);   
    } 
}
