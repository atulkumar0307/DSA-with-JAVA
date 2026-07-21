package PatternTwo;

import java.util.*;

public class HollowRectangle {
    public static void main (String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Number of Row");
        int row = sc.nextInt();
        System.out.print("Enter Number of Column");
        int column = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || j == 1 || j == column ){
                    System.out.print("* ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
