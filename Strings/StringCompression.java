package Strings;

public class StringCompression{

    // Time complexity: O(n);
    public static String compressString(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<n; i++){
            Integer count = 1;
            while(i < n-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbbbeeeeeeooSuunnnn";
        System.out.println(compressString(str));
    }
}