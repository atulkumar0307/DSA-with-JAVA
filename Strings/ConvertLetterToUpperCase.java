package Strings;

public class ConvertLetterToUpperCase {

    // Time compexity: O(n);
    public static String toUpperCase(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1; i<n; i++){
            if(str.charAt(i) == ' ' && i < n-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello, my name is atul kumar!";
        System.out.println(toUpperCase(str));
    }
}
