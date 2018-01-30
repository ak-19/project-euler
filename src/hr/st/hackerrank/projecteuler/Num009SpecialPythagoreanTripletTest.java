package hr.st.hackerrank.projecteuler;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class Num009SpecialPythagoreanTripletTest {
    HashMap<Integer, Integer> map;

    @Before
    public void getMap() {
        map = Num009SpecialPythagoreanTriplet.preCalculateTripletSumsUpTo3000();
    }

    @Test
    public void test01() {
        Assert.assertEquals(new Integer(60), map.get(12));
        Assert.assertEquals(null, map.get(4));
        Assert.assertEquals(new Integer(780), map.get(30));
        Assert.assertEquals(new Integer(2040), map.get(40));
        Assert.assertEquals(new Integer(5678340), map.get(646));
        Assert.assertEquals(new Integer(1620), map.get(36));
    }
}
