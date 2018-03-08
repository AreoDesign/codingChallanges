package preinterview;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BracketMechanismTest {

    private String s1;
    private String s2;
    private String s3;

    @Before
    public void setUpInput() {
        s1 = new String("(a(c)");
        s2 = new String(")b");
        s3 = new String("(b(s))");
    }

    @Test
    public void test1() {
        assertFalse(BracketMechanism.solution(s1));
    }

    @Test
    public void test2() {
        assertEquals(false, BracketMechanism.solution(s2));
    }

    @Test
    public void test3() {
        assertEquals(true, BracketMechanism.solution(s3));
    }
}
