import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem4Test {

    @Test
    public void testSolve() throws Exception {
        System.out.println(Problem4.solve());
    }

    @Test
    public void testIsNumberPalindrome() throws Exception {
        Assert.assertTrue(Problem4.isNumberPalindrome(9009));
    }
}