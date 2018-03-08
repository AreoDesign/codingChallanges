package preinterview;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PalindromTest {

    @Test
    public void test1() {
        int x = 121;
        for (int i = 1; i <= 4; i++) {
            Assert.assertTrue(Palindrom.showPalindromSolution(Palindrom.getPalindromList()).contains(x * i));
        }
    }

    @Test
    public void test2() {
        int countPalindrom = 0;
        for (Integer i : Palindrom.getPalindromList()) {
            char[] digitTab = Integer.toString(i).toCharArray();
            char[] palindromDigitTab = new char[digitTab.length];
            for (int curr = 0; curr < digitTab.length; curr++) {
                palindromDigitTab[digitTab.length - 1 - curr] = digitTab[curr];
            }
            boolean isEquals = Arrays.equals(digitTab, palindromDigitTab);
            if (isEquals){
                countPalindrom++ ;
            }
        }
        Assert.assertTrue(Palindrom.getPalindromList().size() == countPalindrom);
    }
}
