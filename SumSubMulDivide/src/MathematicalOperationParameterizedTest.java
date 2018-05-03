import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class MathematicalOperationParameterizedTest {
	
	private int input1;
	private int input2;
	private int expectedOutputs;
	MathematicalOperation mo;
	public MathematicalOperationParameterizedTest(int expectedOutputs, int input1, int input2) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expectedOutputs = expectedOutputs;
	}
	@Before
	public void setUp(){
		mo = new MathematicalOperation();
	}

	@Parameters
	public static Collection<int[]> testCondition(){
		int expectedOutput[][]={
				{5,2,3},{6,1,5}
		};
		return Arrays.asList(expectedOutput);
	}
	@Test
	public void testSum(){
		assertEquals(expectedOutputs,mo.sum(input1, input2));
	}
}
