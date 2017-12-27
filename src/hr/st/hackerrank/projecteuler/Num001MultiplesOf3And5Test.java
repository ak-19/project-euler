package hr.st.hackerrank.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Num001MultiplesOf3And5Test {
    @Test
    public void test01(){
        Assert.assertEquals(23, Num001MultiplesOf3And5.getSumOfMultiplies(10));
    }

    @Test
    public void test02(){
        Assert.assertEquals(2318, Num001MultiplesOf3And5.getSumOfMultiplies(100));
    }

    @Test
    public void testPerformance01(){
        long start  = System.currentTimeMillis();
        long sum =  Num001MultiplesOf3And5.getSumOfMultiplies(1000000000);
        long end = System.currentTimeMillis();
        double runningTime = ((double)end - start) / 1000;
        Assert.assertTrue(runningTime < 0.6);
    }
}
