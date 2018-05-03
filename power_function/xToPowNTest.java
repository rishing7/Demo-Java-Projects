import static org.junit.Assert.*;

import org.junit.Test;


public class xToPowNTest {

	@Test
	public void test1() {
		
		int actual=xToPowN.power(1,2);
		int expected=1;
		assertEquals(actual,expected);
	}
	@Test
	public void test2()
	{
		
				int actual=xToPowN.power(2,2);
				int expected=4;
				assertEquals(actual,expected);
	}
	@Test
	public void test3()
	{
		
				int actual=xToPowN.power(1000,2);
				int  expected=1000000;
				assertEquals(actual,expected);
	}
	@Test
	public void test4()
	{
	
				int actual=xToPowN.power(999,1);
				int expected=999;
				assertEquals(actual,expected);
	}
	@Test
	public void test5()
	{
	
				int actual=xToPowN.power(1001,1);
				int expected=0;
				assertEquals(actual,expected);
	}
	@Test
	public void test6()
	{
	
				int actual=xToPowN.power(0,5);
				int expected=0;
				assertEquals(actual,expected);
	}

}
