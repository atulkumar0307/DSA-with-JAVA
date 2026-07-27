package Strings;

public class ShortestPath {

    public static double findShortestPath(String str){
        int n = str.length();
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            switch (ch) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default:
                    break;
            }
        }
        return Math.sqrt((x*x)+(y*y));
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.print("Shortest Path: " + findShortestPath(str));
    }
}
