package ArrayTwo;

public class TrappingRainWater {

    public static int trappedRainWater(int numbers[]){
        int n = numbers.length;

        // Max Left Boundary
        int maxLeft[] = new int[n];
        maxLeft[0] = numbers[0];
        for(int i=1; i<n; i++){
            maxLeft[i] = Math.max(numbers[i], maxLeft[i-1]);
        }

        // Max Right Boundary
        int maxRight[] = new int[n];
        maxRight[n-1] = numbers[n-1];
        for(int i=n-2; i>=0; i--){
            maxRight[i] = Math.max(numbers[i], maxRight[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);  // Water Level
            trappedWater += waterLevel-numbers[i];   // Trapped Water  
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int tower[] = {4,2,0,6,3,2,5};
        System.out.print("Trapped Water: "+ trappedRainWater(tower));
    }
}
