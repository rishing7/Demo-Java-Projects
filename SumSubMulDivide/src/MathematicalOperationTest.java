import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MathematicalOperationTest {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
	}
	@Before
	public void test1(){
		System.out.println("Before Test");
	}
	@After
	public void test2(){
		System.out.println("After Test");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("After Class");
	}
	@Test
	public void testSum(){
		assertEquals(9,MathematicalOperation.sum(4, 5));
		assertEquals(5,MathematicalOperation.sum(0, 5));
		assertEquals(6,MathematicalOperation.sum(1, 5));
		assertEquals(7,MathematicalOperation.sum(2, 5));
	}
	@Test
	public void testSub(){
		assertEquals(-1,MathematicalOperation.sub(4, 5));
	}
	@Test
	public void testMul(){
		assertEquals(20,MathematicalOperation.mul(4, 5));
	}
	@Ignore("Exception is not defined")
	@Test/*(timeout = 1000)*/(expected = NullPointerException.class)
	public void test(){
		int numbers[] = null;/*{96,21,77,78,88,14};*/
		int expected[] = {14,21,77,78,88,96};
		/*for(int i=0;i<1000000;i++){
			numbers[0] = i;
			Arrays.sort(numbers);
		}*/
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
	}
}
