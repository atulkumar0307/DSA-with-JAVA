package TwoD_Array;

public class SpiralMatrix {
    public static void main(String[] args) {
        int matix[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16},
                        {17,18,19,20}
                    };

        int startRow = 0;
        int endRow = matix.length-1;
        int startCol = 0;
        int endCol = matix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){

            // Top => Left to Right
            for(int i=startCol; i<=endCol; i++){
                System.out.print(matix[startRow][i] + " ");
            }

            // Right => Top t Bottom
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matix[i][endCol] + " ");
            }

            // Bottom => Right to Left
            for(int i=endCol-1; i>=startCol;i--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matix[endRow][i] + " ");
            }

            // Left => Bottom to Top
            for(int i=endRow-1; i>=startRow+1; i--){
                 if(startCol == endCol){
                    break;
                }
                System.out.print(matix[i][startCol] + " ");
            }
        
            // for next iteration
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
}
