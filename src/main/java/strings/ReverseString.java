package strings;

public class ReverseString {

    public static String reverseSentence(String inputSentence) {
        String[] words = inputSentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            // Reverse each word and append to the result
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String inputSentence1 = "Java J2EE Reverse Me";
        String reversedSentence = reverseSentence(inputSentence1);

        System.out.println("Original Sentence: " + inputSentence1);
        System.out.println("Reversed Sentence: " + reversedSentence);
        System.out.println();
    }
}
