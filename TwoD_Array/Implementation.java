package TwoD_Array;

import java.util.*;

public class Implementation {
    public static void main(String[] args) {
        int martix[][] = new int[2][3];     // intialize 2D Matrix

        // Input in 2D Matrix
        Scanner sc =  new Scanner(System.in);
        int row = martix.length;    // to find lenght of row.
        int column = martix[0].length;  // to find length of column.
        for(int i=0; i<row; i++){
            for(int j=0;j<column; j++){
                System.out.print("Enter the value of (" + i + ", " + j + "): ");
                martix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Print 2D Matrix
        System.out.println("Matix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(martix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
