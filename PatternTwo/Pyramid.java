package PatternTwo;

public class Pyramid{

    public static void pyramidPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)+1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pyramidPattern(5);
    }
}