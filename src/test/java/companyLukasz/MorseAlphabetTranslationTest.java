package companyLukasz;

import org.junit.Assert;
import org.junit.Test;

public class MorseAlphabetTranslationTest {

    @Test
    public void test1() {
        Assert.assertEquals(".- .-.. .- -- .- -.- --- - .-", MorseAlphabetTranslation.solution("ALAMAKOTA"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("ALAMAKOTA", MorseAlphabetTranslation.solution(".- .-.. .- -- .- -.- --- - .-"));
    }
}
