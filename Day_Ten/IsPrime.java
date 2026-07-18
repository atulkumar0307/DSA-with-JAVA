package Day_Ten;
import java.util.*;

public class IsPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        if(number <= 1){
            System.out.println("Not Prime");
        } else{
            boolean isPrime = true;
            for(long i = 2; i * i <= number; i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(!isPrime){
                System.out.print("Not Prime");
            }else{
                System.out.print("Is Prime");
            }
        }
        sc.close();
    }
}
