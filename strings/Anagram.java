package strings;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1, charArray2)){
            System.out.println(str1 + " and "+ str2 + " are Anagrams");
        }else{
            System.out.println(str1 + " and "+ str2 + " are not Anagrams");
        }
    }
}
