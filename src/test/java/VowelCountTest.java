import org.junit.Test;
import static org.junit.Assert.*;
import strings.VowelCount;
public class VowelCountTest {

    @Test
    public void testVowelCount() {
        String name = "Swaroopa";

        // Ensure that the method correctly counts vowels
        assertEquals(4, VowelCount.countVowels(name));
    }

    @Test
    public void testVowelCountWithNoVowels() {
        String name = "Rhythm";

        // Ensure that the method handles cases with no vowels
        assertEquals(0, VowelCount.countVowels(name));
    }

    @Test
    public void testVowelCountWithMixedCase() {
        String name = "AEiouY";

        // Ensure that the method correctly counts vowels regardless of case
        assertEquals(5, VowelCount.countVowels(name));
    }

    @Test
    public void testVowelCountEmptyString() {
        String name = "";

        // Ensure that the method handles empty strings gracefully
        assertEquals(0, VowelCount.countVowels(name));
    }

    @Test
    public void testVowelCountNullString() {
        String name = null;

        // Ensure that the method handles null strings gracefully
        assertEquals(0, VowelCount.countVowels(name));
    }
}
