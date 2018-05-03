import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class SquareTheNumberParameterizedTest {
	private int a;
	private int expected;
	SquareTheNumber stn;
	public SquareTheNumberParameterizedTest(int expected, int a) {
		this.a = a;
		this.expected = expected;
	}
	@Before
	public void setUp(){
		stn = new SquareTheNumber();
	}
	
	@Parameters
	public static Collection<int []> testcondition(){
		int expectedNumbers[][] = {
				{9, 3},{25, 5},{16, 4}
		};
		return Arrays.asList(expectedNumbers);
	}
	
	@Test
	public void testSquare(){
		assertEquals(expected, SquareTheNumber.squareOfNumber(a));
	}
}
