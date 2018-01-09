package hr.st.hackerrank.projecteuler;

import org.junit.Assert;
import org.junit.Test;

public class Num005SmallestMultipleTest {
    @Test
    public void test01(){
        Assert.assertEquals(6, Num005SmallestMultiple.findSmallestMultiple(3));
    }

    @Test
    public void test02(){
        Assert.assertEquals(2520, Num005SmallestMultiple.findSmallestMultiple(10));
    }

    @Test
    public void test03(){
        Assert.assertEquals(420, Num005SmallestMultiple.findSmallestMultiple(7));
    }

    @Test
    public void test04(){
        Assert.assertEquals(1, Num005SmallestMultiple.findSmallestMultiple(1));
    }

    @Test
    public void test05(){
        Assert.assertEquals(2, Num005SmallestMultiple.findSmallestMultiple(2));
    }

    @Test
    public void test06(){
        Assert.assertEquals(5342931457063200L, Num005SmallestMultiple.findSmallestMultiple(40));
    }
}
