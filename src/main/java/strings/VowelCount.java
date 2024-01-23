package strings;

public class VowelCount {
    public static void main(String[] args){
        String name1 = "Swaroopa";
        int count = countVowels(name1);
        System.out.println("Number of Vowels in string are "+count);
    }

    public static int countVowels(String str) {
        // Check if the string is null or empty
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
