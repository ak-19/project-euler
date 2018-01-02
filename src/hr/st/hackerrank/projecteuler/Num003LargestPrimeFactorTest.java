package hr.st.hackerrank.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Num003LargestPrimeFactorTest {
    @Test
    public void test01() {
        Assert.assertEquals(99990001, Num003LargestPrimeFactor.findLargestPrimeFactor(1000000000001L));
    }

    @Test
    public void test02() {
        Assert.assertEquals(28969553, Num003LargestPrimeFactor.findLargestPrimeFactor(1000000000007L));
    }

    @Test
    public void test03() {
        Assert.assertEquals(29, Num003LargestPrimeFactor.findLargestPrimeFactor(13195));
    }

    @Test
    public void test04() {
        Assert.assertEquals(31, Num003LargestPrimeFactor.findLargestPrimeFactor(62));
    }

    @Test
    public void test05() {
        Assert.assertEquals(11, Num003LargestPrimeFactor.findLargestPrimeFactor(11));
    }

    @Test
    public void testBigIntegerPrime() {
        Assert.assertEquals(1000000007, Num003LargestPrimeFactor.findLargestPrimeFactor(1000000007));
    }


    @Test
    public void testLongPrime01() {
        Assert.assertEquals(32416190071L, Num003LargestPrimeFactor.findLargestPrimeFactor(32416190071L));
    }

    @Test
    public void testLongPrime02() {
        Assert.assertEquals(32416190039L, Num003LargestPrimeFactor.findLargestPrimeFactor(32416190039L));
    }

}
