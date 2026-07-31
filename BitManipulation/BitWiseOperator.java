package BitManipulation;

public class BitWiseOperator {
    public static void main(String args[]){
        // Decimal => 16, 8, 4, 2, 1 = 31
        // Binary => 1, 1, 1, 1, 1 = 31

        // And '&' =>  Both need to be true or 1, to get 1, otherwise 0 (Works on two bit);
        
        // Or '|' => At least one need to be true or 1, to get 1, otherwise 0 (Works on two bit);

        // Xor '^' => Only one need to be true to get 1, otherwise 0 (Works on two bit);

        // One's Compliment or Not Operation '~' =>  (Works on single bit);, ~0 => 1, ~1 => 0;
        // in memory number saves like i.e. 5 => 00000101, then here
        // 'Least significant' bit is 1, which is the 'Right most bit';
        // 'Most significant bit' is 0, which is the 'Left most bit'; 
        // Left most bit is used to check the number weather it is positive or negative, if 0 => position, if 1 => negative
        // One's compliment of 5 (00000101) is 11111010; 
        // here the left most bit shows it become a negative number and to get the magnitude (value) of negative number we get its 2's compliment;
        // For 2's compliment we do the 1's compliment of 1's compliment then add value 1 from Right most bit;
        // 11111010, its 1's => 00000101, add 1, 00000101 + 1 => 00000110, then in decimat it is 6 and we did its 2's compliment because this was negative so it becomes => -6;
        // So we can say ~5 = -6;
        // Also one more example, ~0 = -1; (Hint: to get ~A, first write it in 8 bit, 00000000, then if negative then do 2's compliment of 1's compliment and in result keep -ve sign);


        // Binary Left Shift: A<<B
        // shift value A by B places;
        // For example, 5<<2, shift value of 5 by 2 places, 
        // First convert value A into binary and take it at least in 6 bit digit, 5 => 000101
        // remove 2 bit from left, => 0101, then fil the empty spaces with 0s bit in the right of same number as we deleted, 0101_ _ => 010100
        // then convert this binary into decimal, 010100 => 20;
        // 5<<2 => 20;
        // To get the final value there is a formula also, A<<B = A * (2^B),
        // By formula, 5<<3 => 5 * (2^3) => 40;


        // Binary Right Shift: A>>B
        // Same shift as we did in binary left shift but here remove from Right side;
        // Formula, A>>B => A / (2^B)
        // For example, 6>>1 => 6 / (2^1) = 3;

    }
}