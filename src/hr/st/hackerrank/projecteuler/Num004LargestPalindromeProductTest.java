package hr.st.hackerrank.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Num004LargestPalindromeProductTest {
    @Test
    public void test01(){
        Assert.assertEquals(101101, Num004LargestPalindromeProduct.findLargestPalindromeProduct(101110));
    }

    @Test
    public void test02(){
        Assert.assertEquals(793397, Num004LargestPalindromeProduct.findLargestPalindromeProduct(800000));
    }
}
