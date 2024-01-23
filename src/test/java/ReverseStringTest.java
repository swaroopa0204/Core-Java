import org.junit.Test;
import strings.ReverseString;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void testReverseSentence() {
        String inputSentence = "Java J2EE Reverse Me";
        String expectedOutput = "avaJ EE2J esreveR eM";

        String result = ReverseString.reverseSentence(inputSentence);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testReverseSentenceWithEmptyString() {
        String inputSentence = "";
        String expectedOutput = "";

        String result = ReverseString.reverseSentence(inputSentence);
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testReverseSentenceWithSingleWord() {
        String inputSentence = "Hello";
        String expectedOutput = "olleH";

        String result = ReverseString.reverseSentence(inputSentence);
        assertEquals(expectedOutput, result);
    }

    // Add more test cases as needed

}
