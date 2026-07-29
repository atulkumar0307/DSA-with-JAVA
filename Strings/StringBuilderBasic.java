package Strings;

public class StringBuilderBasic {

    // Strings are immutable, we cant change once assigned in memory,
    // Heap => Heap store the actual value of any varible or the key-value of any object;
    // Stack => It saves the reference to the value which is stored in heap;

    // Why StringBuilder instead of String?
    // When we do something like string++, then every time a new string value save in heap (copy prev then add) and then stack start refering to that heap memory;
    // But StringBuilder solves this problem, it keep updating that value instead of creating new;

   public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        // sb.toString => convert the objects into string, like Interger, Character, but not int, ch;
        for(char ch='a'; ch< 'z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);;
   }

}
