package TwoD_Array;

import java.util.Scanner;

public class SearchInSortedTwoDArray {

    // Search for a key in row wise and col wise sorted matrix, i.e as shown in below given matrix;
    // Also known as STAIR Case;
    // Time complexity: O(n+m);
    public static void searchInSortedMatrix(int matrix[][], int key){
        int i = 0;  // row
        int j = matrix[0].length-1;     // column

        while(i<=j && j>=0){
            if(matrix[i][j] == key){
                System.out.print("Found at index: (" + i + "," + j + ")");
                return;
            }
            else if(matrix[i][j] < key){
                i++;
            }else{
                j--;
            }
        }
        System.out.print("Key Not Found");
    }
    public static void main(String[] args) {
        int matix[][] = {
                        {10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}
                    };
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        searchInSortedMatrix(matix, key);
        sc.close();
    }
}
