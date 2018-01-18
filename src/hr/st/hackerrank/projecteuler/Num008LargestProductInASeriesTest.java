package hr.st.hackerrank.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Num008LargestProductInASeriesTest {
    @Test
    public void test01() {
        Assert.assertEquals(3150, Num008LargestProductInASeries.largestProductFaster(10, 5, "3675356291"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, Num008LargestProductInASeries.largestProductFaster(10, 5, "2709360626"));
    }
}
