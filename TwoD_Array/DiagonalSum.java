package TwoD_Array;

public class DiagonalSum {
    public static void main(String[] args) {
        int matix[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                    };
        // Primary Diagonal => From left top to right bottom
        //  Secondary Diagonal => From right top to left bottom

        int n = matix.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            // primary
            sum += matix[i][i];

            // secondary
            // i + j = n-1    , only for secondary diagonal
            // j = n-1-i

            if(i != (n-1-i)){       // to avoid repeat sum of common mid value of both diagonal (if any);
                sum += matix[i][n-1-i];
            }
        }
        System.out.print("Sum on Primary and Secondary Diagonal: "+ sum);
    }   
}
