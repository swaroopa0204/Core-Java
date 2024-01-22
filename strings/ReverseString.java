package strings;

public class ReverseString {
    public static void main(String[] args) {
        String inputSentence1 = "Java J2EE Reverse Me";
        String[] words = inputSentence1.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            // Reverse each word and append to the result
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        System.out.println("Original Sentence: " + inputSentence1);
        System.out.println("Reversed Sentence: " + reversedSentence.toString().trim());
        System.out.println();
    }
}
