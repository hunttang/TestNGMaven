package com.yahoo.TestNGMaven;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.mockito.Mockito;

import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.*;

@PrepareForTest(App.class)
public class AppTest
{
	@Test
	public void testAdd()
	{
		App app = new App();
		int nSum = app.Add(5, 10);
		Assert.assertEquals(nSum, 15);
	}

	@Test
	public void testSub()
	{
		App app = Mockito.mock(App.class);
		Mockito.when(app.Sub(15, 10)).thenReturn(8);
		int nSub = app.Sub(15, 10);
		Assert.assertEquals(nSub, 8);
	}

    /*
	@Test
	public void testMultiply() throws Exception
	{
		PowerMockito.mockStatic(App.class);
		PowerMockito.when(App.Multiply(5, 10)).thenReturn(20);

		int nMulti = App.Multiply(5, 10);
		Assert.assertEquals(nMulti, 20);
	}
	
	@Test
	public void testVerify()
	{
		App app = new App();
		Math math = Mockito.mock(Math.class);
		
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(new Integer(1));
		input.add(new Integer(435));
		
		ArrayList<Integer> verify = new ArrayList<Integer>();
		verify.add(new Integer(1));
		verify.add(new Integer(435));
		
		app.TestVerify(input, math);
		
		Mockito.verify(math).AddArray(verify);
	}
	*/
}