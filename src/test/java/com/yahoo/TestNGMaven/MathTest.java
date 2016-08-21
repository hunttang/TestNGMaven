package com.yahoo.TestNGMaven;

import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MathTest {
    @Test
    public void testMultiply() {
        Math math = Math.GetInstance();
        Mockito.when(math.Multiply(5, 10)).thenReturn(20);

        int nMulti = math.Multiply(5, 10);
        Assert.assertEquals(nMulti, 20);
    }
}